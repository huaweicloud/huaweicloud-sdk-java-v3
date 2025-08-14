package com.huaweicloud.sdk.cc.v3;

import com.huaweicloud.sdk.cc.v3.model.ApplyCentralNetworkPolicyRequest;
import com.huaweicloud.sdk.cc.v3.model.ApplyCentralNetworkPolicyResponse;
import com.huaweicloud.sdk.cc.v3.model.AssociateBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.AssociateBandwidthPackageRequestBody;
import com.huaweicloud.sdk.cc.v3.model.AssociateBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.AssociateGlobalConnectionBandwidthInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.AssociateGlobalConnectionBandwidthInstanceRequestBody;
import com.huaweicloud.sdk.cc.v3.model.AssociateGlobalConnectionBandwidthInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.AssociateSiteConnectionBandwidthRequestBody;
import com.huaweicloud.sdk.cc.v3.model.AssociateSiteNetworkBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.AssociateSiteNetworkBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.AttachmentInstanceTypeEnum;
import com.huaweicloud.sdk.cc.v3.model.BandwidthTypeEnum;
import com.huaweicloud.sdk.cc.v3.model.BatchCreateGcbResourceTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.BatchCreateGcbResourceTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.BatchDeleteGcbResourceTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.BatchDeleteGcbResourceTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.CentralNetworkCapabilityEnum;
import com.huaweicloud.sdk.cc.v3.model.CentralNetworkConnectionStateEnum;
import com.huaweicloud.sdk.cc.v3.model.CentralNetworkPolicyStateEnum;
import com.huaweicloud.sdk.cc.v3.model.CentralNetworkQuotaKeyEnum;
import com.huaweicloud.sdk.cc.v3.model.CentralNetworkStateEnum;
import com.huaweicloud.sdk.cc.v3.model.ConnectionTypeEnum;
import com.huaweicloud.sdk.cc.v3.model.CountGcbResourceByTagRequest;
import com.huaweicloud.sdk.cc.v3.model.CountGcbResourceByTagResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateAuthorisationRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateAuthorisationRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateAuthorisationResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateBandwidthPackageRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkErRouteTableAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkErRouteTableAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkErRouteTableAttachmentsRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkGdgwAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkGdgwAttachmentRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkGdgwAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkPolicyRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkPolicyRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkPolicyResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateCloudConnectionRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateDeleteGcbTagsRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateGcbResourceTagRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateGcbResourceTagResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateGcbTagRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateGlobalConnectionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateGlobalConnectionBandwidthRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateGlobalConnectionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateInterRegionBandwidthRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateNetworkInstanceRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateNetworkInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateP2PSiteNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateP2PSiteNetworkRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateP2PSiteNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteAuthorisationRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteAuthorisationResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteCentralNetworkAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteCentralNetworkAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteCentralNetworkPolicyRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteCentralNetworkPolicyResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteGcbResourceTagRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteGcbResourceTagResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteGlobalConnectionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteGlobalConnectionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteNetworkInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteSiteNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteSiteNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.DisassociateBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.DisassociateBandwidthPackageRequestBody;
import com.huaweicloud.sdk.cc.v3.model.DisassociateBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.DisassociateGlobalConnectionBandwidthInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.DisassociateGlobalConnectionBandwidthInstanceRequestBody;
import com.huaweicloud.sdk.cc.v3.model.DisassociateGlobalConnectionBandwidthInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.DisassociateSiteNetworkBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.DisassociateSiteNetworkBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.ListAreaBandwidthPackageSpecificationsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListAreaBandwidthPackageSpecificationsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListAreasRequest;
import com.huaweicloud.sdk.cc.v3.model.ListAreasResponse;
import com.huaweicloud.sdk.cc.v3.model.ListAuthorisationsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListAuthorisationsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageLevelsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageLevelsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageLinesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageLinesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageSitesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageSitesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesByTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesByTagsRequestBody;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesByTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkAttachmentsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkAttachmentsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkCapabilitiesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkCapabilitiesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkConnectionsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkConnectionsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkErRouteTableAttachmentsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkErRouteTableAttachmentsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkGdgwAttachmentsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkGdgwAttachmentsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkPoliciesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkPoliciesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkPolicyChangeSetRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkPolicyChangeSetResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkQuotasRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkQuotasResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworksByTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworksByTagsRequestBody;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworksByTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworksRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworksResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionCapabilitiesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionCapabilitiesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionQuotasRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionQuotasResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionRoutesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionRoutesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionsByTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionsByTagsRequestBody;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionsByTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGcbResourceByTagRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGcbResourceByTagResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGcbResourceTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGcbResourceTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGcbTenantTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGcbTenantTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthConfigsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthConfigsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthLineLevelsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthLineLevelsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthSitesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthSitesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthSpecCodesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthSpecCodesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListInterRegionBandwidthsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListInterRegionBandwidthsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListNetworkInstancesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListNetworkInstancesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListPermissionsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListPermissionsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListRegionBandwidthPackageSpecificationsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListRegionBandwidthPackageSpecificationsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListRegionsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListRegionsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListSiteNetworkCapabilitiesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListSiteNetworkCapabilitiesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListSiteNetworkQuotasRequest;
import com.huaweicloud.sdk.cc.v3.model.ListSiteNetworkQuotasResponse;
import com.huaweicloud.sdk.cc.v3.model.ListSiteNetworksRequest;
import com.huaweicloud.sdk.cc.v3.model.ListSiteNetworksResponse;
import com.huaweicloud.sdk.cc.v3.model.ListSupportBindingConnectionBandwidthsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListSupportBindingConnectionBandwidthsResponse;
import com.huaweicloud.sdk.cc.v3.model.QueryResourceByTagRequestBody;
import com.huaweicloud.sdk.cc.v3.model.ShowBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkErRouteTableAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkErRouteTableAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkGdgwAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkGdgwAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCloudConnectionRoutesRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCloudConnectionRoutesResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowGlobalConnectionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowGlobalConnectionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowNetworkInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowSiteNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowSiteNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.SiteNetworkQuotaKeyEnum;
import com.huaweicloud.sdk.cc.v3.model.SiteNetworkSpecificationEnum;
import com.huaweicloud.sdk.cc.v3.model.SiteNetworkStateEnum;
import com.huaweicloud.sdk.cc.v3.model.SortDir;
import com.huaweicloud.sdk.cc.v3.model.TagBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.TagBandwidthPackageRequestBody;
import com.huaweicloud.sdk.cc.v3.model.TagBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.TagCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.TagCentralNetworkRequestBody;
import com.huaweicloud.sdk.cc.v3.model.TagCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.TagCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.TagCloudConnectionRequestBody;
import com.huaweicloud.sdk.cc.v3.model.TagCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.UntagBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.UntagBandwidthPackageRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UntagBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.UntagCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.UntagCentralNetworkRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UntagCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.UntagCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.UntagCloudConnectionRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UntagCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateAuthorisationRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateAuthorisationRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateAuthorisationResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateBandwidthPackageRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkConnectionRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkErRouteTableAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkErRouteTableAttachmentRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkErRouteTableAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkGdgwAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkGdgwAttachmentRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkGdgwAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateCloudConnectionRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateGlobalConnectionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateGlobalConnectionBandwidthRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateGlobalConnectionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateInterRegionBandwidthRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateNetworkInstanceRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateNetworkInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteConnectionBandwidthRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteConnectionBandwidthSizeRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteNetworkBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteNetworkBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteNetworkBandwidthSizeRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteNetworkBandwidthSizeResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteNetworkRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.Version;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CcMeta {

    public static final HttpRequestDef<CreateAuthorisationRequest, CreateAuthorisationResponse> createAuthorisation =
        genForCreateAuthorisation();

    private static HttpRequestDef<CreateAuthorisationRequest, CreateAuthorisationResponse> genForCreateAuthorisation() {
        // basic
        HttpRequestDef.Builder<CreateAuthorisationRequest, CreateAuthorisationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAuthorisationRequest.class, CreateAuthorisationResponse.class)
                .withName("CreateAuthorisation")
                .withUri("/v3/{domain_id}/ccaas/authorisations")
                .withContentType("application/json");

        // requests
        builder.<CreateAuthorisationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAuthorisationRequestBody.class),
            f -> f.withMarshaller(CreateAuthorisationRequest::getBody, CreateAuthorisationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuthorisationRequest, DeleteAuthorisationResponse> deleteAuthorisation =
        genForDeleteAuthorisation();

    private static HttpRequestDef<DeleteAuthorisationRequest, DeleteAuthorisationResponse> genForDeleteAuthorisation() {
        // basic
        HttpRequestDef.Builder<DeleteAuthorisationRequest, DeleteAuthorisationResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAuthorisationRequest.class, DeleteAuthorisationResponse.class)
            .withName("DeleteAuthorisation")
            .withUri("/v3/{domain_id}/ccaas/authorisations/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuthorisationRequest::getId, DeleteAuthorisationRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorisationsRequest, ListAuthorisationsResponse> listAuthorisations =
        genForListAuthorisations();

    private static HttpRequestDef<ListAuthorisationsRequest, ListAuthorisationsResponse> genForListAuthorisations() {
        // basic
        HttpRequestDef.Builder<ListAuthorisationsRequest, ListAuthorisationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuthorisationsRequest.class, ListAuthorisationsResponse.class)
                .withName("ListAuthorisations")
                .withUri("/v3/{domain_id}/ccaas/authorisations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getLimit, ListAuthorisationsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getMarker, ListAuthorisationsRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getId, ListAuthorisationsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getName, ListAuthorisationsRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getDescription,
                ListAuthorisationsRequest::setDescription));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getCloudConnectionId,
                ListAuthorisationsRequest::setCloudConnectionId));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getInstanceId, ListAuthorisationsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionsRequest, ListPermissionsResponse> listPermissions =
        genForListPermissions();

    private static HttpRequestDef<ListPermissionsRequest, ListPermissionsResponse> genForListPermissions() {
        // basic
        HttpRequestDef.Builder<ListPermissionsRequest, ListPermissionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPermissionsRequest.class, ListPermissionsResponse.class)
                .withName("ListPermissions")
                .withUri("/v3/{domain_id}/ccaas/permissions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionsRequest::getLimit, ListPermissionsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionsRequest::getMarker, ListPermissionsRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getId, ListPermissionsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getName, ListPermissionsRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getDescription, ListPermissionsRequest::setDescription));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getCloudConnectionId,
                ListPermissionsRequest::setCloudConnectionId));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getInstanceId, ListPermissionsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuthorisationRequest, UpdateAuthorisationResponse> updateAuthorisation =
        genForUpdateAuthorisation();

    private static HttpRequestDef<UpdateAuthorisationRequest, UpdateAuthorisationResponse> genForUpdateAuthorisation() {
        // basic
        HttpRequestDef.Builder<UpdateAuthorisationRequest, UpdateAuthorisationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAuthorisationRequest.class, UpdateAuthorisationResponse.class)
                .withName("UpdateAuthorisation")
                .withUri("/v3/{domain_id}/ccaas/authorisations/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuthorisationRequest::getId, UpdateAuthorisationRequest::setId));
        builder.<UpdateAuthorisationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAuthorisationRequestBody.class),
            f -> f.withMarshaller(UpdateAuthorisationRequest::getBody, UpdateAuthorisationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse> associateBandwidthPackage =
        genForAssociateBandwidthPackage();

    private static HttpRequestDef<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse> genForAssociateBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateBandwidthPackageRequest.class,
                    AssociateBandwidthPackageResponse.class)
                .withName("AssociateBandwidthPackage")
                .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/{id}/associate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateBandwidthPackageRequest::getId, AssociateBandwidthPackageRequest::setId));
        builder.<AssociateBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(AssociateBandwidthPackageRequest::getBody,
                AssociateBandwidthPackageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse> createBandwidthPackage =
        genForCreateBandwidthPackage();

    private static HttpRequestDef<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse> genForCreateBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateBandwidthPackageRequest.class, CreateBandwidthPackageResponse.class)
            .withName("CreateBandwidthPackage")
            .withUri("/v3/{domain_id}/ccaas/bandwidth-packages")
            .withContentType("application/json");

        // requests
        builder.<CreateBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(CreateBandwidthPackageRequest::getBody, CreateBandwidthPackageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse> deleteBandwidthPackage =
        genForDeleteBandwidthPackage();

    private static HttpRequestDef<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse> genForDeleteBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBandwidthPackageRequest.class, DeleteBandwidthPackageResponse.class)
            .withName("DeleteBandwidthPackage")
            .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBandwidthPackageRequest::getId, DeleteBandwidthPackageRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse> disassociateBandwidthPackage =
        genForDisassociateBandwidthPackage();

    private static HttpRequestDef<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse> genForDisassociateBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisassociateBandwidthPackageRequest.class,
                    DisassociateBandwidthPackageResponse.class)
                .withName("DisassociateBandwidthPackage")
                .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/{id}/disassociate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateBandwidthPackageRequest::getId,
                DisassociateBandwidthPackageRequest::setId));
        builder.<DisassociateBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(DisassociateBandwidthPackageRequest::getBody,
                DisassociateBandwidthPackageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthPackageTagsRequest, ListBandwidthPackageTagsResponse> listBandwidthPackageTags =
        genForListBandwidthPackageTags();

    private static HttpRequestDef<ListBandwidthPackageTagsRequest, ListBandwidthPackageTagsResponse> genForListBandwidthPackageTags() {
        // basic
        HttpRequestDef.Builder<ListBandwidthPackageTagsRequest, ListBandwidthPackageTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListBandwidthPackageTagsRequest.class, ListBandwidthPackageTagsResponse.class)
                .withName("ListBandwidthPackageTags")
                .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse> listBandwidthPackages =
        genForListBandwidthPackages();

    private static HttpRequestDef<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse> genForListBandwidthPackages() {
        // basic
        HttpRequestDef.Builder<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBandwidthPackagesRequest.class, ListBandwidthPackagesResponse.class)
            .withName("ListBandwidthPackages")
            .withUri("/v3/{domain_id}/ccaas/bandwidth-packages")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getLimit, ListBandwidthPackagesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getMarker, ListBandwidthPackagesRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getId, ListBandwidthPackagesRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getName, ListBandwidthPackagesRequest::setName));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getEnterpriseProjectId,
                ListBandwidthPackagesRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getCloudConnectionId,
                ListBandwidthPackagesRequest::setCloudConnectionId));
        builder.<List<ListBandwidthPackagesRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getStatus, ListBandwidthPackagesRequest::setStatus));
        builder.<List<String>>withRequestField("billing_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getBillingMode,
                ListBandwidthPackagesRequest::setBillingMode));
        builder.<List<String>>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getResourceId,
                ListBandwidthPackagesRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthPackagesByTagsRequest, ListBandwidthPackagesByTagsResponse> listBandwidthPackagesByTags =
        genForListBandwidthPackagesByTags();

    private static HttpRequestDef<ListBandwidthPackagesByTagsRequest, ListBandwidthPackagesByTagsResponse> genForListBandwidthPackagesByTags() {
        // basic
        HttpRequestDef.Builder<ListBandwidthPackagesByTagsRequest, ListBandwidthPackagesByTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListBandwidthPackagesByTagsRequest.class,
                    ListBandwidthPackagesByTagsResponse.class)
                .withName("ListBandwidthPackagesByTags")
                .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/filter")
                .withContentType("application/json");

        // requests
        builder.<ListBandwidthPackagesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListBandwidthPackagesByTagsRequestBody.class),
            f -> f.withMarshaller(ListBandwidthPackagesByTagsRequest::getBody,
                ListBandwidthPackagesByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse> showBandwidthPackage =
        genForShowBandwidthPackage();

    private static HttpRequestDef<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse> genForShowBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBandwidthPackageRequest.class, ShowBandwidthPackageResponse.class)
            .withName("ShowBandwidthPackage")
            .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBandwidthPackageRequest::getId, ShowBandwidthPackageRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagBandwidthPackageRequest, TagBandwidthPackageResponse> tagBandwidthPackage =
        genForTagBandwidthPackage();

    private static HttpRequestDef<TagBandwidthPackageRequest, TagBandwidthPackageResponse> genForTagBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<TagBandwidthPackageRequest, TagBandwidthPackageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TagBandwidthPackageRequest.class, TagBandwidthPackageResponse.class)
                .withName("TagBandwidthPackage")
                .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/{id}/tag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagBandwidthPackageRequest::getId, TagBandwidthPackageRequest::setId));
        builder.<TagBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(TagBandwidthPackageRequest::getBody, TagBandwidthPackageRequest::setBody));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(TagBandwidthPackageResponse::getXRequestId,
                TagBandwidthPackageResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UntagBandwidthPackageRequest, UntagBandwidthPackageResponse> untagBandwidthPackage =
        genForUntagBandwidthPackage();

    private static HttpRequestDef<UntagBandwidthPackageRequest, UntagBandwidthPackageResponse> genForUntagBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<UntagBandwidthPackageRequest, UntagBandwidthPackageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UntagBandwidthPackageRequest.class, UntagBandwidthPackageResponse.class)
            .withName("UntagBandwidthPackage")
            .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/{id}/untag")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UntagBandwidthPackageRequest::getId, UntagBandwidthPackageRequest::setId));
        builder.<UntagBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UntagBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(UntagBandwidthPackageRequest::getBody, UntagBandwidthPackageRequest::setBody));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UntagBandwidthPackageResponse::getXRequestId,
                UntagBandwidthPackageResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse> updateBandwidthPackage =
        genForUpdateBandwidthPackage();

    private static HttpRequestDef<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse> genForUpdateBandwidthPackage() {
        // basic
        HttpRequestDef.Builder<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateBandwidthPackageRequest.class, UpdateBandwidthPackageResponse.class)
            .withName("UpdateBandwidthPackage")
            .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBandwidthPackageRequest::getId, UpdateBandwidthPackageRequest::setId));
        builder.<UpdateBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(UpdateBandwidthPackageRequest::getBody, UpdateBandwidthPackageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyCentralNetworkPolicyRequest, ApplyCentralNetworkPolicyResponse> applyCentralNetworkPolicy =
        genForApplyCentralNetworkPolicy();

    private static HttpRequestDef<ApplyCentralNetworkPolicyRequest, ApplyCentralNetworkPolicyResponse> genForApplyCentralNetworkPolicy() {
        // basic
        HttpRequestDef.Builder<ApplyCentralNetworkPolicyRequest, ApplyCentralNetworkPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ApplyCentralNetworkPolicyRequest.class,
                    ApplyCentralNetworkPolicyResponse.class)
                .withName("ApplyCentralNetworkPolicy")
                .withUri("/v3/{domain_id}/gcn/central-network/{central_network_id}/policies/{policy_id}/apply")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyCentralNetworkPolicyRequest::getPolicyId,
                ApplyCentralNetworkPolicyRequest::setPolicyId));
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyCentralNetworkPolicyRequest::getCentralNetworkId,
                ApplyCentralNetworkPolicyRequest::setCentralNetworkId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCentralNetworkRequest, CreateCentralNetworkResponse> createCentralNetwork =
        genForCreateCentralNetwork();

    private static HttpRequestDef<CreateCentralNetworkRequest, CreateCentralNetworkResponse> genForCreateCentralNetwork() {
        // basic
        HttpRequestDef.Builder<CreateCentralNetworkRequest, CreateCentralNetworkResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCentralNetworkRequest.class, CreateCentralNetworkResponse.class)
            .withName("CreateCentralNetwork")
            .withUri("/v3/{domain_id}/gcn/central-networks")
            .withContentType("application/json");

        // requests
        builder.<CreateCentralNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCentralNetworkRequestBody.class),
            f -> f.withMarshaller(CreateCentralNetworkRequest::getBody, CreateCentralNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCentralNetworkPolicyRequest, CreateCentralNetworkPolicyResponse> createCentralNetworkPolicy =
        genForCreateCentralNetworkPolicy();

    private static HttpRequestDef<CreateCentralNetworkPolicyRequest, CreateCentralNetworkPolicyResponse> genForCreateCentralNetworkPolicy() {
        // basic
        HttpRequestDef.Builder<CreateCentralNetworkPolicyRequest, CreateCentralNetworkPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCentralNetworkPolicyRequest.class,
                    CreateCentralNetworkPolicyResponse.class)
                .withName("CreateCentralNetworkPolicy")
                .withUri("/v3/{domain_id}/gcn/central-network/{central_network_id}/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCentralNetworkPolicyRequest::getCentralNetworkId,
                CreateCentralNetworkPolicyRequest::setCentralNetworkId));
        builder.<CreateCentralNetworkPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCentralNetworkPolicyRequestBody.class),
            f -> f.withMarshaller(CreateCentralNetworkPolicyRequest::getBody,
                CreateCentralNetworkPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCentralNetworkRequest, DeleteCentralNetworkResponse> deleteCentralNetwork =
        genForDeleteCentralNetwork();

    private static HttpRequestDef<DeleteCentralNetworkRequest, DeleteCentralNetworkResponse> genForDeleteCentralNetwork() {
        // basic
        HttpRequestDef.Builder<DeleteCentralNetworkRequest, DeleteCentralNetworkResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteCentralNetworkRequest.class, DeleteCentralNetworkResponse.class)
            .withName("DeleteCentralNetwork")
            .withUri("/v3/{domain_id}/gcn/central-networks/{central_network_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCentralNetworkRequest::getCentralNetworkId,
                DeleteCentralNetworkRequest::setCentralNetworkId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCentralNetworkPolicyRequest, DeleteCentralNetworkPolicyResponse> deleteCentralNetworkPolicy =
        genForDeleteCentralNetworkPolicy();

    private static HttpRequestDef<DeleteCentralNetworkPolicyRequest, DeleteCentralNetworkPolicyResponse> genForDeleteCentralNetworkPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteCentralNetworkPolicyRequest, DeleteCentralNetworkPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCentralNetworkPolicyRequest.class,
                    DeleteCentralNetworkPolicyResponse.class)
                .withName("DeleteCentralNetworkPolicy")
                .withUri("/v3/{domain_id}/gcn/central-network/{central_network_id}/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCentralNetworkPolicyRequest::getPolicyId,
                DeleteCentralNetworkPolicyRequest::setPolicyId));
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCentralNetworkPolicyRequest::getCentralNetworkId,
                DeleteCentralNetworkPolicyRequest::setCentralNetworkId));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCentralNetworkPolicyResponse::getXRequestId,
                DeleteCentralNetworkPolicyResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkPoliciesRequest, ListCentralNetworkPoliciesResponse> listCentralNetworkPolicies =
        genForListCentralNetworkPolicies();

    private static HttpRequestDef<ListCentralNetworkPoliciesRequest, ListCentralNetworkPoliciesResponse> genForListCentralNetworkPolicies() {
        // basic
        HttpRequestDef.Builder<ListCentralNetworkPoliciesRequest, ListCentralNetworkPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCentralNetworkPoliciesRequest.class,
                    ListCentralNetworkPoliciesResponse.class)
                .withName("ListCentralNetworkPolicies")
                .withUri("/v3/{domain_id}/gcn/central-network/{central_network_id}/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getCentralNetworkId,
                ListCentralNetworkPoliciesRequest::setCentralNetworkId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getLimit,
                ListCentralNetworkPoliciesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getMarker,
                ListCentralNetworkPoliciesRequest::setMarker));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getSortKey,
                ListCentralNetworkPoliciesRequest::setSortKey));
        builder.<SortDir>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SortDir.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getSortDir,
                ListCentralNetworkPoliciesRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getId, ListCentralNetworkPoliciesRequest::setId));
        builder.<List<CentralNetworkPolicyStateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getState,
                ListCentralNetworkPoliciesRequest::setState));
        builder.<List<Version>>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getVersion,
                ListCentralNetworkPoliciesRequest::setVersion));
        builder.<Boolean>withRequestField("is_applied",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getIsApplied,
                ListCentralNetworkPoliciesRequest::setIsApplied));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkPolicyChangeSetRequest, ListCentralNetworkPolicyChangeSetResponse> listCentralNetworkPolicyChangeSet =
        genForListCentralNetworkPolicyChangeSet();

    private static HttpRequestDef<ListCentralNetworkPolicyChangeSetRequest, ListCentralNetworkPolicyChangeSetResponse> genForListCentralNetworkPolicyChangeSet() {
        // basic
        HttpRequestDef.Builder<ListCentralNetworkPolicyChangeSetRequest, ListCentralNetworkPolicyChangeSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCentralNetworkPolicyChangeSetRequest.class,
                    ListCentralNetworkPolicyChangeSetResponse.class)
                .withName("ListCentralNetworkPolicyChangeSet")
                .withUri("/v3/{domain_id}/gcn/central-network/{central_network_id}/policies/{policy_id}/change-set")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkPolicyChangeSetRequest::getPolicyId,
                ListCentralNetworkPolicyChangeSetRequest::setPolicyId));
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkPolicyChangeSetRequest::getCentralNetworkId,
                ListCentralNetworkPolicyChangeSetRequest::setCentralNetworkId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkTagsRequest, ListCentralNetworkTagsResponse> listCentralNetworkTags =
        genForListCentralNetworkTags();

    private static HttpRequestDef<ListCentralNetworkTagsRequest, ListCentralNetworkTagsResponse> genForListCentralNetworkTags() {
        // basic
        HttpRequestDef.Builder<ListCentralNetworkTagsRequest, ListCentralNetworkTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCentralNetworkTagsRequest.class, ListCentralNetworkTagsResponse.class)
            .withName("ListCentralNetworkTags")
            .withUri("/v3/{domain_id}/gcn/central-networks/tags")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworksRequest, ListCentralNetworksResponse> listCentralNetworks =
        genForListCentralNetworks();

    private static HttpRequestDef<ListCentralNetworksRequest, ListCentralNetworksResponse> genForListCentralNetworks() {
        // basic
        HttpRequestDef.Builder<ListCentralNetworksRequest, ListCentralNetworksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCentralNetworksRequest.class, ListCentralNetworksResponse.class)
                .withName("ListCentralNetworks")
                .withUri("/v3/{domain_id}/gcn/central-networks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getLimit, ListCentralNetworksRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getMarker, ListCentralNetworksRequest::setMarker));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getSortKey, ListCentralNetworksRequest::setSortKey));
        builder.<SortDir>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SortDir.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getSortDir, ListCentralNetworksRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getId, ListCentralNetworksRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getName, ListCentralNetworksRequest::setName));
        builder.<List<CentralNetworkStateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getState, ListCentralNetworksRequest::setState));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getEnterpriseProjectId,
                ListCentralNetworksRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("enterprise_router_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getEnterpriseRouterId,
                ListCentralNetworksRequest::setEnterpriseRouterId));
        builder.<List<String>>withRequestField("attachment_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getAttachmentInstanceId,
                ListCentralNetworksRequest::setAttachmentInstanceId));
        builder.<List<String>>withRequestField("global_connection_bandwidth_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getGlobalConnectionBandwidthId,
                ListCentralNetworksRequest::setGlobalConnectionBandwidthId));
        builder.<List<String>>withRequestField("connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getConnectionId,
                ListCentralNetworksRequest::setConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworksByTagsRequest, ListCentralNetworksByTagsResponse> listCentralNetworksByTags =
        genForListCentralNetworksByTags();

    private static HttpRequestDef<ListCentralNetworksByTagsRequest, ListCentralNetworksByTagsResponse> genForListCentralNetworksByTags() {
        // basic
        HttpRequestDef.Builder<ListCentralNetworksByTagsRequest, ListCentralNetworksByTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListCentralNetworksByTagsRequest.class,
                    ListCentralNetworksByTagsResponse.class)
                .withName("ListCentralNetworksByTags")
                .withUri("/v3/{domain_id}/gcn/central-networks/filter")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworksByTagsRequest::getLimit,
                ListCentralNetworksByTagsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworksByTagsRequest::getMarker,
                ListCentralNetworksByTagsRequest::setMarker));
        builder.<ListCentralNetworksByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCentralNetworksByTagsRequestBody.class),
            f -> f.withMarshaller(ListCentralNetworksByTagsRequest::getBody,
                ListCentralNetworksByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCentralNetworkRequest, ShowCentralNetworkResponse> showCentralNetwork =
        genForShowCentralNetwork();

    private static HttpRequestDef<ShowCentralNetworkRequest, ShowCentralNetworkResponse> genForShowCentralNetwork() {
        // basic
        HttpRequestDef.Builder<ShowCentralNetworkRequest, ShowCentralNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCentralNetworkRequest.class, ShowCentralNetworkResponse.class)
                .withName("ShowCentralNetwork")
                .withUri("/v3/{domain_id}/gcn/central-networks/{central_network_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCentralNetworkRequest::getCentralNetworkId,
                ShowCentralNetworkRequest::setCentralNetworkId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagCentralNetworkRequest, TagCentralNetworkResponse> tagCentralNetwork =
        genForTagCentralNetwork();

    private static HttpRequestDef<TagCentralNetworkRequest, TagCentralNetworkResponse> genForTagCentralNetwork() {
        // basic
        HttpRequestDef.Builder<TagCentralNetworkRequest, TagCentralNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TagCentralNetworkRequest.class, TagCentralNetworkResponse.class)
                .withName("TagCentralNetwork")
                .withUri("/v3/{domain_id}/gcn/central-networks/{central_network_id}/tag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagCentralNetworkRequest::getCentralNetworkId,
                TagCentralNetworkRequest::setCentralNetworkId));
        builder.<TagCentralNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagCentralNetworkRequestBody.class),
            f -> f.withMarshaller(TagCentralNetworkRequest::getBody, TagCentralNetworkRequest::setBody));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(TagCentralNetworkResponse::getXRequestId, TagCentralNetworkResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UntagCentralNetworkRequest, UntagCentralNetworkResponse> untagCentralNetwork =
        genForUntagCentralNetwork();

    private static HttpRequestDef<UntagCentralNetworkRequest, UntagCentralNetworkResponse> genForUntagCentralNetwork() {
        // basic
        HttpRequestDef.Builder<UntagCentralNetworkRequest, UntagCentralNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UntagCentralNetworkRequest.class, UntagCentralNetworkResponse.class)
                .withName("UntagCentralNetwork")
                .withUri("/v3/{domain_id}/gcn/central-networks/{central_network_id}/untag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UntagCentralNetworkRequest::getCentralNetworkId,
                UntagCentralNetworkRequest::setCentralNetworkId));
        builder.<UntagCentralNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UntagCentralNetworkRequestBody.class),
            f -> f.withMarshaller(UntagCentralNetworkRequest::getBody, UntagCentralNetworkRequest::setBody));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UntagCentralNetworkResponse::getXRequestId,
                UntagCentralNetworkResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateCentralNetworkRequest, UpdateCentralNetworkResponse> updateCentralNetwork =
        genForUpdateCentralNetwork();

    private static HttpRequestDef<UpdateCentralNetworkRequest, UpdateCentralNetworkResponse> genForUpdateCentralNetwork() {
        // basic
        HttpRequestDef.Builder<UpdateCentralNetworkRequest, UpdateCentralNetworkResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateCentralNetworkRequest.class, UpdateCentralNetworkResponse.class)
            .withName("UpdateCentralNetwork")
            .withUri("/v3/{domain_id}/gcn/central-networks/{central_network_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCentralNetworkRequest::getCentralNetworkId,
                UpdateCentralNetworkRequest::setCentralNetworkId));
        builder.<UpdateCentralNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCentralNetworkRequestBody.class),
            f -> f.withMarshaller(UpdateCentralNetworkRequest::getBody, UpdateCentralNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCentralNetworkErRouteTableAttachmentRequest, CreateCentralNetworkErRouteTableAttachmentResponse> createCentralNetworkErRouteTableAttachment =
        genForCreateCentralNetworkErRouteTableAttachment();

    private static HttpRequestDef<CreateCentralNetworkErRouteTableAttachmentRequest, CreateCentralNetworkErRouteTableAttachmentResponse> genForCreateCentralNetworkErRouteTableAttachment() {
        // basic
        HttpRequestDef.Builder<CreateCentralNetworkErRouteTableAttachmentRequest, CreateCentralNetworkErRouteTableAttachmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCentralNetworkErRouteTableAttachmentRequest.class,
                    CreateCentralNetworkErRouteTableAttachmentResponse.class)
                .withName("CreateCentralNetworkErRouteTableAttachment")
                .withUri("/v3/{domain_id}/gcn/central-network/{central_network_id}/er-route-table-attachments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCentralNetworkErRouteTableAttachmentRequest::getCentralNetworkId,
                CreateCentralNetworkErRouteTableAttachmentRequest::setCentralNetworkId));
        builder.<CreateCentralNetworkErRouteTableAttachmentsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCentralNetworkErRouteTableAttachmentsRequestBody.class),
            f -> f.withMarshaller(CreateCentralNetworkErRouteTableAttachmentRequest::getBody,
                CreateCentralNetworkErRouteTableAttachmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCentralNetworkGdgwAttachmentRequest, CreateCentralNetworkGdgwAttachmentResponse> createCentralNetworkGdgwAttachment =
        genForCreateCentralNetworkGdgwAttachment();

    private static HttpRequestDef<CreateCentralNetworkGdgwAttachmentRequest, CreateCentralNetworkGdgwAttachmentResponse> genForCreateCentralNetworkGdgwAttachment() {
        // basic
        HttpRequestDef.Builder<CreateCentralNetworkGdgwAttachmentRequest, CreateCentralNetworkGdgwAttachmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCentralNetworkGdgwAttachmentRequest.class,
                    CreateCentralNetworkGdgwAttachmentResponse.class)
                .withName("CreateCentralNetworkGdgwAttachment")
                .withUri("/v3/{domain_id}/gcn/central-network/{central_network_id}/gdgw-attachments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCentralNetworkGdgwAttachmentRequest::getCentralNetworkId,
                CreateCentralNetworkGdgwAttachmentRequest::setCentralNetworkId));
        builder.<CreateCentralNetworkGdgwAttachmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCentralNetworkGdgwAttachmentRequestBody.class),
            f -> f.withMarshaller(CreateCentralNetworkGdgwAttachmentRequest::getBody,
                CreateCentralNetworkGdgwAttachmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCentralNetworkAttachmentRequest, DeleteCentralNetworkAttachmentResponse> deleteCentralNetworkAttachment =
        genForDeleteCentralNetworkAttachment();

    private static HttpRequestDef<DeleteCentralNetworkAttachmentRequest, DeleteCentralNetworkAttachmentResponse> genForDeleteCentralNetworkAttachment() {
        // basic
        HttpRequestDef.Builder<DeleteCentralNetworkAttachmentRequest, DeleteCentralNetworkAttachmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCentralNetworkAttachmentRequest.class,
                    DeleteCentralNetworkAttachmentResponse.class)
                .withName("DeleteCentralNetworkAttachment")
                .withUri("/v3/{domain_id}/gcn/central-network/{central_network_id}/attachments/{attachment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCentralNetworkAttachmentRequest::getCentralNetworkId,
                DeleteCentralNetworkAttachmentRequest::setCentralNetworkId));
        builder.<String>withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCentralNetworkAttachmentRequest::getAttachmentId,
                DeleteCentralNetworkAttachmentRequest::setAttachmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkAttachmentsRequest, ListCentralNetworkAttachmentsResponse> listCentralNetworkAttachments =
        genForListCentralNetworkAttachments();

    private static HttpRequestDef<ListCentralNetworkAttachmentsRequest, ListCentralNetworkAttachmentsResponse> genForListCentralNetworkAttachments() {
        // basic
        HttpRequestDef.Builder<ListCentralNetworkAttachmentsRequest, ListCentralNetworkAttachmentsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCentralNetworkAttachmentsRequest.class,
                    ListCentralNetworkAttachmentsResponse.class)
                .withName("ListCentralNetworkAttachments")
                .withUri("/v3/{domain_id}/gcn/central-network/{central_network_id}/attachments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getCentralNetworkId,
                ListCentralNetworkAttachmentsRequest::setCentralNetworkId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getLimit,
                ListCentralNetworkAttachmentsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getMarker,
                ListCentralNetworkAttachmentsRequest::setMarker));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getSortKey,
                ListCentralNetworkAttachmentsRequest::setSortKey));
        builder.<SortDir>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SortDir.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getSortDir,
                ListCentralNetworkAttachmentsRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getId,
                ListCentralNetworkAttachmentsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getName,
                ListCentralNetworkAttachmentsRequest::setName));
        builder.<List<AttachmentInstanceTypeEnum>>withRequestField("attachment_instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getAttachmentInstanceType,
                ListCentralNetworkAttachmentsRequest::setAttachmentInstanceType));
        builder.<List<CentralNetworkConnectionStateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getState,
                ListCentralNetworkAttachmentsRequest::setState));
        builder.<List<String>>withRequestField("attachment_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getAttachmentInstanceId,
                ListCentralNetworkAttachmentsRequest::setAttachmentInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkErRouteTableAttachmentsRequest, ListCentralNetworkErRouteTableAttachmentsResponse> listCentralNetworkErRouteTableAttachments =
        genForListCentralNetworkErRouteTableAttachments();

    private static HttpRequestDef<ListCentralNetworkErRouteTableAttachmentsRequest, ListCentralNetworkErRouteTableAttachmentsResponse> genForListCentralNetworkErRouteTableAttachments() {
        // basic
        HttpRequestDef.Builder<ListCentralNetworkErRouteTableAttachmentsRequest, ListCentralNetworkErRouteTableAttachmentsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCentralNetworkErRouteTableAttachmentsRequest.class,
                    ListCentralNetworkErRouteTableAttachmentsResponse.class)
                .withName("ListCentralNetworkErRouteTableAttachments")
                .withUri("/v3/{domain_id}/gcn/central-network/{central_network_id}/er-route-table-attachments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkErRouteTableAttachmentsRequest::getCentralNetworkId,
                ListCentralNetworkErRouteTableAttachmentsRequest::setCentralNetworkId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworkErRouteTableAttachmentsRequest::getLimit,
                ListCentralNetworkErRouteTableAttachmentsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkErRouteTableAttachmentsRequest::getMarker,
                ListCentralNetworkErRouteTableAttachmentsRequest::setMarker));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkErRouteTableAttachmentsRequest::getSortKey,
                ListCentralNetworkErRouteTableAttachmentsRequest::setSortKey));
        builder.<SortDir>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SortDir.class),
            f -> f.withMarshaller(ListCentralNetworkErRouteTableAttachmentsRequest::getSortDir,
                ListCentralNetworkErRouteTableAttachmentsRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkErRouteTableAttachmentsRequest::getId,
                ListCentralNetworkErRouteTableAttachmentsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkErRouteTableAttachmentsRequest::getName,
                ListCentralNetworkErRouteTableAttachmentsRequest::setName));
        builder.<List<CentralNetworkConnectionStateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkErRouteTableAttachmentsRequest::getState,
                ListCentralNetworkErRouteTableAttachmentsRequest::setState));
        builder.<List<String>>withRequestField("attachment_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkErRouteTableAttachmentsRequest::getAttachmentInstanceId,
                ListCentralNetworkErRouteTableAttachmentsRequest::setAttachmentInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkGdgwAttachmentsRequest, ListCentralNetworkGdgwAttachmentsResponse> listCentralNetworkGdgwAttachments =
        genForListCentralNetworkGdgwAttachments();

    private static HttpRequestDef<ListCentralNetworkGdgwAttachmentsRequest, ListCentralNetworkGdgwAttachmentsResponse> genForListCentralNetworkGdgwAttachments() {
        // basic
        HttpRequestDef.Builder<ListCentralNetworkGdgwAttachmentsRequest, ListCentralNetworkGdgwAttachmentsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCentralNetworkGdgwAttachmentsRequest.class,
                    ListCentralNetworkGdgwAttachmentsResponse.class)
                .withName("ListCentralNetworkGdgwAttachments")
                .withUri("/v3/{domain_id}/gcn/central-network/{central_network_id}/gdgw-attachments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getCentralNetworkId,
                ListCentralNetworkGdgwAttachmentsRequest::setCentralNetworkId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getLimit,
                ListCentralNetworkGdgwAttachmentsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getMarker,
                ListCentralNetworkGdgwAttachmentsRequest::setMarker));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getSortKey,
                ListCentralNetworkGdgwAttachmentsRequest::setSortKey));
        builder.<SortDir>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SortDir.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getSortDir,
                ListCentralNetworkGdgwAttachmentsRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getId,
                ListCentralNetworkGdgwAttachmentsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getName,
                ListCentralNetworkGdgwAttachmentsRequest::setName));
        builder.<List<CentralNetworkConnectionStateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getState,
                ListCentralNetworkGdgwAttachmentsRequest::setState));
        builder.<List<String>>withRequestField("global_dc_gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getGlobalDcGatewayId,
                ListCentralNetworkGdgwAttachmentsRequest::setGlobalDcGatewayId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCentralNetworkErRouteTableAttachmentRequest, ShowCentralNetworkErRouteTableAttachmentResponse> showCentralNetworkErRouteTableAttachment =
        genForShowCentralNetworkErRouteTableAttachment();

    private static HttpRequestDef<ShowCentralNetworkErRouteTableAttachmentRequest, ShowCentralNetworkErRouteTableAttachmentResponse> genForShowCentralNetworkErRouteTableAttachment() {
        // basic
        HttpRequestDef.Builder<ShowCentralNetworkErRouteTableAttachmentRequest, ShowCentralNetworkErRouteTableAttachmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCentralNetworkErRouteTableAttachmentRequest.class,
                    ShowCentralNetworkErRouteTableAttachmentResponse.class)
                .withName("ShowCentralNetworkErRouteTableAttachment")
                .withUri(
                    "/v3/{domain_id}/gcn/central-network/{central_network_id}/er-route-table-attachments/{er_route_table_attachment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCentralNetworkErRouteTableAttachmentRequest::getCentralNetworkId,
                ShowCentralNetworkErRouteTableAttachmentRequest::setCentralNetworkId));
        builder.<String>withRequestField("er_route_table_attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCentralNetworkErRouteTableAttachmentRequest::getErRouteTableAttachmentId,
                ShowCentralNetworkErRouteTableAttachmentRequest::setErRouteTableAttachmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCentralNetworkGdgwAttachmentRequest, ShowCentralNetworkGdgwAttachmentResponse> showCentralNetworkGdgwAttachment =
        genForShowCentralNetworkGdgwAttachment();

    private static HttpRequestDef<ShowCentralNetworkGdgwAttachmentRequest, ShowCentralNetworkGdgwAttachmentResponse> genForShowCentralNetworkGdgwAttachment() {
        // basic
        HttpRequestDef.Builder<ShowCentralNetworkGdgwAttachmentRequest, ShowCentralNetworkGdgwAttachmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCentralNetworkGdgwAttachmentRequest.class,
                    ShowCentralNetworkGdgwAttachmentResponse.class)
                .withName("ShowCentralNetworkGdgwAttachment")
                .withUri(
                    "/v3/{domain_id}/gcn/central-network/{central_network_id}/gdgw-attachments/{gdgw_attachment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCentralNetworkGdgwAttachmentRequest::getCentralNetworkId,
                ShowCentralNetworkGdgwAttachmentRequest::setCentralNetworkId));
        builder.<String>withRequestField("gdgw_attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCentralNetworkGdgwAttachmentRequest::getGdgwAttachmentId,
                ShowCentralNetworkGdgwAttachmentRequest::setGdgwAttachmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCentralNetworkErRouteTableAttachmentRequest, UpdateCentralNetworkErRouteTableAttachmentResponse> updateCentralNetworkErRouteTableAttachment =
        genForUpdateCentralNetworkErRouteTableAttachment();

    private static HttpRequestDef<UpdateCentralNetworkErRouteTableAttachmentRequest, UpdateCentralNetworkErRouteTableAttachmentResponse> genForUpdateCentralNetworkErRouteTableAttachment() {
        // basic
        HttpRequestDef.Builder<UpdateCentralNetworkErRouteTableAttachmentRequest, UpdateCentralNetworkErRouteTableAttachmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateCentralNetworkErRouteTableAttachmentRequest.class,
                    UpdateCentralNetworkErRouteTableAttachmentResponse.class)
                .withName("UpdateCentralNetworkErRouteTableAttachment")
                .withUri(
                    "/v3/{domain_id}/gcn/central-network/{central_network_id}/er-route-table-attachments/{er_route_table_attachment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCentralNetworkErRouteTableAttachmentRequest::getCentralNetworkId,
                UpdateCentralNetworkErRouteTableAttachmentRequest::setCentralNetworkId));
        builder.<String>withRequestField("er_route_table_attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCentralNetworkErRouteTableAttachmentRequest::getErRouteTableAttachmentId,
                UpdateCentralNetworkErRouteTableAttachmentRequest::setErRouteTableAttachmentId));
        builder.<UpdateCentralNetworkErRouteTableAttachmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCentralNetworkErRouteTableAttachmentRequestBody.class),
            f -> f.withMarshaller(UpdateCentralNetworkErRouteTableAttachmentRequest::getBody,
                UpdateCentralNetworkErRouteTableAttachmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCentralNetworkGdgwAttachmentRequest, UpdateCentralNetworkGdgwAttachmentResponse> updateCentralNetworkGdgwAttachment =
        genForUpdateCentralNetworkGdgwAttachment();

    private static HttpRequestDef<UpdateCentralNetworkGdgwAttachmentRequest, UpdateCentralNetworkGdgwAttachmentResponse> genForUpdateCentralNetworkGdgwAttachment() {
        // basic
        HttpRequestDef.Builder<UpdateCentralNetworkGdgwAttachmentRequest, UpdateCentralNetworkGdgwAttachmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateCentralNetworkGdgwAttachmentRequest.class,
                    UpdateCentralNetworkGdgwAttachmentResponse.class)
                .withName("UpdateCentralNetworkGdgwAttachment")
                .withUri(
                    "/v3/{domain_id}/gcn/central-network/{central_network_id}/gdgw-attachments/{gdgw_attachment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCentralNetworkGdgwAttachmentRequest::getCentralNetworkId,
                UpdateCentralNetworkGdgwAttachmentRequest::setCentralNetworkId));
        builder.<String>withRequestField("gdgw_attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCentralNetworkGdgwAttachmentRequest::getGdgwAttachmentId,
                UpdateCentralNetworkGdgwAttachmentRequest::setGdgwAttachmentId));
        builder.<UpdateCentralNetworkGdgwAttachmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCentralNetworkGdgwAttachmentRequestBody.class),
            f -> f.withMarshaller(UpdateCentralNetworkGdgwAttachmentRequest::getBody,
                UpdateCentralNetworkGdgwAttachmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkCapabilitiesRequest, ListCentralNetworkCapabilitiesResponse> listCentralNetworkCapabilities =
        genForListCentralNetworkCapabilities();

    private static HttpRequestDef<ListCentralNetworkCapabilitiesRequest, ListCentralNetworkCapabilitiesResponse> genForListCentralNetworkCapabilities() {
        // basic
        HttpRequestDef.Builder<ListCentralNetworkCapabilitiesRequest, ListCentralNetworkCapabilitiesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCentralNetworkCapabilitiesRequest.class,
                    ListCentralNetworkCapabilitiesResponse.class)
                .withName("ListCentralNetworkCapabilities")
                .withUri("/v3/{domain_id}/gcn/capabilities")
                .withContentType("application/json");

        // requests
        builder.<List<CentralNetworkCapabilityEnum>>withRequestField("capability",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkCapabilitiesRequest::getCapability,
                ListCentralNetworkCapabilitiesRequest::setCapability));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworkCapabilitiesRequest::getLimit,
                ListCentralNetworkCapabilitiesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkCapabilitiesRequest::getMarker,
                ListCentralNetworkCapabilitiesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkConnectionsRequest, ListCentralNetworkConnectionsResponse> listCentralNetworkConnections =
        genForListCentralNetworkConnections();

    private static HttpRequestDef<ListCentralNetworkConnectionsRequest, ListCentralNetworkConnectionsResponse> genForListCentralNetworkConnections() {
        // basic
        HttpRequestDef.Builder<ListCentralNetworkConnectionsRequest, ListCentralNetworkConnectionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCentralNetworkConnectionsRequest.class,
                    ListCentralNetworkConnectionsResponse.class)
                .withName("ListCentralNetworkConnections")
                .withUri("/v3/{domain_id}/gcn/central-network/{central_network_id}/connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getCentralNetworkId,
                ListCentralNetworkConnectionsRequest::setCentralNetworkId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getLimit,
                ListCentralNetworkConnectionsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getMarker,
                ListCentralNetworkConnectionsRequest::setMarker));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getSortKey,
                ListCentralNetworkConnectionsRequest::setSortKey));
        builder.<SortDir>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SortDir.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getSortDir,
                ListCentralNetworkConnectionsRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getId,
                ListCentralNetworkConnectionsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getName,
                ListCentralNetworkConnectionsRequest::setName));
        builder.<List<CentralNetworkConnectionStateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getState,
                ListCentralNetworkConnectionsRequest::setState));
        builder.<List<String>>withRequestField("global_connection_bandwidth_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getGlobalConnectionBandwidthId,
                ListCentralNetworkConnectionsRequest::setGlobalConnectionBandwidthId));
        builder.<BandwidthTypeEnum>withRequestField("bandwidth_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BandwidthTypeEnum.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getBandwidthType,
                ListCentralNetworkConnectionsRequest::setBandwidthType));
        builder.<ConnectionTypeEnum>withRequestField("connection_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConnectionTypeEnum.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getConnectionType,
                ListCentralNetworkConnectionsRequest::setConnectionType));
        builder.<Boolean>withRequestField("is_cross_region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getIsCrossRegion,
                ListCentralNetworkConnectionsRequest::setIsCrossRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCentralNetworkConnectionRequest, UpdateCentralNetworkConnectionResponse> updateCentralNetworkConnection =
        genForUpdateCentralNetworkConnection();

    private static HttpRequestDef<UpdateCentralNetworkConnectionRequest, UpdateCentralNetworkConnectionResponse> genForUpdateCentralNetworkConnection() {
        // basic
        HttpRequestDef.Builder<UpdateCentralNetworkConnectionRequest, UpdateCentralNetworkConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateCentralNetworkConnectionRequest.class,
                    UpdateCentralNetworkConnectionResponse.class)
                .withName("UpdateCentralNetworkConnection")
                .withUri("/v3/{domain_id}/gcn/central-network/{central_network_id}/connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCentralNetworkConnectionRequest::getCentralNetworkId,
                UpdateCentralNetworkConnectionRequest::setCentralNetworkId));
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCentralNetworkConnectionRequest::getConnectionId,
                UpdateCentralNetworkConnectionRequest::setConnectionId));
        builder.<UpdateCentralNetworkConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCentralNetworkConnectionRequestBody.class),
            f -> f.withMarshaller(UpdateCentralNetworkConnectionRequest::getBody,
                UpdateCentralNetworkConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkQuotasRequest, ListCentralNetworkQuotasResponse> listCentralNetworkQuotas =
        genForListCentralNetworkQuotas();

    private static HttpRequestDef<ListCentralNetworkQuotasRequest, ListCentralNetworkQuotasResponse> genForListCentralNetworkQuotas() {
        // basic
        HttpRequestDef.Builder<ListCentralNetworkQuotasRequest, ListCentralNetworkQuotasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListCentralNetworkQuotasRequest.class, ListCentralNetworkQuotasResponse.class)
                .withName("ListCentralNetworkQuotas")
                .withUri("/v3/{domain_id}/gcn/quotas")
                .withContentType("application/json");

        // requests
        builder.<List<CentralNetworkQuotaKeyEnum>>withRequestField("quota_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkQuotasRequest::getQuotaType,
                ListCentralNetworkQuotasRequest::setQuotaType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworkQuotasRequest::getLimit,
                ListCentralNetworkQuotasRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkQuotasRequest::getMarker,
                ListCentralNetworkQuotasRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudConnectionRequest, CreateCloudConnectionResponse> createCloudConnection =
        genForCreateCloudConnection();

    private static HttpRequestDef<CreateCloudConnectionRequest, CreateCloudConnectionResponse> genForCreateCloudConnection() {
        // basic
        HttpRequestDef.Builder<CreateCloudConnectionRequest, CreateCloudConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCloudConnectionRequest.class, CreateCloudConnectionResponse.class)
            .withName("CreateCloudConnection")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections")
            .withContentType("application/json");

        // requests
        builder.<CreateCloudConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCloudConnectionRequestBody.class),
            f -> f.withMarshaller(CreateCloudConnectionRequest::getBody, CreateCloudConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> deleteCloudConnection =
        genForDeleteCloudConnection();

    private static HttpRequestDef<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> genForDeleteCloudConnection() {
        // basic
        HttpRequestDef.Builder<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteCloudConnectionRequest.class, DeleteCloudConnectionResponse.class)
            .withName("DeleteCloudConnection")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudConnectionRequest::getId, DeleteCloudConnectionRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionTagsRequest, ListCloudConnectionTagsResponse> listCloudConnectionTags =
        genForListCloudConnectionTags();

    private static HttpRequestDef<ListCloudConnectionTagsRequest, ListCloudConnectionTagsResponse> genForListCloudConnectionTags() {
        // basic
        HttpRequestDef.Builder<ListCloudConnectionTagsRequest, ListCloudConnectionTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCloudConnectionTagsRequest.class, ListCloudConnectionTagsResponse.class)
            .withName("ListCloudConnectionTags")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections/tags")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionsRequest, ListCloudConnectionsResponse> listCloudConnections =
        genForListCloudConnections();

    private static HttpRequestDef<ListCloudConnectionsRequest, ListCloudConnectionsResponse> genForListCloudConnections() {
        // basic
        HttpRequestDef.Builder<ListCloudConnectionsRequest, ListCloudConnectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCloudConnectionsRequest.class, ListCloudConnectionsResponse.class)
            .withName("ListCloudConnections")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getLimit, ListCloudConnectionsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getMarker, ListCloudConnectionsRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getId, ListCloudConnectionsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getName, ListCloudConnectionsRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getDescription,
                ListCloudConnectionsRequest::setDescription));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getEnterpriseProjectId,
                ListCloudConnectionsRequest::setEnterpriseProjectId));
        builder.<List<ListCloudConnectionsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getStatus, ListCloudConnectionsRequest::setStatus));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getType, ListCloudConnectionsRequest::setType));
        builder.<List<String>>withRequestField("used_scene",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getUsedScene,
                ListCloudConnectionsRequest::setUsedScene));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionsByTagsRequest, ListCloudConnectionsByTagsResponse> listCloudConnectionsByTags =
        genForListCloudConnectionsByTags();

    private static HttpRequestDef<ListCloudConnectionsByTagsRequest, ListCloudConnectionsByTagsResponse> genForListCloudConnectionsByTags() {
        // basic
        HttpRequestDef.Builder<ListCloudConnectionsByTagsRequest, ListCloudConnectionsByTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListCloudConnectionsByTagsRequest.class,
                    ListCloudConnectionsByTagsResponse.class)
                .withName("ListCloudConnectionsByTags")
                .withUri("/v3/{domain_id}/ccaas/cloud-connections/filter")
                .withContentType("application/json");

        // requests
        builder.<ListCloudConnectionsByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCloudConnectionsByTagsRequestBody.class),
            f -> f.withMarshaller(ListCloudConnectionsByTagsRequest::getBody,
                ListCloudConnectionsByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudConnectionRequest, ShowCloudConnectionResponse> showCloudConnection =
        genForShowCloudConnection();

    private static HttpRequestDef<ShowCloudConnectionRequest, ShowCloudConnectionResponse> genForShowCloudConnection() {
        // basic
        HttpRequestDef.Builder<ShowCloudConnectionRequest, ShowCloudConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCloudConnectionRequest.class, ShowCloudConnectionResponse.class)
                .withName("ShowCloudConnection")
                .withUri("/v3/{domain_id}/ccaas/cloud-connections/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCloudConnectionRequest::getId, ShowCloudConnectionRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagCloudConnectionRequest, TagCloudConnectionResponse> tagCloudConnection =
        genForTagCloudConnection();

    private static HttpRequestDef<TagCloudConnectionRequest, TagCloudConnectionResponse> genForTagCloudConnection() {
        // basic
        HttpRequestDef.Builder<TagCloudConnectionRequest, TagCloudConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TagCloudConnectionRequest.class, TagCloudConnectionResponse.class)
                .withName("TagCloudConnection")
                .withUri("/v3/{domain_id}/ccaas/cloud-connections/{id}/tag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagCloudConnectionRequest::getId, TagCloudConnectionRequest::setId));
        builder.<TagCloudConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagCloudConnectionRequestBody.class),
            f -> f.withMarshaller(TagCloudConnectionRequest::getBody, TagCloudConnectionRequest::setBody));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(TagCloudConnectionResponse::getXRequestId,
                TagCloudConnectionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UntagCloudConnectionRequest, UntagCloudConnectionResponse> untagCloudConnection =
        genForUntagCloudConnection();

    private static HttpRequestDef<UntagCloudConnectionRequest, UntagCloudConnectionResponse> genForUntagCloudConnection() {
        // basic
        HttpRequestDef.Builder<UntagCloudConnectionRequest, UntagCloudConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UntagCloudConnectionRequest.class, UntagCloudConnectionResponse.class)
            .withName("UntagCloudConnection")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections/{id}/untag")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UntagCloudConnectionRequest::getId, UntagCloudConnectionRequest::setId));
        builder.<UntagCloudConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UntagCloudConnectionRequestBody.class),
            f -> f.withMarshaller(UntagCloudConnectionRequest::getBody, UntagCloudConnectionRequest::setBody));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UntagCloudConnectionResponse::getXRequestId,
                UntagCloudConnectionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> updateCloudConnection =
        genForUpdateCloudConnection();

    private static HttpRequestDef<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> genForUpdateCloudConnection() {
        // basic
        HttpRequestDef.Builder<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateCloudConnectionRequest.class, UpdateCloudConnectionResponse.class)
            .withName("UpdateCloudConnection")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCloudConnectionRequest::getId, UpdateCloudConnectionRequest::setId));
        builder.<UpdateCloudConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCloudConnectionRequestBody.class),
            f -> f.withMarshaller(UpdateCloudConnectionRequest::getBody, UpdateCloudConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionCapabilitiesRequest, ListCloudConnectionCapabilitiesResponse> listCloudConnectionCapabilities =
        genForListCloudConnectionCapabilities();

    private static HttpRequestDef<ListCloudConnectionCapabilitiesRequest, ListCloudConnectionCapabilitiesResponse> genForListCloudConnectionCapabilities() {
        // basic
        HttpRequestDef.Builder<ListCloudConnectionCapabilitiesRequest, ListCloudConnectionCapabilitiesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCloudConnectionCapabilitiesRequest.class,
                    ListCloudConnectionCapabilitiesResponse.class)
                .withName("ListCloudConnectionCapabilities")
                .withUri("/v3/{domain_id}/ccaas/capabilities")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionCapabilitiesRequest::getResourceType,
                ListCloudConnectionCapabilitiesRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionQuotasRequest, ListCloudConnectionQuotasResponse> listCloudConnectionQuotas =
        genForListCloudConnectionQuotas();

    private static HttpRequestDef<ListCloudConnectionQuotasRequest, ListCloudConnectionQuotasResponse> genForListCloudConnectionQuotas() {
        // basic
        HttpRequestDef.Builder<ListCloudConnectionQuotasRequest, ListCloudConnectionQuotasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCloudConnectionQuotasRequest.class,
                    ListCloudConnectionQuotasResponse.class)
                .withName("ListCloudConnectionQuotas")
                .withUri("/v3/{domain_id}/ccaas/quotas")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudConnectionQuotasRequest::getLimit,
                ListCloudConnectionQuotasRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionQuotasRequest::getMarker,
                ListCloudConnectionQuotasRequest::setMarker));
        builder.<ListCloudConnectionQuotasRequest.QuotaTypeEnum>withRequestField("quota_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCloudConnectionQuotasRequest.QuotaTypeEnum.class),
            f -> f.withMarshaller(ListCloudConnectionQuotasRequest::getQuotaType,
                ListCloudConnectionQuotasRequest::setQuotaType));
        builder.<String>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionQuotasRequest::getCloudConnectionId,
                ListCloudConnectionQuotasRequest::setCloudConnectionId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionQuotasRequest::getRegionId,
                ListCloudConnectionQuotasRequest::setRegionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> listCloudConnectionRoutes =
        genForListCloudConnectionRoutes();

    private static HttpRequestDef<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> genForListCloudConnectionRoutes() {
        // basic
        HttpRequestDef.Builder<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCloudConnectionRoutesRequest.class,
                    ListCloudConnectionRoutesResponse.class)
                .withName("ListCloudConnectionRoutes")
                .withUri("/v3/{domain_id}/ccaas/cloud-connection-routes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getLimit,
                ListCloudConnectionRoutesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getMarker,
                ListCloudConnectionRoutesRequest::setMarker));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getCloudConnectionId,
                ListCloudConnectionRoutesRequest::setCloudConnectionId));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getInstanceId,
                ListCloudConnectionRoutesRequest::setInstanceId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getRegionId,
                ListCloudConnectionRoutesRequest::setRegionId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getId, ListCloudConnectionRoutesRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> showCloudConnectionRoutes =
        genForShowCloudConnectionRoutes();

    private static HttpRequestDef<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> genForShowCloudConnectionRoutes() {
        // basic
        HttpRequestDef.Builder<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCloudConnectionRoutesRequest.class,
                    ShowCloudConnectionRoutesResponse.class)
                .withName("ShowCloudConnectionRoutes")
                .withUri("/v3/{domain_id}/ccaas/cloud-connection-routes/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCloudConnectionRoutesRequest::getId, ShowCloudConnectionRoutesRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateGcbResourceTagsRequest, BatchCreateGcbResourceTagsResponse> batchCreateGcbResourceTags =
        genForBatchCreateGcbResourceTags();

    private static HttpRequestDef<BatchCreateGcbResourceTagsRequest, BatchCreateGcbResourceTagsResponse> genForBatchCreateGcbResourceTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateGcbResourceTagsRequest, BatchCreateGcbResourceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateGcbResourceTagsRequest.class,
                    BatchCreateGcbResourceTagsResponse.class)
                .withName("BatchCreateGcbResourceTags")
                .withUri("/v3/gcb/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateGcbResourceTagsRequest::getResourceId,
                BatchCreateGcbResourceTagsRequest::setResourceId));
        builder.<CreateDeleteGcbTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDeleteGcbTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateGcbResourceTagsRequest::getBody,
                BatchCreateGcbResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteGcbResourceTagsRequest, BatchDeleteGcbResourceTagsResponse> batchDeleteGcbResourceTags =
        genForBatchDeleteGcbResourceTags();

    private static HttpRequestDef<BatchDeleteGcbResourceTagsRequest, BatchDeleteGcbResourceTagsResponse> genForBatchDeleteGcbResourceTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteGcbResourceTagsRequest, BatchDeleteGcbResourceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteGcbResourceTagsRequest.class,
                    BatchDeleteGcbResourceTagsResponse.class)
                .withName("BatchDeleteGcbResourceTags")
                .withUri("/v3/gcb/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteGcbResourceTagsRequest::getResourceId,
                BatchDeleteGcbResourceTagsRequest::setResourceId));
        builder.<CreateDeleteGcbTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDeleteGcbTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteGcbResourceTagsRequest::getBody,
                BatchDeleteGcbResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountGcbResourceByTagRequest, CountGcbResourceByTagResponse> countGcbResourceByTag =
        genForCountGcbResourceByTag();

    private static HttpRequestDef<CountGcbResourceByTagRequest, CountGcbResourceByTagResponse> genForCountGcbResourceByTag() {
        // basic
        HttpRequestDef.Builder<CountGcbResourceByTagRequest, CountGcbResourceByTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CountGcbResourceByTagRequest.class, CountGcbResourceByTagResponse.class)
            .withName("CountGcbResourceByTag")
            .withUri("/v3/gcb/resource-instances/count")
            .withContentType("application/json");

        // requests
        builder.<QueryResourceByTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryResourceByTagRequestBody.class),
            f -> f.withMarshaller(CountGcbResourceByTagRequest::getBody, CountGcbResourceByTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGcbResourceTagRequest, CreateGcbResourceTagResponse> createGcbResourceTag =
        genForCreateGcbResourceTag();

    private static HttpRequestDef<CreateGcbResourceTagRequest, CreateGcbResourceTagResponse> genForCreateGcbResourceTag() {
        // basic
        HttpRequestDef.Builder<CreateGcbResourceTagRequest, CreateGcbResourceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGcbResourceTagRequest.class, CreateGcbResourceTagResponse.class)
            .withName("CreateGcbResourceTag")
            .withUri("/v3/gcb/{resource_id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGcbResourceTagRequest::getResourceId,
                CreateGcbResourceTagRequest::setResourceId));
        builder.<CreateGcbTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGcbTagRequestBody.class),
            f -> f.withMarshaller(CreateGcbResourceTagRequest::getBody, CreateGcbResourceTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGcbResourceTagRequest, DeleteGcbResourceTagResponse> deleteGcbResourceTag =
        genForDeleteGcbResourceTag();

    private static HttpRequestDef<DeleteGcbResourceTagRequest, DeleteGcbResourceTagResponse> genForDeleteGcbResourceTag() {
        // basic
        HttpRequestDef.Builder<DeleteGcbResourceTagRequest, DeleteGcbResourceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGcbResourceTagRequest.class, DeleteGcbResourceTagResponse.class)
            .withName("DeleteGcbResourceTag")
            .withUri("/v3/gcb/{resource_id}/tags/{tag_key}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGcbResourceTagRequest::getResourceId,
                DeleteGcbResourceTagRequest::setResourceId));
        builder.<String>withRequestField("tag_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGcbResourceTagRequest::getTagKey, DeleteGcbResourceTagRequest::setTagKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGcbResourceByTagRequest, ListGcbResourceByTagResponse> listGcbResourceByTag =
        genForListGcbResourceByTag();

    private static HttpRequestDef<ListGcbResourceByTagRequest, ListGcbResourceByTagResponse> genForListGcbResourceByTag() {
        // basic
        HttpRequestDef.Builder<ListGcbResourceByTagRequest, ListGcbResourceByTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListGcbResourceByTagRequest.class, ListGcbResourceByTagResponse.class)
            .withName("ListGcbResourceByTag")
            .withUri("/v3/gcb/resource-instances/filter")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGcbResourceByTagRequest::getLimit, ListGcbResourceByTagRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGcbResourceByTagRequest::getOffset, ListGcbResourceByTagRequest::setOffset));
        builder.<QueryResourceByTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryResourceByTagRequestBody.class),
            f -> f.withMarshaller(ListGcbResourceByTagRequest::getBody, ListGcbResourceByTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGcbResourceTagsRequest, ListGcbResourceTagsResponse> listGcbResourceTags =
        genForListGcbResourceTags();

    private static HttpRequestDef<ListGcbResourceTagsRequest, ListGcbResourceTagsResponse> genForListGcbResourceTags() {
        // basic
        HttpRequestDef.Builder<ListGcbResourceTagsRequest, ListGcbResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGcbResourceTagsRequest.class, ListGcbResourceTagsResponse.class)
                .withName("ListGcbResourceTags")
                .withUri("/v3/gcb/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGcbResourceTagsRequest::getResourceId,
                ListGcbResourceTagsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGcbTenantTagsRequest, ListGcbTenantTagsResponse> listGcbTenantTags =
        genForListGcbTenantTags();

    private static HttpRequestDef<ListGcbTenantTagsRequest, ListGcbTenantTagsResponse> genForListGcbTenantTags() {
        // basic
        HttpRequestDef.Builder<ListGcbTenantTagsRequest, ListGcbTenantTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGcbTenantTagsRequest.class, ListGcbTenantTagsResponse.class)
                .withName("ListGcbTenantTags")
                .withUri("/v3/gcb/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateGlobalConnectionBandwidthInstanceRequest, AssociateGlobalConnectionBandwidthInstanceResponse> associateGlobalConnectionBandwidthInstance =
        genForAssociateGlobalConnectionBandwidthInstance();

    private static HttpRequestDef<AssociateGlobalConnectionBandwidthInstanceRequest, AssociateGlobalConnectionBandwidthInstanceResponse> genForAssociateGlobalConnectionBandwidthInstance() {
        // basic
        HttpRequestDef.Builder<AssociateGlobalConnectionBandwidthInstanceRequest, AssociateGlobalConnectionBandwidthInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateGlobalConnectionBandwidthInstanceRequest.class,
                    AssociateGlobalConnectionBandwidthInstanceResponse.class)
                .withName("AssociateGlobalConnectionBandwidthInstance")
                .withUri("/v3/{domain_id}/gcb/gcbandwidths/{id}/associate-instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateGlobalConnectionBandwidthInstanceRequest::getId,
                AssociateGlobalConnectionBandwidthInstanceRequest::setId));
        builder.<AssociateGlobalConnectionBandwidthInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateGlobalConnectionBandwidthInstanceRequestBody.class),
            f -> f.withMarshaller(AssociateGlobalConnectionBandwidthInstanceRequest::getBody,
                AssociateGlobalConnectionBandwidthInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGlobalConnectionBandwidthRequest, CreateGlobalConnectionBandwidthResponse> createGlobalConnectionBandwidth =
        genForCreateGlobalConnectionBandwidth();

    private static HttpRequestDef<CreateGlobalConnectionBandwidthRequest, CreateGlobalConnectionBandwidthResponse> genForCreateGlobalConnectionBandwidth() {
        // basic
        HttpRequestDef.Builder<CreateGlobalConnectionBandwidthRequest, CreateGlobalConnectionBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateGlobalConnectionBandwidthRequest.class,
                    CreateGlobalConnectionBandwidthResponse.class)
                .withName("CreateGlobalConnectionBandwidth")
                .withUri("/v3/{domain_id}/gcb/gcbandwidths")
                .withContentType("application/json");

        // requests
        builder.<CreateGlobalConnectionBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGlobalConnectionBandwidthRequestBody.class),
            f -> f.withMarshaller(CreateGlobalConnectionBandwidthRequest::getBody,
                CreateGlobalConnectionBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGlobalConnectionBandwidthRequest, DeleteGlobalConnectionBandwidthResponse> deleteGlobalConnectionBandwidth =
        genForDeleteGlobalConnectionBandwidth();

    private static HttpRequestDef<DeleteGlobalConnectionBandwidthRequest, DeleteGlobalConnectionBandwidthResponse> genForDeleteGlobalConnectionBandwidth() {
        // basic
        HttpRequestDef.Builder<DeleteGlobalConnectionBandwidthRequest, DeleteGlobalConnectionBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGlobalConnectionBandwidthRequest.class,
                    DeleteGlobalConnectionBandwidthResponse.class)
                .withName("DeleteGlobalConnectionBandwidth")
                .withUri("/v3/{domain_id}/gcb/gcbandwidths/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGlobalConnectionBandwidthRequest::getId,
                DeleteGlobalConnectionBandwidthRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateGlobalConnectionBandwidthInstanceRequest, DisassociateGlobalConnectionBandwidthInstanceResponse> disassociateGlobalConnectionBandwidthInstance =
        genForDisassociateGlobalConnectionBandwidthInstance();

    private static HttpRequestDef<DisassociateGlobalConnectionBandwidthInstanceRequest, DisassociateGlobalConnectionBandwidthInstanceResponse> genForDisassociateGlobalConnectionBandwidthInstance() {
        // basic
        HttpRequestDef.Builder<DisassociateGlobalConnectionBandwidthInstanceRequest, DisassociateGlobalConnectionBandwidthInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisassociateGlobalConnectionBandwidthInstanceRequest.class,
                    DisassociateGlobalConnectionBandwidthInstanceResponse.class)
                .withName("DisassociateGlobalConnectionBandwidthInstance")
                .withUri("/v3/{domain_id}/gcb/gcbandwidths/{id}/disassociate-instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateGlobalConnectionBandwidthInstanceRequest::getId,
                DisassociateGlobalConnectionBandwidthInstanceRequest::setId));
        builder.<DisassociateGlobalConnectionBandwidthInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateGlobalConnectionBandwidthInstanceRequestBody.class),
            f -> f.withMarshaller(DisassociateGlobalConnectionBandwidthInstanceRequest::getBody,
                DisassociateGlobalConnectionBandwidthInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalConnectionBandwidthConfigsRequest, ListGlobalConnectionBandwidthConfigsResponse> listGlobalConnectionBandwidthConfigs =
        genForListGlobalConnectionBandwidthConfigs();

    private static HttpRequestDef<ListGlobalConnectionBandwidthConfigsRequest, ListGlobalConnectionBandwidthConfigsResponse> genForListGlobalConnectionBandwidthConfigs() {
        // basic
        HttpRequestDef.Builder<ListGlobalConnectionBandwidthConfigsRequest, ListGlobalConnectionBandwidthConfigsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGlobalConnectionBandwidthConfigsRequest.class,
                    ListGlobalConnectionBandwidthConfigsResponse.class)
                .withName("ListGlobalConnectionBandwidthConfigs")
                .withUri("/v3/{domain_id}/gcb/configs")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalConnectionBandwidthLineLevelsRequest, ListGlobalConnectionBandwidthLineLevelsResponse> listGlobalConnectionBandwidthLineLevels =
        genForListGlobalConnectionBandwidthLineLevels();

    private static HttpRequestDef<ListGlobalConnectionBandwidthLineLevelsRequest, ListGlobalConnectionBandwidthLineLevelsResponse> genForListGlobalConnectionBandwidthLineLevels() {
        // basic
        HttpRequestDef.Builder<ListGlobalConnectionBandwidthLineLevelsRequest, ListGlobalConnectionBandwidthLineLevelsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGlobalConnectionBandwidthLineLevelsRequest.class,
                    ListGlobalConnectionBandwidthLineLevelsResponse.class)
                .withName("ListGlobalConnectionBandwidthLineLevels")
                .withUri("/v3/{domain_id}/gcb/line-levels")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthLineLevelsRequest::getLimit,
                ListGlobalConnectionBandwidthLineLevelsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthLineLevelsRequest::getMarker,
                ListGlobalConnectionBandwidthLineLevelsRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthLineLevelsRequest::getId,
                ListGlobalConnectionBandwidthLineLevelsRequest::setId));
        builder.<String>withRequestField("local_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthLineLevelsRequest::getLocalArea,
                ListGlobalConnectionBandwidthLineLevelsRequest::setLocalArea));
        builder.<String>withRequestField("remote_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthLineLevelsRequest::getRemoteArea,
                ListGlobalConnectionBandwidthLineLevelsRequest::setRemoteArea));
        builder.<List<ListGlobalConnectionBandwidthLineLevelsRequest.LevelsEnum>>withRequestField("levels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthLineLevelsRequest::getLevels,
                ListGlobalConnectionBandwidthLineLevelsRequest::setLevels));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalConnectionBandwidthSitesRequest, ListGlobalConnectionBandwidthSitesResponse> listGlobalConnectionBandwidthSites =
        genForListGlobalConnectionBandwidthSites();

    private static HttpRequestDef<ListGlobalConnectionBandwidthSitesRequest, ListGlobalConnectionBandwidthSitesResponse> genForListGlobalConnectionBandwidthSites() {
        // basic
        HttpRequestDef.Builder<ListGlobalConnectionBandwidthSitesRequest, ListGlobalConnectionBandwidthSitesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGlobalConnectionBandwidthSitesRequest.class,
                    ListGlobalConnectionBandwidthSitesResponse.class)
                .withName("ListGlobalConnectionBandwidthSites")
                .withUri("/v3/{domain_id}/gcb/sites")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthSitesRequest::getLimit,
                ListGlobalConnectionBandwidthSitesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthSitesRequest::getMarker,
                ListGlobalConnectionBandwidthSitesRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthSitesRequest::getId,
                ListGlobalConnectionBandwidthSitesRequest::setId));
        builder.<String>withRequestField("name_en",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthSitesRequest::getNameEn,
                ListGlobalConnectionBandwidthSitesRequest::setNameEn));
        builder.<String>withRequestField("name_cn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthSitesRequest::getNameCn,
                ListGlobalConnectionBandwidthSitesRequest::setNameCn));
        builder.<String>withRequestField("site_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthSitesRequest::getSiteCode,
                ListGlobalConnectionBandwidthSitesRequest::setSiteCode));
        builder.<ListGlobalConnectionBandwidthSitesRequest.SiteTypeEnum>withRequestField("site_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGlobalConnectionBandwidthSitesRequest.SiteTypeEnum.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthSitesRequest::getSiteType,
                ListGlobalConnectionBandwidthSitesRequest::setSiteType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalConnectionBandwidthSpecCodesRequest, ListGlobalConnectionBandwidthSpecCodesResponse> listGlobalConnectionBandwidthSpecCodes =
        genForListGlobalConnectionBandwidthSpecCodes();

    private static HttpRequestDef<ListGlobalConnectionBandwidthSpecCodesRequest, ListGlobalConnectionBandwidthSpecCodesResponse> genForListGlobalConnectionBandwidthSpecCodes() {
        // basic
        HttpRequestDef.Builder<ListGlobalConnectionBandwidthSpecCodesRequest, ListGlobalConnectionBandwidthSpecCodesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGlobalConnectionBandwidthSpecCodesRequest.class,
                    ListGlobalConnectionBandwidthSpecCodesResponse.class)
                .withName("ListGlobalConnectionBandwidthSpecCodes")
                .withUri("/v3/{domain_id}/gcb/spec-codes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthSpecCodesRequest::getLimit,
                ListGlobalConnectionBandwidthSpecCodesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthSpecCodesRequest::getMarker,
                ListGlobalConnectionBandwidthSpecCodesRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthSpecCodesRequest::getId,
                ListGlobalConnectionBandwidthSpecCodesRequest::setId));
        builder.<String>withRequestField("local_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthSpecCodesRequest::getLocalArea,
                ListGlobalConnectionBandwidthSpecCodesRequest::setLocalArea));
        builder.<String>withRequestField("remote_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthSpecCodesRequest::getRemoteArea,
                ListGlobalConnectionBandwidthSpecCodesRequest::setRemoteArea));
        builder.<List<ListGlobalConnectionBandwidthSpecCodesRequest.LevelEnum>>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthSpecCodesRequest::getLevel,
                ListGlobalConnectionBandwidthSpecCodesRequest::setLevel));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalConnectionBandwidthsRequest, ListGlobalConnectionBandwidthsResponse> listGlobalConnectionBandwidths =
        genForListGlobalConnectionBandwidths();

    private static HttpRequestDef<ListGlobalConnectionBandwidthsRequest, ListGlobalConnectionBandwidthsResponse> genForListGlobalConnectionBandwidths() {
        // basic
        HttpRequestDef.Builder<ListGlobalConnectionBandwidthsRequest, ListGlobalConnectionBandwidthsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGlobalConnectionBandwidthsRequest.class,
                    ListGlobalConnectionBandwidthsResponse.class)
                .withName("ListGlobalConnectionBandwidths")
                .withUri("/v3/{domain_id}/gcb/gcbandwidths")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthsRequest::getLimit,
                ListGlobalConnectionBandwidthsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthsRequest::getMarker,
                ListGlobalConnectionBandwidthsRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthsRequest::getId,
                ListGlobalConnectionBandwidthsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthsRequest::getName,
                ListGlobalConnectionBandwidthsRequest::setName));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthsRequest::getEnterpriseProjectId,
                ListGlobalConnectionBandwidthsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthsRequest::getInstanceId,
                ListGlobalConnectionBandwidthsRequest::setInstanceId));
        builder.<List<ListGlobalConnectionBandwidthsRequest.InstanceTypeEnum>>withRequestField("instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthsRequest::getInstanceType,
                ListGlobalConnectionBandwidthsRequest::setInstanceType));
        builder.<List<ListGlobalConnectionBandwidthsRequest.BindingServiceEnum>>withRequestField("binding_service",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthsRequest::getBindingService,
                ListGlobalConnectionBandwidthsRequest::setBindingService));
        builder.<List<ListGlobalConnectionBandwidthsRequest.TypeEnum>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthsRequest::getType,
                ListGlobalConnectionBandwidthsRequest::setType));
        builder.<List<ListGlobalConnectionBandwidthsRequest.AdminStateEnum>>withRequestField("admin_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthsRequest::getAdminState,
                ListGlobalConnectionBandwidthsRequest::setAdminState));
        builder.<List<ListGlobalConnectionBandwidthsRequest.ChargeModeEnum>>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalConnectionBandwidthsRequest::getChargeMode,
                ListGlobalConnectionBandwidthsRequest::setChargeMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSupportBindingConnectionBandwidthsRequest, ListSupportBindingConnectionBandwidthsResponse> listSupportBindingConnectionBandwidths =
        genForListSupportBindingConnectionBandwidths();

    private static HttpRequestDef<ListSupportBindingConnectionBandwidthsRequest, ListSupportBindingConnectionBandwidthsResponse> genForListSupportBindingConnectionBandwidths() {
        // basic
        HttpRequestDef.Builder<ListSupportBindingConnectionBandwidthsRequest, ListSupportBindingConnectionBandwidthsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSupportBindingConnectionBandwidthsRequest.class,
                    ListSupportBindingConnectionBandwidthsResponse.class)
                .withName("ListSupportBindingConnectionBandwidths")
                .withUri("/v3/{domain_id}/gcb/gcbandwidths/support-bindings")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSupportBindingConnectionBandwidthsRequest::getLimit,
                ListSupportBindingConnectionBandwidthsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupportBindingConnectionBandwidthsRequest::getMarker,
                ListSupportBindingConnectionBandwidthsRequest::setMarker));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportBindingConnectionBandwidthsRequest::getEnterpriseProjectId,
                ListSupportBindingConnectionBandwidthsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("local_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupportBindingConnectionBandwidthsRequest::getLocalArea,
                ListSupportBindingConnectionBandwidthsRequest::setLocalArea));
        builder.<String>withRequestField("remote_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupportBindingConnectionBandwidthsRequest::getRemoteArea,
                ListSupportBindingConnectionBandwidthsRequest::setRemoteArea));
        builder.<ListSupportBindingConnectionBandwidthsRequest.BindingServiceEnum>withRequestField("binding_service",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSupportBindingConnectionBandwidthsRequest.BindingServiceEnum.class),
            f -> f.withMarshaller(ListSupportBindingConnectionBandwidthsRequest::getBindingService,
                ListSupportBindingConnectionBandwidthsRequest::setBindingService));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGlobalConnectionBandwidthRequest, ShowGlobalConnectionBandwidthResponse> showGlobalConnectionBandwidth =
        genForShowGlobalConnectionBandwidth();

    private static HttpRequestDef<ShowGlobalConnectionBandwidthRequest, ShowGlobalConnectionBandwidthResponse> genForShowGlobalConnectionBandwidth() {
        // basic
        HttpRequestDef.Builder<ShowGlobalConnectionBandwidthRequest, ShowGlobalConnectionBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGlobalConnectionBandwidthRequest.class,
                    ShowGlobalConnectionBandwidthResponse.class)
                .withName("ShowGlobalConnectionBandwidth")
                .withUri("/v3/{domain_id}/gcb/gcbandwidths/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlobalConnectionBandwidthRequest::getId,
                ShowGlobalConnectionBandwidthRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGlobalConnectionBandwidthRequest, UpdateGlobalConnectionBandwidthResponse> updateGlobalConnectionBandwidth =
        genForUpdateGlobalConnectionBandwidth();

    private static HttpRequestDef<UpdateGlobalConnectionBandwidthRequest, UpdateGlobalConnectionBandwidthResponse> genForUpdateGlobalConnectionBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdateGlobalConnectionBandwidthRequest, UpdateGlobalConnectionBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGlobalConnectionBandwidthRequest.class,
                    UpdateGlobalConnectionBandwidthResponse.class)
                .withName("UpdateGlobalConnectionBandwidth")
                .withUri("/v3/{domain_id}/gcb/gcbandwidths/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGlobalConnectionBandwidthRequest::getId,
                UpdateGlobalConnectionBandwidthRequest::setId));
        builder.<UpdateGlobalConnectionBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGlobalConnectionBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdateGlobalConnectionBandwidthRequest::getBody,
                UpdateGlobalConnectionBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse> createInterRegionBandwidth =
        genForCreateInterRegionBandwidth();

    private static HttpRequestDef<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse> genForCreateInterRegionBandwidth() {
        // basic
        HttpRequestDef.Builder<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInterRegionBandwidthRequest.class,
                    CreateInterRegionBandwidthResponse.class)
                .withName("CreateInterRegionBandwidth")
                .withUri("/v3/{domain_id}/ccaas/inter-region-bandwidths")
                .withContentType("application/json");

        // requests
        builder.<CreateInterRegionBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInterRegionBandwidthRequestBody.class),
            f -> f.withMarshaller(CreateInterRegionBandwidthRequest::getBody,
                CreateInterRegionBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse> deleteInterRegionBandwidth =
        genForDeleteInterRegionBandwidth();

    private static HttpRequestDef<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse> genForDeleteInterRegionBandwidth() {
        // basic
        HttpRequestDef.Builder<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInterRegionBandwidthRequest.class,
                    DeleteInterRegionBandwidthResponse.class)
                .withName("DeleteInterRegionBandwidth")
                .withUri("/v3/{domain_id}/ccaas/inter-region-bandwidths/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInterRegionBandwidthRequest::getId, DeleteInterRegionBandwidthRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse> listInterRegionBandwidths =
        genForListInterRegionBandwidths();

    private static HttpRequestDef<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse> genForListInterRegionBandwidths() {
        // basic
        HttpRequestDef.Builder<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInterRegionBandwidthsRequest.class,
                    ListInterRegionBandwidthsResponse.class)
                .withName("ListInterRegionBandwidths")
                .withUri("/v3/{domain_id}/ccaas/inter-region-bandwidths")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getLimit,
                ListInterRegionBandwidthsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getMarker,
                ListInterRegionBandwidthsRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getId, ListInterRegionBandwidthsRequest::setId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getEnterpriseProjectId,
                ListInterRegionBandwidthsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getCloudConnectionId,
                ListInterRegionBandwidthsRequest::setCloudConnectionId));
        builder.<List<String>>withRequestField("bandwidth_package_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getBandwidthPackageId,
                ListInterRegionBandwidthsRequest::setBandwidthPackageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse> showInterRegionBandwidth =
        genForShowInterRegionBandwidth();

    private static HttpRequestDef<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse> genForShowInterRegionBandwidth() {
        // basic
        HttpRequestDef.Builder<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowInterRegionBandwidthRequest.class, ShowInterRegionBandwidthResponse.class)
                .withName("ShowInterRegionBandwidth")
                .withUri("/v3/{domain_id}/ccaas/inter-region-bandwidths/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInterRegionBandwidthRequest::getId, ShowInterRegionBandwidthRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse> updateInterRegionBandwidth =
        genForUpdateInterRegionBandwidth();

    private static HttpRequestDef<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse> genForUpdateInterRegionBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInterRegionBandwidthRequest.class,
                    UpdateInterRegionBandwidthResponse.class)
                .withName("UpdateInterRegionBandwidth")
                .withUri("/v3/{domain_id}/ccaas/inter-region-bandwidths/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInterRegionBandwidthRequest::getId, UpdateInterRegionBandwidthRequest::setId));
        builder.<UpdateInterRegionBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInterRegionBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdateInterRegionBandwidthRequest::getBody,
                UpdateInterRegionBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> createNetworkInstance =
        genForCreateNetworkInstance();

    private static HttpRequestDef<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> genForCreateNetworkInstance() {
        // basic
        HttpRequestDef.Builder<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateNetworkInstanceRequest.class, CreateNetworkInstanceResponse.class)
            .withName("CreateNetworkInstance")
            .withUri("/v3/{domain_id}/ccaas/network-instances")
            .withContentType("application/json");

        // requests
        builder.<CreateNetworkInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNetworkInstanceRequestBody.class),
            f -> f.withMarshaller(CreateNetworkInstanceRequest::getBody, CreateNetworkInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> deleteNetworkInstance =
        genForDeleteNetworkInstance();

    private static HttpRequestDef<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> genForDeleteNetworkInstance() {
        // basic
        HttpRequestDef.Builder<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteNetworkInstanceRequest.class, DeleteNetworkInstanceResponse.class)
            .withName("DeleteNetworkInstance")
            .withUri("/v3/{domain_id}/ccaas/network-instances/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNetworkInstanceRequest::getId, DeleteNetworkInstanceRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNetworkInstancesRequest, ListNetworkInstancesResponse> listNetworkInstances =
        genForListNetworkInstances();

    private static HttpRequestDef<ListNetworkInstancesRequest, ListNetworkInstancesResponse> genForListNetworkInstances() {
        // basic
        HttpRequestDef.Builder<ListNetworkInstancesRequest, ListNetworkInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNetworkInstancesRequest.class, ListNetworkInstancesResponse.class)
            .withName("ListNetworkInstances")
            .withUri("/v3/{domain_id}/ccaas/network-instances")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getLimit, ListNetworkInstancesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getMarker, ListNetworkInstancesRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getId, ListNetworkInstancesRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getName, ListNetworkInstancesRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getDescription,
                ListNetworkInstancesRequest::setDescription));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getCloudConnectionId,
                ListNetworkInstancesRequest::setCloudConnectionId));
        builder.<List<ListNetworkInstancesRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getStatus, ListNetworkInstancesRequest::setStatus));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getType, ListNetworkInstancesRequest::setType));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getInstanceId,
                ListNetworkInstancesRequest::setInstanceId));
        builder.<List<String>>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getRegionId, ListNetworkInstancesRequest::setRegionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> showNetworkInstance =
        genForShowNetworkInstance();

    private static HttpRequestDef<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> genForShowNetworkInstance() {
        // basic
        HttpRequestDef.Builder<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNetworkInstanceRequest.class, ShowNetworkInstanceResponse.class)
                .withName("ShowNetworkInstance")
                .withUri("/v3/{domain_id}/ccaas/network-instances/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNetworkInstanceRequest::getId, ShowNetworkInstanceRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> updateNetworkInstance =
        genForUpdateNetworkInstance();

    private static HttpRequestDef<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> genForUpdateNetworkInstance() {
        // basic
        HttpRequestDef.Builder<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateNetworkInstanceRequest.class, UpdateNetworkInstanceResponse.class)
            .withName("UpdateNetworkInstance")
            .withUri("/v3/{domain_id}/ccaas/network-instances/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNetworkInstanceRequest::getId, UpdateNetworkInstanceRequest::setId));
        builder.<UpdateNetworkInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNetworkInstanceRequestBody.class),
            f -> f.withMarshaller(UpdateNetworkInstanceRequest::getBody, UpdateNetworkInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateSiteNetworkBandwidthRequest, AssociateSiteNetworkBandwidthResponse> associateSiteNetworkBandwidth =
        genForAssociateSiteNetworkBandwidth();

    private static HttpRequestDef<AssociateSiteNetworkBandwidthRequest, AssociateSiteNetworkBandwidthResponse> genForAssociateSiteNetworkBandwidth() {
        // basic
        HttpRequestDef.Builder<AssociateSiteNetworkBandwidthRequest, AssociateSiteNetworkBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateSiteNetworkBandwidthRequest.class,
                    AssociateSiteNetworkBandwidthResponse.class)
                .withName("AssociateSiteNetworkBandwidth")
                .withUri(
                    "/v3/{domain_id}/dcaas/site-network/{site_network_id}/connections/{site_connection_id}/associate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateSiteNetworkBandwidthRequest::getSiteNetworkId,
                AssociateSiteNetworkBandwidthRequest::setSiteNetworkId));
        builder.<String>withRequestField("site_connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateSiteNetworkBandwidthRequest::getSiteConnectionId,
                AssociateSiteNetworkBandwidthRequest::setSiteConnectionId));
        builder.<AssociateSiteConnectionBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateSiteConnectionBandwidthRequestBody.class),
            f -> f.withMarshaller(AssociateSiteNetworkBandwidthRequest::getBody,
                AssociateSiteNetworkBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateSiteNetworkBandwidthRequest, DisassociateSiteNetworkBandwidthResponse> disassociateSiteNetworkBandwidth =
        genForDisassociateSiteNetworkBandwidth();

    private static HttpRequestDef<DisassociateSiteNetworkBandwidthRequest, DisassociateSiteNetworkBandwidthResponse> genForDisassociateSiteNetworkBandwidth() {
        // basic
        HttpRequestDef.Builder<DisassociateSiteNetworkBandwidthRequest, DisassociateSiteNetworkBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisassociateSiteNetworkBandwidthRequest.class,
                    DisassociateSiteNetworkBandwidthResponse.class)
                .withName("DisassociateSiteNetworkBandwidth")
                .withUri(
                    "/v3/{domain_id}/dcaas/site-network/{site_network_id}/connections/{site_connection_id}/disassociate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateSiteNetworkBandwidthRequest::getSiteNetworkId,
                DisassociateSiteNetworkBandwidthRequest::setSiteNetworkId));
        builder.<String>withRequestField("site_connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateSiteNetworkBandwidthRequest::getSiteConnectionId,
                DisassociateSiteNetworkBandwidthRequest::setSiteConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSiteNetworkBandwidthRequest, UpdateSiteNetworkBandwidthResponse> updateSiteNetworkBandwidth =
        genForUpdateSiteNetworkBandwidth();

    private static HttpRequestDef<UpdateSiteNetworkBandwidthRequest, UpdateSiteNetworkBandwidthResponse> genForUpdateSiteNetworkBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdateSiteNetworkBandwidthRequest, UpdateSiteNetworkBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateSiteNetworkBandwidthRequest.class,
                    UpdateSiteNetworkBandwidthResponse.class)
                .withName("UpdateSiteNetworkBandwidth")
                .withUri(
                    "/v3/{domain_id}/dcaas/site-network/{site_network_id}/connections/{site_connection_id}/update-bandwidth")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSiteNetworkBandwidthRequest::getSiteNetworkId,
                UpdateSiteNetworkBandwidthRequest::setSiteNetworkId));
        builder.<String>withRequestField("site_connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSiteNetworkBandwidthRequest::getSiteConnectionId,
                UpdateSiteNetworkBandwidthRequest::setSiteConnectionId));
        builder.<UpdateSiteConnectionBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSiteConnectionBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdateSiteNetworkBandwidthRequest::getBody,
                UpdateSiteNetworkBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSiteNetworkBandwidthSizeRequest, UpdateSiteNetworkBandwidthSizeResponse> updateSiteNetworkBandwidthSize =
        genForUpdateSiteNetworkBandwidthSize();

    private static HttpRequestDef<UpdateSiteNetworkBandwidthSizeRequest, UpdateSiteNetworkBandwidthSizeResponse> genForUpdateSiteNetworkBandwidthSize() {
        // basic
        HttpRequestDef.Builder<UpdateSiteNetworkBandwidthSizeRequest, UpdateSiteNetworkBandwidthSizeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateSiteNetworkBandwidthSizeRequest.class,
                    UpdateSiteNetworkBandwidthSizeResponse.class)
                .withName("UpdateSiteNetworkBandwidthSize")
                .withUri(
                    "/v3/{domain_id}/dcaas/site-network/{site_network_id}/connections/{site_connection_id}/update-bandwidth-size")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSiteNetworkBandwidthSizeRequest::getSiteNetworkId,
                UpdateSiteNetworkBandwidthSizeRequest::setSiteNetworkId));
        builder.<String>withRequestField("site_connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSiteNetworkBandwidthSizeRequest::getSiteConnectionId,
                UpdateSiteNetworkBandwidthSizeRequest::setSiteConnectionId));
        builder.<UpdateSiteConnectionBandwidthSizeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSiteConnectionBandwidthSizeRequestBody.class),
            f -> f.withMarshaller(UpdateSiteNetworkBandwidthSizeRequest::getBody,
                UpdateSiteNetworkBandwidthSizeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateP2PSiteNetworkRequest, CreateP2PSiteNetworkResponse> createP2PSiteNetwork =
        genForCreateP2PSiteNetwork();

    private static HttpRequestDef<CreateP2PSiteNetworkRequest, CreateP2PSiteNetworkResponse> genForCreateP2PSiteNetwork() {
        // basic
        HttpRequestDef.Builder<CreateP2PSiteNetworkRequest, CreateP2PSiteNetworkResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateP2PSiteNetworkRequest.class, CreateP2PSiteNetworkResponse.class)
            .withName("CreateP2PSiteNetwork")
            .withUri("/v3/{domain_id}/dcaas/p2p-site-networks")
            .withContentType("application/json");

        // requests
        builder.<CreateP2PSiteNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateP2PSiteNetworkRequestBody.class),
            f -> f.withMarshaller(CreateP2PSiteNetworkRequest::getBody, CreateP2PSiteNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSiteNetworkRequest, DeleteSiteNetworkResponse> deleteSiteNetwork =
        genForDeleteSiteNetwork();

    private static HttpRequestDef<DeleteSiteNetworkRequest, DeleteSiteNetworkResponse> genForDeleteSiteNetwork() {
        // basic
        HttpRequestDef.Builder<DeleteSiteNetworkRequest, DeleteSiteNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSiteNetworkRequest.class, DeleteSiteNetworkResponse.class)
                .withName("DeleteSiteNetwork")
                .withUri("/v3/{domain_id}/dcaas/site-networks/{site_network_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSiteNetworkRequest::getSiteNetworkId,
                DeleteSiteNetworkRequest::setSiteNetworkId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSiteNetworksRequest, ListSiteNetworksResponse> listSiteNetworks =
        genForListSiteNetworks();

    private static HttpRequestDef<ListSiteNetworksRequest, ListSiteNetworksResponse> genForListSiteNetworks() {
        // basic
        HttpRequestDef.Builder<ListSiteNetworksRequest, ListSiteNetworksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSiteNetworksRequest.class, ListSiteNetworksResponse.class)
                .withName("ListSiteNetworks")
                .withUri("/v3/{domain_id}/dcaas/site-networks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSiteNetworksRequest::getLimit, ListSiteNetworksRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSiteNetworksRequest::getMarker, ListSiteNetworksRequest::setMarker));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSiteNetworksRequest::getSortKey, ListSiteNetworksRequest::setSortKey));
        builder.<SortDir>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SortDir.class),
            f -> f.withMarshaller(ListSiteNetworksRequest::getSortDir, ListSiteNetworksRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSiteNetworksRequest::getId, ListSiteNetworksRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSiteNetworksRequest::getName, ListSiteNetworksRequest::setName));
        builder.<List<SiteNetworkStateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSiteNetworksRequest::getState, ListSiteNetworksRequest::setState));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSiteNetworksRequest::getEnterpriseProjectId,
                ListSiteNetworksRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("global_dc_gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSiteNetworksRequest::getGlobalDcGatewayId,
                ListSiteNetworksRequest::setGlobalDcGatewayId));
        builder.<List<String>>withRequestField("global_connection_bandwidth_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSiteNetworksRequest::getGlobalConnectionBandwidthId,
                ListSiteNetworksRequest::setGlobalConnectionBandwidthId));
        builder.<List<String>>withRequestField("connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSiteNetworksRequest::getConnectionId, ListSiteNetworksRequest::setConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSiteNetworkRequest, ShowSiteNetworkResponse> showSiteNetwork =
        genForShowSiteNetwork();

    private static HttpRequestDef<ShowSiteNetworkRequest, ShowSiteNetworkResponse> genForShowSiteNetwork() {
        // basic
        HttpRequestDef.Builder<ShowSiteNetworkRequest, ShowSiteNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSiteNetworkRequest.class, ShowSiteNetworkResponse.class)
                .withName("ShowSiteNetwork")
                .withUri("/v3/{domain_id}/dcaas/site-networks/{site_network_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSiteNetworkRequest::getSiteNetworkId, ShowSiteNetworkRequest::setSiteNetworkId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSiteNetworkRequest, UpdateSiteNetworkResponse> updateSiteNetwork =
        genForUpdateSiteNetwork();

    private static HttpRequestDef<UpdateSiteNetworkRequest, UpdateSiteNetworkResponse> genForUpdateSiteNetwork() {
        // basic
        HttpRequestDef.Builder<UpdateSiteNetworkRequest, UpdateSiteNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSiteNetworkRequest.class, UpdateSiteNetworkResponse.class)
                .withName("UpdateSiteNetwork")
                .withUri("/v3/{domain_id}/dcaas/site-networks/{site_network_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSiteNetworkRequest::getSiteNetworkId,
                UpdateSiteNetworkRequest::setSiteNetworkId));
        builder.<UpdateSiteNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSiteNetworkRequestBody.class),
            f -> f.withMarshaller(UpdateSiteNetworkRequest::getBody, UpdateSiteNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSiteNetworkCapabilitiesRequest, ListSiteNetworkCapabilitiesResponse> listSiteNetworkCapabilities =
        genForListSiteNetworkCapabilities();

    private static HttpRequestDef<ListSiteNetworkCapabilitiesRequest, ListSiteNetworkCapabilitiesResponse> genForListSiteNetworkCapabilities() {
        // basic
        HttpRequestDef.Builder<ListSiteNetworkCapabilitiesRequest, ListSiteNetworkCapabilitiesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSiteNetworkCapabilitiesRequest.class,
                    ListSiteNetworkCapabilitiesResponse.class)
                .withName("ListSiteNetworkCapabilities")
                .withUri("/v3/{domain_id}/dcaas/site-network/capabilities")
                .withContentType("application/json");

        // requests
        builder.<List<SiteNetworkSpecificationEnum>>withRequestField("specification",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSiteNetworkCapabilitiesRequest::getSpecification,
                ListSiteNetworkCapabilitiesRequest::setSpecification));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSiteNetworkCapabilitiesRequest::getLimit,
                ListSiteNetworkCapabilitiesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSiteNetworkCapabilitiesRequest::getMarker,
                ListSiteNetworkCapabilitiesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSiteNetworkQuotasRequest, ListSiteNetworkQuotasResponse> listSiteNetworkQuotas =
        genForListSiteNetworkQuotas();

    private static HttpRequestDef<ListSiteNetworkQuotasRequest, ListSiteNetworkQuotasResponse> genForListSiteNetworkQuotas() {
        // basic
        HttpRequestDef.Builder<ListSiteNetworkQuotasRequest, ListSiteNetworkQuotasResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSiteNetworkQuotasRequest.class, ListSiteNetworkQuotasResponse.class)
            .withName("ListSiteNetworkQuotas")
            .withUri("/v3/{domain_id}/dcaas/site-network/quotas")
            .withContentType("application/json");

        // requests
        builder.<List<SiteNetworkQuotaKeyEnum>>withRequestField("quota_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSiteNetworkQuotasRequest::getQuotaType,
                ListSiteNetworkQuotasRequest::setQuotaType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSiteNetworkQuotasRequest::getLimit, ListSiteNetworkQuotasRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSiteNetworkQuotasRequest::getMarker, ListSiteNetworkQuotasRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAreaBandwidthPackageSpecificationsRequest, ListAreaBandwidthPackageSpecificationsResponse> listAreaBandwidthPackageSpecifications =
        genForListAreaBandwidthPackageSpecifications();

    private static HttpRequestDef<ListAreaBandwidthPackageSpecificationsRequest, ListAreaBandwidthPackageSpecificationsResponse> genForListAreaBandwidthPackageSpecifications() {
        // basic
        HttpRequestDef.Builder<ListAreaBandwidthPackageSpecificationsRequest, ListAreaBandwidthPackageSpecificationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAreaBandwidthPackageSpecificationsRequest.class,
                    ListAreaBandwidthPackageSpecificationsResponse.class)
                .withName("ListAreaBandwidthPackageSpecifications")
                .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/area-specifications")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("local_area_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAreaBandwidthPackageSpecificationsRequest::getLocalAreaId,
                ListAreaBandwidthPackageSpecificationsRequest::setLocalAreaId));
        builder.<List<String>>withRequestField("remote_area_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAreaBandwidthPackageSpecificationsRequest::getRemoteAreaId,
                ListAreaBandwidthPackageSpecificationsRequest::setRemoteAreaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAreasRequest, ListAreasResponse> listAreas = genForListAreas();

    private static HttpRequestDef<ListAreasRequest, ListAreasResponse> genForListAreas() {
        // basic
        HttpRequestDef.Builder<ListAreasRequest, ListAreasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAreasRequest.class, ListAreasResponse.class)
                .withName("ListAreas")
                .withUri("/v3/{domain_id}/ccaas/areas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthPackageLevelsRequest, ListBandwidthPackageLevelsResponse> listBandwidthPackageLevels =
        genForListBandwidthPackageLevels();

    private static HttpRequestDef<ListBandwidthPackageLevelsRequest, ListBandwidthPackageLevelsResponse> genForListBandwidthPackageLevels() {
        // basic
        HttpRequestDef.Builder<ListBandwidthPackageLevelsRequest, ListBandwidthPackageLevelsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBandwidthPackageLevelsRequest.class,
                    ListBandwidthPackageLevelsResponse.class)
                .withName("ListBandwidthPackageLevels")
                .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/levels")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthPackageLevelsRequest::getLimit,
                ListBandwidthPackageLevelsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPackageLevelsRequest::getMarker,
                ListBandwidthPackageLevelsRequest::setMarker));
        builder.<String>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPackageLevelsRequest::getLevel,
                ListBandwidthPackageLevelsRequest::setLevel));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPackageLevelsRequest::getName,
                ListBandwidthPackageLevelsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthPackageLinesRequest, ListBandwidthPackageLinesResponse> listBandwidthPackageLines =
        genForListBandwidthPackageLines();

    private static HttpRequestDef<ListBandwidthPackageLinesRequest, ListBandwidthPackageLinesResponse> genForListBandwidthPackageLines() {
        // basic
        HttpRequestDef.Builder<ListBandwidthPackageLinesRequest, ListBandwidthPackageLinesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBandwidthPackageLinesRequest.class,
                    ListBandwidthPackageLinesResponse.class)
                .withName("ListBandwidthPackageLines")
                .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/lines")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthPackageLinesRequest::getLimit,
                ListBandwidthPackageLinesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPackageLinesRequest::getMarker,
                ListBandwidthPackageLinesRequest::setMarker));
        builder.<String>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPackageLinesRequest::getLevel,
                ListBandwidthPackageLinesRequest::setLevel));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPackageLinesRequest::getName,
                ListBandwidthPackageLinesRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthPackageSitesRequest, ListBandwidthPackageSitesResponse> listBandwidthPackageSites =
        genForListBandwidthPackageSites();

    private static HttpRequestDef<ListBandwidthPackageSitesRequest, ListBandwidthPackageSitesResponse> genForListBandwidthPackageSites() {
        // basic
        HttpRequestDef.Builder<ListBandwidthPackageSitesRequest, ListBandwidthPackageSitesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBandwidthPackageSitesRequest.class,
                    ListBandwidthPackageSitesResponse.class)
                .withName("ListBandwidthPackageSites")
                .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/sites")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthPackageSitesRequest::getLimit,
                ListBandwidthPackageSitesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPackageSitesRequest::getMarker,
                ListBandwidthPackageSitesRequest::setMarker));
        builder.<String>withRequestField("site_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPackageSitesRequest::getSiteCode,
                ListBandwidthPackageSitesRequest::setSiteCode));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPackageSitesRequest::getRegionId,
                ListBandwidthPackageSitesRequest::setRegionId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPackageSitesRequest::getName,
                ListBandwidthPackageSitesRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRegionBandwidthPackageSpecificationsRequest, ListRegionBandwidthPackageSpecificationsResponse> listRegionBandwidthPackageSpecifications =
        genForListRegionBandwidthPackageSpecifications();

    private static HttpRequestDef<ListRegionBandwidthPackageSpecificationsRequest, ListRegionBandwidthPackageSpecificationsResponse> genForListRegionBandwidthPackageSpecifications() {
        // basic
        HttpRequestDef.Builder<ListRegionBandwidthPackageSpecificationsRequest, ListRegionBandwidthPackageSpecificationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRegionBandwidthPackageSpecificationsRequest.class,
                    ListRegionBandwidthPackageSpecificationsResponse.class)
                .withName("ListRegionBandwidthPackageSpecifications")
                .withUri("/v3/{domain_id}/ccaas/bandwidth-packages/region-specifications")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("local_region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRegionBandwidthPackageSpecificationsRequest::getLocalRegionId,
                ListRegionBandwidthPackageSpecificationsRequest::setLocalRegionId));
        builder.<String>withRequestField("remote_region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRegionBandwidthPackageSpecificationsRequest::getRemoteRegionId,
                ListRegionBandwidthPackageSpecificationsRequest::setRemoteRegionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRegionsRequest, ListRegionsResponse> listRegions = genForListRegions();

    private static HttpRequestDef<ListRegionsRequest, ListRegionsResponse> genForListRegions() {
        // basic
        HttpRequestDef.Builder<ListRegionsRequest, ListRegionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRegionsRequest.class, ListRegionsResponse.class)
                .withName("ListRegions")
                .withUri("/v3/{domain_id}/ccaas/regions")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}
