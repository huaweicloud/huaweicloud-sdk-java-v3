package com.huaweicloud.sdk.cc.v3;

import com.huaweicloud.sdk.cc.v3.model.ApplyCentralNetworkPolicyRequest;
import com.huaweicloud.sdk.cc.v3.model.ApplyCentralNetworkPolicyResponse;
import com.huaweicloud.sdk.cc.v3.model.AssociateBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.AssociateBandwidthPackageRequestBody;
import com.huaweicloud.sdk.cc.v3.model.AssociateBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.AttachmentInstanceTypeEnum;
import com.huaweicloud.sdk.cc.v3.model.BandwidthTypeEnum;
import com.huaweicloud.sdk.cc.v3.model.CentralNetworkConnectionStateEnum;
import com.huaweicloud.sdk.cc.v3.model.CentralNetworkPolicyStateEnum;
import com.huaweicloud.sdk.cc.v3.model.CentralNetworkQuotaKeyEnum;
import com.huaweicloud.sdk.cc.v3.model.CentralNetworkStateEnum;
import com.huaweicloud.sdk.cc.v3.model.ConnectionTypeEnum;
import com.huaweicloud.sdk.cc.v3.model.CreateAuthorisationRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateAuthorisationRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateAuthorisationResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateBandwidthPackageRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateBandwidthPackageResponse;
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
import com.huaweicloud.sdk.cc.v3.model.CreateInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateInterRegionBandwidthRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateNetworkInstanceRequestBody;
import com.huaweicloud.sdk.cc.v3.model.CreateNetworkInstanceResponse;
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
import com.huaweicloud.sdk.cc.v3.model.DeleteInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteNetworkInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.DisassociateBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.DisassociateBandwidthPackageRequestBody;
import com.huaweicloud.sdk.cc.v3.model.DisassociateBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.ListAuthorisationsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListAuthorisationsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesByTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesByTagsRequestBody;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesByTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkAttachmentsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkAttachmentsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkConnectionsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkConnectionsResponse;
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
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworksRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworksResponse;
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
import com.huaweicloud.sdk.cc.v3.model.ListInterRegionBandwidthsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListInterRegionBandwidthsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListNetworkInstancesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListNetworkInstancesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListPermissionsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListPermissionsResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkGdgwAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkGdgwAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCloudConnectionRoutesRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCloudConnectionRoutesResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowNetworkInstanceResponse;
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
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkGdgwAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkGdgwAttachmentRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkGdgwAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateCloudConnectionRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateInterRegionBandwidthRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateNetworkInstanceRequestBody;
import com.huaweicloud.sdk.cc.v3.model.UpdateNetworkInstanceResponse;
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
        genForcreateAuthorisation();

    private static HttpRequestDef<CreateAuthorisationRequest, CreateAuthorisationResponse> genForcreateAuthorisation() {
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
            f -> f.withMarshaller(CreateAuthorisationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuthorisationRequest, DeleteAuthorisationResponse> deleteAuthorisation =
        genFordeleteAuthorisation();

    private static HttpRequestDef<DeleteAuthorisationRequest, DeleteAuthorisationResponse> genFordeleteAuthorisation() {
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
            f -> f.withMarshaller(DeleteAuthorisationRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorisationsRequest, ListAuthorisationsResponse> listAuthorisations =
        genForlistAuthorisations();

    private static HttpRequestDef<ListAuthorisationsRequest, ListAuthorisationsResponse> genForlistAuthorisations() {
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
            f -> f.withMarshaller(ListAuthorisationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuthorisationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionsRequest, ListPermissionsResponse> listPermissions =
        genForlistPermissions();

    private static HttpRequestDef<ListPermissionsRequest, ListPermissionsResponse> genForlistPermissions() {
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
            f -> f.withMarshaller(ListPermissionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPermissionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuthorisationRequest, UpdateAuthorisationResponse> updateAuthorisation =
        genForupdateAuthorisation();

    private static HttpRequestDef<UpdateAuthorisationRequest, UpdateAuthorisationResponse> genForupdateAuthorisation() {
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
            f -> f.withMarshaller(UpdateAuthorisationRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateAuthorisationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAuthorisationRequestBody.class),
            f -> f.withMarshaller(UpdateAuthorisationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse> associateBandwidthPackage =
        genForassociateBandwidthPackage();

    private static HttpRequestDef<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse> genForassociateBandwidthPackage() {
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
            f -> f.withMarshaller(AssociateBandwidthPackageRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<AssociateBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(AssociateBandwidthPackageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse> createBandwidthPackage =
        genForcreateBandwidthPackage();

    private static HttpRequestDef<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse> genForcreateBandwidthPackage() {
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
            f -> f.withMarshaller(CreateBandwidthPackageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse> deleteBandwidthPackage =
        genFordeleteBandwidthPackage();

    private static HttpRequestDef<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse> genFordeleteBandwidthPackage() {
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
            f -> f.withMarshaller(DeleteBandwidthPackageRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse> disassociateBandwidthPackage =
        genFordisassociateBandwidthPackage();

    private static HttpRequestDef<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse> genFordisassociateBandwidthPackage() {
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
            f -> f.withMarshaller(DisassociateBandwidthPackageRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<DisassociateBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(DisassociateBandwidthPackageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthPackageTagsRequest, ListBandwidthPackageTagsResponse> listBandwidthPackageTags =
        genForlistBandwidthPackageTags();

    private static HttpRequestDef<ListBandwidthPackageTagsRequest, ListBandwidthPackageTagsResponse> genForlistBandwidthPackageTags() {
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
        genForlistBandwidthPackages();

    private static HttpRequestDef<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse> genForlistBandwidthPackages() {
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
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<List<ListBandwidthPackagesRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<String>>withRequestField("billing_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getBillingMode, (req, v) -> {
                req.setBillingMode(v);
            }));
        builder.<List<String>>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthPackagesRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthPackagesByTagsRequest, ListBandwidthPackagesByTagsResponse> listBandwidthPackagesByTags =
        genForlistBandwidthPackagesByTags();

    private static HttpRequestDef<ListBandwidthPackagesByTagsRequest, ListBandwidthPackagesByTagsResponse> genForlistBandwidthPackagesByTags() {
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
            f -> f.withMarshaller(ListBandwidthPackagesByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse> showBandwidthPackage =
        genForshowBandwidthPackage();

    private static HttpRequestDef<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse> genForshowBandwidthPackage() {
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
            f -> f.withMarshaller(ShowBandwidthPackageRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagBandwidthPackageRequest, TagBandwidthPackageResponse> tagBandwidthPackage =
        genFortagBandwidthPackage();

    private static HttpRequestDef<TagBandwidthPackageRequest, TagBandwidthPackageResponse> genFortagBandwidthPackage() {
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
            f -> f.withMarshaller(TagBandwidthPackageRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<TagBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(TagBandwidthPackageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForuntagBandwidthPackage();

    private static HttpRequestDef<UntagBandwidthPackageRequest, UntagBandwidthPackageResponse> genForuntagBandwidthPackage() {
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
            f -> f.withMarshaller(UntagBandwidthPackageRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UntagBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UntagBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(UntagBandwidthPackageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForupdateBandwidthPackage();

    private static HttpRequestDef<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse> genForupdateBandwidthPackage() {
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
            f -> f.withMarshaller(UpdateBandwidthPackageRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateBandwidthPackageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBandwidthPackageRequestBody.class),
            f -> f.withMarshaller(UpdateBandwidthPackageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyCentralNetworkPolicyRequest, ApplyCentralNetworkPolicyResponse> applyCentralNetworkPolicy =
        genForapplyCentralNetworkPolicy();

    private static HttpRequestDef<ApplyCentralNetworkPolicyRequest, ApplyCentralNetworkPolicyResponse> genForapplyCentralNetworkPolicy() {
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
            f -> f.withMarshaller(ApplyCentralNetworkPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyCentralNetworkPolicyRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCentralNetworkRequest, CreateCentralNetworkResponse> createCentralNetwork =
        genForcreateCentralNetwork();

    private static HttpRequestDef<CreateCentralNetworkRequest, CreateCentralNetworkResponse> genForcreateCentralNetwork() {
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
            f -> f.withMarshaller(CreateCentralNetworkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCentralNetworkPolicyRequest, CreateCentralNetworkPolicyResponse> createCentralNetworkPolicy =
        genForcreateCentralNetworkPolicy();

    private static HttpRequestDef<CreateCentralNetworkPolicyRequest, CreateCentralNetworkPolicyResponse> genForcreateCentralNetworkPolicy() {
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
            f -> f.withMarshaller(CreateCentralNetworkPolicyRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));
        builder.<CreateCentralNetworkPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCentralNetworkPolicyRequestBody.class),
            f -> f.withMarshaller(CreateCentralNetworkPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCentralNetworkRequest, DeleteCentralNetworkResponse> deleteCentralNetwork =
        genFordeleteCentralNetwork();

    private static HttpRequestDef<DeleteCentralNetworkRequest, DeleteCentralNetworkResponse> genFordeleteCentralNetwork() {
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
            f -> f.withMarshaller(DeleteCentralNetworkRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCentralNetworkPolicyRequest, DeleteCentralNetworkPolicyResponse> deleteCentralNetworkPolicy =
        genFordeleteCentralNetworkPolicy();

    private static HttpRequestDef<DeleteCentralNetworkPolicyRequest, DeleteCentralNetworkPolicyResponse> genFordeleteCentralNetworkPolicy() {
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
            f -> f.withMarshaller(DeleteCentralNetworkPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCentralNetworkPolicyRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));

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
        genForlistCentralNetworkPolicies();

    private static HttpRequestDef<ListCentralNetworkPoliciesRequest, ListCentralNetworkPoliciesResponse> genForlistCentralNetworkPolicies() {
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
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<SortDir>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SortDir.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<CentralNetworkPolicyStateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<List<Version>>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<Boolean>withRequestField("is_applied",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCentralNetworkPoliciesRequest::getIsApplied, (req, v) -> {
                req.setIsApplied(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkPolicyChangeSetRequest, ListCentralNetworkPolicyChangeSetResponse> listCentralNetworkPolicyChangeSet =
        genForlistCentralNetworkPolicyChangeSet();

    private static HttpRequestDef<ListCentralNetworkPolicyChangeSetRequest, ListCentralNetworkPolicyChangeSetResponse> genForlistCentralNetworkPolicyChangeSet() {
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
            f -> f.withMarshaller(ListCentralNetworkPolicyChangeSetRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("central_network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkPolicyChangeSetRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkTagsRequest, ListCentralNetworkTagsResponse> listCentralNetworkTags =
        genForlistCentralNetworkTags();

    private static HttpRequestDef<ListCentralNetworkTagsRequest, ListCentralNetworkTagsResponse> genForlistCentralNetworkTags() {
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
        genForlistCentralNetworks();

    private static HttpRequestDef<ListCentralNetworksRequest, ListCentralNetworksResponse> genForlistCentralNetworks() {
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
            f -> f.withMarshaller(ListCentralNetworksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<SortDir>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SortDir.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<CentralNetworkStateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("enterprise_router_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getEnterpriseRouterId, (req, v) -> {
                req.setEnterpriseRouterId(v);
            }));
        builder.<List<String>>withRequestField("attachment_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getAttachmentInstanceId, (req, v) -> {
                req.setAttachmentInstanceId(v);
            }));
        builder.<List<String>>withRequestField("global_connection_bandwidth_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getGlobalConnectionBandwidthId, (req, v) -> {
                req.setGlobalConnectionBandwidthId(v);
            }));
        builder.<List<String>>withRequestField("connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworksRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCentralNetworkRequest, ShowCentralNetworkResponse> showCentralNetwork =
        genForshowCentralNetwork();

    private static HttpRequestDef<ShowCentralNetworkRequest, ShowCentralNetworkResponse> genForshowCentralNetwork() {
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
            f -> f.withMarshaller(ShowCentralNetworkRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagCentralNetworkRequest, TagCentralNetworkResponse> tagCentralNetwork =
        genFortagCentralNetwork();

    private static HttpRequestDef<TagCentralNetworkRequest, TagCentralNetworkResponse> genFortagCentralNetwork() {
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
            f -> f.withMarshaller(TagCentralNetworkRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));
        builder.<TagCentralNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagCentralNetworkRequestBody.class),
            f -> f.withMarshaller(TagCentralNetworkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(TagCentralNetworkResponse::getXRequestId, TagCentralNetworkResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UntagCentralNetworkRequest, UntagCentralNetworkResponse> untagCentralNetwork =
        genForuntagCentralNetwork();

    private static HttpRequestDef<UntagCentralNetworkRequest, UntagCentralNetworkResponse> genForuntagCentralNetwork() {
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
            f -> f.withMarshaller(UntagCentralNetworkRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));
        builder.<UntagCentralNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UntagCentralNetworkRequestBody.class),
            f -> f.withMarshaller(UntagCentralNetworkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForupdateCentralNetwork();

    private static HttpRequestDef<UpdateCentralNetworkRequest, UpdateCentralNetworkResponse> genForupdateCentralNetwork() {
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
            f -> f.withMarshaller(UpdateCentralNetworkRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));
        builder.<UpdateCentralNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCentralNetworkRequestBody.class),
            f -> f.withMarshaller(UpdateCentralNetworkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCentralNetworkGdgwAttachmentRequest, CreateCentralNetworkGdgwAttachmentResponse> createCentralNetworkGdgwAttachment =
        genForcreateCentralNetworkGdgwAttachment();

    private static HttpRequestDef<CreateCentralNetworkGdgwAttachmentRequest, CreateCentralNetworkGdgwAttachmentResponse> genForcreateCentralNetworkGdgwAttachment() {
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
            f -> f.withMarshaller(CreateCentralNetworkGdgwAttachmentRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));
        builder.<CreateCentralNetworkGdgwAttachmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCentralNetworkGdgwAttachmentRequestBody.class),
            f -> f.withMarshaller(CreateCentralNetworkGdgwAttachmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCentralNetworkAttachmentRequest, DeleteCentralNetworkAttachmentResponse> deleteCentralNetworkAttachment =
        genFordeleteCentralNetworkAttachment();

    private static HttpRequestDef<DeleteCentralNetworkAttachmentRequest, DeleteCentralNetworkAttachmentResponse> genFordeleteCentralNetworkAttachment() {
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
            f -> f.withMarshaller(DeleteCentralNetworkAttachmentRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));
        builder.<String>withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCentralNetworkAttachmentRequest::getAttachmentId, (req, v) -> {
                req.setAttachmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkAttachmentsRequest, ListCentralNetworkAttachmentsResponse> listCentralNetworkAttachments =
        genForlistCentralNetworkAttachments();

    private static HttpRequestDef<ListCentralNetworkAttachmentsRequest, ListCentralNetworkAttachmentsResponse> genForlistCentralNetworkAttachments() {
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
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<SortDir>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SortDir.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<AttachmentInstanceTypeEnum>>withRequestField("attachment_instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getAttachmentInstanceType, (req, v) -> {
                req.setAttachmentInstanceType(v);
            }));
        builder.<List<CentralNetworkConnectionStateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<List<String>>withRequestField("attachment_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkAttachmentsRequest::getAttachmentInstanceId, (req, v) -> {
                req.setAttachmentInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkGdgwAttachmentsRequest, ListCentralNetworkGdgwAttachmentsResponse> listCentralNetworkGdgwAttachments =
        genForlistCentralNetworkGdgwAttachments();

    private static HttpRequestDef<ListCentralNetworkGdgwAttachmentsRequest, ListCentralNetworkGdgwAttachmentsResponse> genForlistCentralNetworkGdgwAttachments() {
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
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<SortDir>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SortDir.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<CentralNetworkConnectionStateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<List<String>>withRequestField("global_dc_gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkGdgwAttachmentsRequest::getGlobalDcGatewayId, (req, v) -> {
                req.setGlobalDcGatewayId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCentralNetworkGdgwAttachmentRequest, ShowCentralNetworkGdgwAttachmentResponse> showCentralNetworkGdgwAttachment =
        genForshowCentralNetworkGdgwAttachment();

    private static HttpRequestDef<ShowCentralNetworkGdgwAttachmentRequest, ShowCentralNetworkGdgwAttachmentResponse> genForshowCentralNetworkGdgwAttachment() {
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
            f -> f.withMarshaller(ShowCentralNetworkGdgwAttachmentRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));
        builder.<String>withRequestField("gdgw_attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCentralNetworkGdgwAttachmentRequest::getGdgwAttachmentId, (req, v) -> {
                req.setGdgwAttachmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCentralNetworkGdgwAttachmentRequest, UpdateCentralNetworkGdgwAttachmentResponse> updateCentralNetworkGdgwAttachment =
        genForupdateCentralNetworkGdgwAttachment();

    private static HttpRequestDef<UpdateCentralNetworkGdgwAttachmentRequest, UpdateCentralNetworkGdgwAttachmentResponse> genForupdateCentralNetworkGdgwAttachment() {
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
            f -> f.withMarshaller(UpdateCentralNetworkGdgwAttachmentRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));
        builder.<String>withRequestField("gdgw_attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCentralNetworkGdgwAttachmentRequest::getGdgwAttachmentId, (req, v) -> {
                req.setGdgwAttachmentId(v);
            }));
        builder.<UpdateCentralNetworkGdgwAttachmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCentralNetworkGdgwAttachmentRequestBody.class),
            f -> f.withMarshaller(UpdateCentralNetworkGdgwAttachmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkConnectionsRequest, ListCentralNetworkConnectionsResponse> listCentralNetworkConnections =
        genForlistCentralNetworkConnections();

    private static HttpRequestDef<ListCentralNetworkConnectionsRequest, ListCentralNetworkConnectionsResponse> genForlistCentralNetworkConnections() {
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
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<SortDir>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SortDir.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<CentralNetworkConnectionStateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<List<String>>withRequestField("global_connection_bandwidth_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getGlobalConnectionBandwidthId, (req, v) -> {
                req.setGlobalConnectionBandwidthId(v);
            }));
        builder.<BandwidthTypeEnum>withRequestField("bandwidth_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BandwidthTypeEnum.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getBandwidthType, (req, v) -> {
                req.setBandwidthType(v);
            }));
        builder.<ConnectionTypeEnum>withRequestField("connection_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConnectionTypeEnum.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getConnectionType, (req, v) -> {
                req.setConnectionType(v);
            }));
        builder.<Boolean>withRequestField("is_cross_region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCentralNetworkConnectionsRequest::getIsCrossRegion, (req, v) -> {
                req.setIsCrossRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCentralNetworkConnectionRequest, UpdateCentralNetworkConnectionResponse> updateCentralNetworkConnection =
        genForupdateCentralNetworkConnection();

    private static HttpRequestDef<UpdateCentralNetworkConnectionRequest, UpdateCentralNetworkConnectionResponse> genForupdateCentralNetworkConnection() {
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
            f -> f.withMarshaller(UpdateCentralNetworkConnectionRequest::getCentralNetworkId, (req, v) -> {
                req.setCentralNetworkId(v);
            }));
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCentralNetworkConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<UpdateCentralNetworkConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCentralNetworkConnectionRequestBody.class),
            f -> f.withMarshaller(UpdateCentralNetworkConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCentralNetworkQuotasRequest, ListCentralNetworkQuotasResponse> listCentralNetworkQuotas =
        genForlistCentralNetworkQuotas();

    private static HttpRequestDef<ListCentralNetworkQuotasRequest, ListCentralNetworkQuotasResponse> genForlistCentralNetworkQuotas() {
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
            f -> f.withMarshaller(ListCentralNetworkQuotasRequest::getQuotaType, (req, v) -> {
                req.setQuotaType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCentralNetworkQuotasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCentralNetworkQuotasRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudConnectionRequest, CreateCloudConnectionResponse> createCloudConnection =
        genForcreateCloudConnection();

    private static HttpRequestDef<CreateCloudConnectionRequest, CreateCloudConnectionResponse> genForcreateCloudConnection() {
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
            f -> f.withMarshaller(CreateCloudConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> deleteCloudConnection =
        genFordeleteCloudConnection();

    private static HttpRequestDef<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> genFordeleteCloudConnection() {
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
            f -> f.withMarshaller(DeleteCloudConnectionRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionTagsRequest, ListCloudConnectionTagsResponse> listCloudConnectionTags =
        genForlistCloudConnectionTags();

    private static HttpRequestDef<ListCloudConnectionTagsRequest, ListCloudConnectionTagsResponse> genForlistCloudConnectionTags() {
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
        genForlistCloudConnections();

    private static HttpRequestDef<ListCloudConnectionsRequest, ListCloudConnectionsResponse> genForlistCloudConnections() {
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
            f -> f.withMarshaller(ListCloudConnectionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<ListCloudConnectionsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<String>>withRequestField("used_scene",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getUsedScene, (req, v) -> {
                req.setUsedScene(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionsByTagsRequest, ListCloudConnectionsByTagsResponse> listCloudConnectionsByTags =
        genForlistCloudConnectionsByTags();

    private static HttpRequestDef<ListCloudConnectionsByTagsRequest, ListCloudConnectionsByTagsResponse> genForlistCloudConnectionsByTags() {
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
            f -> f.withMarshaller(ListCloudConnectionsByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudConnectionRequest, ShowCloudConnectionResponse> showCloudConnection =
        genForshowCloudConnection();

    private static HttpRequestDef<ShowCloudConnectionRequest, ShowCloudConnectionResponse> genForshowCloudConnection() {
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
            f -> f.withMarshaller(ShowCloudConnectionRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagCloudConnectionRequest, TagCloudConnectionResponse> tagCloudConnection =
        genFortagCloudConnection();

    private static HttpRequestDef<TagCloudConnectionRequest, TagCloudConnectionResponse> genFortagCloudConnection() {
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
            f -> f.withMarshaller(TagCloudConnectionRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<TagCloudConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagCloudConnectionRequestBody.class),
            f -> f.withMarshaller(TagCloudConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForuntagCloudConnection();

    private static HttpRequestDef<UntagCloudConnectionRequest, UntagCloudConnectionResponse> genForuntagCloudConnection() {
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
            f -> f.withMarshaller(UntagCloudConnectionRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UntagCloudConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UntagCloudConnectionRequestBody.class),
            f -> f.withMarshaller(UntagCloudConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForupdateCloudConnection();

    private static HttpRequestDef<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> genForupdateCloudConnection() {
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
            f -> f.withMarshaller(UpdateCloudConnectionRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateCloudConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCloudConnectionRequestBody.class),
            f -> f.withMarshaller(UpdateCloudConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionQuotasRequest, ListCloudConnectionQuotasResponse> listCloudConnectionQuotas =
        genForlistCloudConnectionQuotas();

    private static HttpRequestDef<ListCloudConnectionQuotasRequest, ListCloudConnectionQuotasResponse> genForlistCloudConnectionQuotas() {
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
            f -> f.withMarshaller(ListCloudConnectionQuotasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionQuotasRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<ListCloudConnectionQuotasRequest.QuotaTypeEnum>withRequestField("quota_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCloudConnectionQuotasRequest.QuotaTypeEnum.class),
            f -> f.withMarshaller(ListCloudConnectionQuotasRequest::getQuotaType, (req, v) -> {
                req.setQuotaType(v);
            }));
        builder.<String>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionQuotasRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionQuotasRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> listCloudConnectionRoutes =
        genForlistCloudConnectionRoutes();

    private static HttpRequestDef<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> genForlistCloudConnectionRoutes() {
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
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> showCloudConnectionRoutes =
        genForshowCloudConnectionRoutes();

    private static HttpRequestDef<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> genForshowCloudConnectionRoutes() {
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
            f -> f.withMarshaller(ShowCloudConnectionRoutesRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse> createInterRegionBandwidth =
        genForcreateInterRegionBandwidth();

    private static HttpRequestDef<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse> genForcreateInterRegionBandwidth() {
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
            f -> f.withMarshaller(CreateInterRegionBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse> deleteInterRegionBandwidth =
        genFordeleteInterRegionBandwidth();

    private static HttpRequestDef<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse> genFordeleteInterRegionBandwidth() {
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
            f -> f.withMarshaller(DeleteInterRegionBandwidthRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse> listInterRegionBandwidths =
        genForlistInterRegionBandwidths();

    private static HttpRequestDef<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse> genForlistInterRegionBandwidths() {
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
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<List<String>>withRequestField("bandwidth_package_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInterRegionBandwidthsRequest::getBandwidthPackageId, (req, v) -> {
                req.setBandwidthPackageId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse> showInterRegionBandwidth =
        genForshowInterRegionBandwidth();

    private static HttpRequestDef<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse> genForshowInterRegionBandwidth() {
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
            f -> f.withMarshaller(ShowInterRegionBandwidthRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse> updateInterRegionBandwidth =
        genForupdateInterRegionBandwidth();

    private static HttpRequestDef<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse> genForupdateInterRegionBandwidth() {
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
            f -> f.withMarshaller(UpdateInterRegionBandwidthRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateInterRegionBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInterRegionBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdateInterRegionBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> createNetworkInstance =
        genForcreateNetworkInstance();

    private static HttpRequestDef<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> genForcreateNetworkInstance() {
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
            f -> f.withMarshaller(CreateNetworkInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> deleteNetworkInstance =
        genFordeleteNetworkInstance();

    private static HttpRequestDef<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> genFordeleteNetworkInstance() {
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
            f -> f.withMarshaller(DeleteNetworkInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNetworkInstancesRequest, ListNetworkInstancesResponse> listNetworkInstances =
        genForlistNetworkInstances();

    private static HttpRequestDef<ListNetworkInstancesRequest, ListNetworkInstancesResponse> genForlistNetworkInstances() {
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
            f -> f.withMarshaller(ListNetworkInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<List<ListNetworkInstancesRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<List<String>>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> showNetworkInstance =
        genForshowNetworkInstance();

    private static HttpRequestDef<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> genForshowNetworkInstance() {
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
            f -> f.withMarshaller(ShowNetworkInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> updateNetworkInstance =
        genForupdateNetworkInstance();

    private static HttpRequestDef<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> genForupdateNetworkInstance() {
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
            f -> f.withMarshaller(UpdateNetworkInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateNetworkInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNetworkInstanceRequestBody.class),
            f -> f.withMarshaller(UpdateNetworkInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
