package com.huaweicloud.sdk.ram.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ram.v1.model.AcceptResourceShareInvitationRequest;
import com.huaweicloud.sdk.ram.v1.model.AcceptResourceShareInvitationResponse;
import com.huaweicloud.sdk.ram.v1.model.AssociatePermissionReqBody;
import com.huaweicloud.sdk.ram.v1.model.AssociateResourceSharePermissionRequest;
import com.huaweicloud.sdk.ram.v1.model.AssociateResourceSharePermissionResponse;
import com.huaweicloud.sdk.ram.v1.model.AssociateResourceShareRequest;
import com.huaweicloud.sdk.ram.v1.model.AssociateResourceShareResponse;
import com.huaweicloud.sdk.ram.v1.model.BatchCreateResourceShareTagsRequest;
import com.huaweicloud.sdk.ram.v1.model.BatchCreateResourceShareTagsResponse;
import com.huaweicloud.sdk.ram.v1.model.BatchDeleteResourceShareTagsRequest;
import com.huaweicloud.sdk.ram.v1.model.BatchDeleteResourceShareTagsResponse;
import com.huaweicloud.sdk.ram.v1.model.CreateResourceShareReqBody;
import com.huaweicloud.sdk.ram.v1.model.CreateResourceShareRequest;
import com.huaweicloud.sdk.ram.v1.model.CreateResourceShareResponse;
import com.huaweicloud.sdk.ram.v1.model.DeleteResourceShareRequest;
import com.huaweicloud.sdk.ram.v1.model.DeleteResourceShareResponse;
import com.huaweicloud.sdk.ram.v1.model.DisableOrganizationShareRequest;
import com.huaweicloud.sdk.ram.v1.model.DisableOrganizationShareResponse;
import com.huaweicloud.sdk.ram.v1.model.DisassociatePermissionReqBody;
import com.huaweicloud.sdk.ram.v1.model.DisassociateResourceSharePermissionRequest;
import com.huaweicloud.sdk.ram.v1.model.DisassociateResourceSharePermissionResponse;
import com.huaweicloud.sdk.ram.v1.model.DisassociateResourceShareRequest;
import com.huaweicloud.sdk.ram.v1.model.DisassociateResourceShareResponse;
import com.huaweicloud.sdk.ram.v1.model.EnableOrganizationShareRequest;
import com.huaweicloud.sdk.ram.v1.model.EnableOrganizationShareResponse;
import com.huaweicloud.sdk.ram.v1.model.ListPermissionVersionsRequest;
import com.huaweicloud.sdk.ram.v1.model.ListPermissionVersionsResponse;
import com.huaweicloud.sdk.ram.v1.model.ListPermissionsRequest;
import com.huaweicloud.sdk.ram.v1.model.ListPermissionsResponse;
import com.huaweicloud.sdk.ram.v1.model.ListQuotaRequest;
import com.huaweicloud.sdk.ram.v1.model.ListQuotaResponse;
import com.huaweicloud.sdk.ram.v1.model.ListResourceSharePermissionsRequest;
import com.huaweicloud.sdk.ram.v1.model.ListResourceSharePermissionsResponse;
import com.huaweicloud.sdk.ram.v1.model.ListResourceShareTagsRequest;
import com.huaweicloud.sdk.ram.v1.model.ListResourceShareTagsResponse;
import com.huaweicloud.sdk.ram.v1.model.ListResourceSharesByTagsRequest;
import com.huaweicloud.sdk.ram.v1.model.ListResourceSharesByTagsResponse;
import com.huaweicloud.sdk.ram.v1.model.ListResourceTypesRequest;
import com.huaweicloud.sdk.ram.v1.model.ListResourceTypesResponse;
import com.huaweicloud.sdk.ram.v1.model.RejectResourceShareInvitationRequest;
import com.huaweicloud.sdk.ram.v1.model.RejectResourceShareInvitationResponse;
import com.huaweicloud.sdk.ram.v1.model.ResourceShareAssociationReqBody;
import com.huaweicloud.sdk.ram.v1.model.ResourceSharesByTagsReqBody;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareAssociationsReqBody;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareAssociationsRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareAssociationsResponse;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareCountByTagsRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareCountByTagsResponse;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareInvitationReqBody;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareInvitationRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceShareInvitationResponse;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceSharesReqBody;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceSharesRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchResourceSharesResponse;
import com.huaweicloud.sdk.ram.v1.model.SearchSharedPrincipalsReqBody;
import com.huaweicloud.sdk.ram.v1.model.SearchSharedPrincipalsRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchSharedPrincipalsResponse;
import com.huaweicloud.sdk.ram.v1.model.SearchSharedResourcesReqBody;
import com.huaweicloud.sdk.ram.v1.model.SearchSharedResourcesRequest;
import com.huaweicloud.sdk.ram.v1.model.SearchSharedResourcesResponse;
import com.huaweicloud.sdk.ram.v1.model.ShowOrganizationShareRequest;
import com.huaweicloud.sdk.ram.v1.model.ShowOrganizationShareResponse;
import com.huaweicloud.sdk.ram.v1.model.ShowPermissionRequest;
import com.huaweicloud.sdk.ram.v1.model.ShowPermissionResponse;
import com.huaweicloud.sdk.ram.v1.model.TagResourceReqBody;
import com.huaweicloud.sdk.ram.v1.model.UntagResourceReqBody;
import com.huaweicloud.sdk.ram.v1.model.UpdateResourceShareReqBody;
import com.huaweicloud.sdk.ram.v1.model.UpdateResourceShareRequest;
import com.huaweicloud.sdk.ram.v1.model.UpdateResourceShareResponse;

@SuppressWarnings("unchecked")
public class RamMeta {

    public static final HttpRequestDef<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResponse> associateResourceSharePermission =
        genForAssociateResourceSharePermission();

    private static HttpRequestDef<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResponse> genForAssociateResourceSharePermission() {
        // basic
        HttpRequestDef.Builder<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateResourceSharePermissionRequest.class,
                    AssociateResourceSharePermissionResponse.class)
                .withName("AssociateResourceSharePermission")
                .withUri("/v1/resource-shares/{resource_share_id}/associate-permission")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateResourceSharePermissionRequest::getResourceShareId,
                AssociateResourceSharePermissionRequest::setResourceShareId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateResourceSharePermissionRequest::getXSecurityToken,
                AssociateResourceSharePermissionRequest::setXSecurityToken));
        builder.<AssociatePermissionReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociatePermissionReqBody.class),
            f -> f.withMarshaller(AssociateResourceSharePermissionRequest::getBody,
                AssociateResourceSharePermissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResponse> disassociateResourceSharePermission =
        genForDisassociateResourceSharePermission();

    private static HttpRequestDef<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResponse> genForDisassociateResourceSharePermission() {
        // basic
        HttpRequestDef.Builder<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisassociateResourceSharePermissionRequest.class,
                    DisassociateResourceSharePermissionResponse.class)
                .withName("DisassociateResourceSharePermission")
                .withUri("/v1/resource-shares/{resource_share_id}/disassociate-permission")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateResourceSharePermissionRequest::getResourceShareId,
                DisassociateResourceSharePermissionRequest::setResourceShareId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateResourceSharePermissionRequest::getXSecurityToken,
                DisassociateResourceSharePermissionRequest::setXSecurityToken));
        builder.<DisassociatePermissionReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociatePermissionReqBody.class),
            f -> f.withMarshaller(DisassociateResourceSharePermissionRequest::getBody,
                DisassociateResourceSharePermissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResponse> listResourceSharePermissions =
        genForListResourceSharePermissions();

    private static HttpRequestDef<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResponse> genForListResourceSharePermissions() {
        // basic
        HttpRequestDef.Builder<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListResourceSharePermissionsRequest.class,
                    ListResourceSharePermissionsResponse.class)
                .withName("ListResourceSharePermissions")
                .withUri("/v1/resource-shares/{resource_share_id}/associated-permissions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceSharePermissionsRequest::getResourceShareId,
                ListResourceSharePermissionsRequest::setResourceShareId));
        builder.<String>withRequestField("permission_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceSharePermissionsRequest::getPermissionName,
                ListResourceSharePermissionsRequest::setPermissionName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceSharePermissionsRequest::getLimit,
                ListResourceSharePermissionsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceSharePermissionsRequest::getMarker,
                ListResourceSharePermissionsRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceSharePermissionsRequest::getXSecurityToken,
                ListResourceSharePermissionsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaRequest, ListQuotaResponse> listQuota = genForListQuota();

    private static HttpRequestDef<ListQuotaRequest, ListQuotaResponse> genForListQuota() {
        // basic
        HttpRequestDef.Builder<ListQuotaRequest, ListQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotaRequest.class, ListQuotaResponse.class)
                .withName("ListQuota")
                .withUri("/v1/resource-shares/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotaRequest::getXSecurityToken, ListQuotaRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTypesRequest, ListResourceTypesResponse> listResourceTypes =
        genForListResourceTypes();

    private static HttpRequestDef<ListResourceTypesRequest, ListResourceTypesResponse> genForListResourceTypes() {
        // basic
        HttpRequestDef.Builder<ListResourceTypesRequest, ListResourceTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceTypesRequest.class, ListResourceTypesResponse.class)
                .withName("ListResourceTypes")
                .withUri("/v1/resource-types")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceTypesRequest::getLimit, ListResourceTypesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTypesRequest::getMarker, ListResourceTypesRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTypesRequest::getXSecurityToken,
                ListResourceTypesRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableOrganizationShareRequest, DisableOrganizationShareResponse> disableOrganizationShare =
        genForDisableOrganizationShare();

    private static HttpRequestDef<DisableOrganizationShareRequest, DisableOrganizationShareResponse> genForDisableOrganizationShare() {
        // basic
        HttpRequestDef.Builder<DisableOrganizationShareRequest, DisableOrganizationShareResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, DisableOrganizationShareRequest.class, DisableOrganizationShareResponse.class)
                .withName("DisableOrganizationShare")
                .withUri("/v1/organization-share/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableOrganizationShareRequest::getXSecurityToken,
                DisableOrganizationShareRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableOrganizationShareRequest, EnableOrganizationShareResponse> enableOrganizationShare =
        genForEnableOrganizationShare();

    private static HttpRequestDef<EnableOrganizationShareRequest, EnableOrganizationShareResponse> genForEnableOrganizationShare() {
        // basic
        HttpRequestDef.Builder<EnableOrganizationShareRequest, EnableOrganizationShareResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, EnableOrganizationShareRequest.class, EnableOrganizationShareResponse.class)
            .withName("EnableOrganizationShare")
            .withUri("/v1/organization-share/enable")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableOrganizationShareRequest::getXSecurityToken,
                EnableOrganizationShareRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrganizationShareRequest, ShowOrganizationShareResponse> showOrganizationShare =
        genForShowOrganizationShare();

    private static HttpRequestDef<ShowOrganizationShareRequest, ShowOrganizationShareResponse> genForShowOrganizationShare() {
        // basic
        HttpRequestDef.Builder<ShowOrganizationShareRequest, ShowOrganizationShareResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOrganizationShareRequest.class, ShowOrganizationShareResponse.class)
            .withName("ShowOrganizationShare")
            .withUri("/v1/organization-share")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationShareRequest::getXSecurityToken,
                ShowOrganizationShareRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionVersionsRequest, ListPermissionVersionsResponse> listPermissionVersions =
        genForListPermissionVersions();

    private static HttpRequestDef<ListPermissionVersionsRequest, ListPermissionVersionsResponse> genForListPermissionVersions() {
        // basic
        HttpRequestDef.Builder<ListPermissionVersionsRequest, ListPermissionVersionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPermissionVersionsRequest.class, ListPermissionVersionsResponse.class)
            .withName("ListPermissionVersions")
            .withUri("/v1/permissions/{permission_id}/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("permission_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionVersionsRequest::getPermissionId,
                ListPermissionVersionsRequest::setPermissionId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionVersionsRequest::getLimit, ListPermissionVersionsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionVersionsRequest::getMarker, ListPermissionVersionsRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionVersionsRequest::getXSecurityToken,
                ListPermissionVersionsRequest::setXSecurityToken));

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
                .withUri("/v1/permissions")
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
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionsRequest::getResourceType, ListPermissionsRequest::setResourceType));
        builder.<ListPermissionsRequest.PermissionTypeEnum>withRequestField("permission_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPermissionsRequest.PermissionTypeEnum.class),
            f -> f.withMarshaller(ListPermissionsRequest::getPermissionType,
                ListPermissionsRequest::setPermissionType));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionsRequest::getXSecurityToken,
                ListPermissionsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPermissionRequest, ShowPermissionResponse> showPermission =
        genForShowPermission();

    private static HttpRequestDef<ShowPermissionRequest, ShowPermissionResponse> genForShowPermission() {
        // basic
        HttpRequestDef.Builder<ShowPermissionRequest, ShowPermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPermissionRequest.class, ShowPermissionResponse.class)
                .withName("ShowPermission")
                .withUri("/v1/permissions/{permission_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("permission_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPermissionRequest::getPermissionId, ShowPermissionRequest::setPermissionId));
        builder.<Integer>withRequestField("permission_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPermissionRequest::getPermissionVersion,
                ShowPermissionRequest::setPermissionVersion));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPermissionRequest::getXSecurityToken, ShowPermissionRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse> searchSharedPrincipals =
        genForSearchSharedPrincipals();

    private static HttpRequestDef<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse> genForSearchSharedPrincipals() {
        // basic
        HttpRequestDef.Builder<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SearchSharedPrincipalsRequest.class, SearchSharedPrincipalsResponse.class)
            .withName("SearchSharedPrincipals")
            .withUri("/v1/shared-principals/search")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSharedPrincipalsRequest::getXSecurityToken,
                SearchSharedPrincipalsRequest::setXSecurityToken));
        builder.<SearchSharedPrincipalsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchSharedPrincipalsReqBody.class),
            f -> f.withMarshaller(SearchSharedPrincipalsRequest::getBody, SearchSharedPrincipalsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchSharedResourcesRequest, SearchSharedResourcesResponse> searchSharedResources =
        genForSearchSharedResources();

    private static HttpRequestDef<SearchSharedResourcesRequest, SearchSharedResourcesResponse> genForSearchSharedResources() {
        // basic
        HttpRequestDef.Builder<SearchSharedResourcesRequest, SearchSharedResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SearchSharedResourcesRequest.class, SearchSharedResourcesResponse.class)
            .withName("SearchSharedResources")
            .withUri("/v1/shared-resources/search")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSharedResourcesRequest::getXSecurityToken,
                SearchSharedResourcesRequest::setXSecurityToken));
        builder.<SearchSharedResourcesReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchSharedResourcesReqBody.class),
            f -> f.withMarshaller(SearchSharedResourcesRequest::getBody, SearchSharedResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceShareRequest, CreateResourceShareResponse> createResourceShare =
        genForCreateResourceShare();

    private static HttpRequestDef<CreateResourceShareRequest, CreateResourceShareResponse> genForCreateResourceShare() {
        // basic
        HttpRequestDef.Builder<CreateResourceShareRequest, CreateResourceShareResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceShareRequest.class, CreateResourceShareResponse.class)
                .withName("CreateResourceShare")
                .withUri("/v1/resource-shares")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceShareRequest::getXSecurityToken,
                CreateResourceShareRequest::setXSecurityToken));
        builder.<CreateResourceShareReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceShareReqBody.class),
            f -> f.withMarshaller(CreateResourceShareRequest::getBody, CreateResourceShareRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceShareRequest, DeleteResourceShareResponse> deleteResourceShare =
        genForDeleteResourceShare();

    private static HttpRequestDef<DeleteResourceShareRequest, DeleteResourceShareResponse> genForDeleteResourceShare() {
        // basic
        HttpRequestDef.Builder<DeleteResourceShareRequest, DeleteResourceShareResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteResourceShareRequest.class, DeleteResourceShareResponse.class)
            .withName("DeleteResourceShare")
            .withUri("/v1/resource-shares/{resource_share_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceShareRequest::getResourceShareId,
                DeleteResourceShareRequest::setResourceShareId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceShareRequest::getXSecurityToken,
                DeleteResourceShareRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceSharesRequest, SearchResourceSharesResponse> searchResourceShares =
        genForSearchResourceShares();

    private static HttpRequestDef<SearchResourceSharesRequest, SearchResourceSharesResponse> genForSearchResourceShares() {
        // basic
        HttpRequestDef.Builder<SearchResourceSharesRequest, SearchResourceSharesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SearchResourceSharesRequest.class, SearchResourceSharesResponse.class)
            .withName("SearchResourceShares")
            .withUri("/v1/resource-shares/search")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceSharesRequest::getXSecurityToken,
                SearchResourceSharesRequest::setXSecurityToken));
        builder.<SearchResourceSharesReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchResourceSharesReqBody.class),
            f -> f.withMarshaller(SearchResourceSharesRequest::getBody, SearchResourceSharesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceShareRequest, UpdateResourceShareResponse> updateResourceShare =
        genForUpdateResourceShare();

    private static HttpRequestDef<UpdateResourceShareRequest, UpdateResourceShareResponse> genForUpdateResourceShare() {
        // basic
        HttpRequestDef.Builder<UpdateResourceShareRequest, UpdateResourceShareResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResourceShareRequest.class, UpdateResourceShareResponse.class)
                .withName("UpdateResourceShare")
                .withUri("/v1/resource-shares/{resource_share_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceShareRequest::getResourceShareId,
                UpdateResourceShareRequest::setResourceShareId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceShareRequest::getXSecurityToken,
                UpdateResourceShareRequest::setXSecurityToken));
        builder.<UpdateResourceShareReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResourceShareReqBody.class),
            f -> f.withMarshaller(UpdateResourceShareRequest::getBody, UpdateResourceShareRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateResourceShareRequest, AssociateResourceShareResponse> associateResourceShare =
        genForAssociateResourceShare();

    private static HttpRequestDef<AssociateResourceShareRequest, AssociateResourceShareResponse> genForAssociateResourceShare() {
        // basic
        HttpRequestDef.Builder<AssociateResourceShareRequest, AssociateResourceShareResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociateResourceShareRequest.class, AssociateResourceShareResponse.class)
            .withName("AssociateResourceShare")
            .withUri("/v1/resource-shares/{resource_share_id}/associate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateResourceShareRequest::getResourceShareId,
                AssociateResourceShareRequest::setResourceShareId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateResourceShareRequest::getXSecurityToken,
                AssociateResourceShareRequest::setXSecurityToken));
        builder.<ResourceShareAssociationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceShareAssociationReqBody.class),
            f -> f.withMarshaller(AssociateResourceShareRequest::getBody, AssociateResourceShareRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateResourceShareRequest, DisassociateResourceShareResponse> disassociateResourceShare =
        genForDisassociateResourceShare();

    private static HttpRequestDef<DisassociateResourceShareRequest, DisassociateResourceShareResponse> genForDisassociateResourceShare() {
        // basic
        HttpRequestDef.Builder<DisassociateResourceShareRequest, DisassociateResourceShareResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisassociateResourceShareRequest.class,
                    DisassociateResourceShareResponse.class)
                .withName("DisassociateResourceShare")
                .withUri("/v1/resource-shares/{resource_share_id}/disassociate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateResourceShareRequest::getResourceShareId,
                DisassociateResourceShareRequest::setResourceShareId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateResourceShareRequest::getXSecurityToken,
                DisassociateResourceShareRequest::setXSecurityToken));
        builder.<ResourceShareAssociationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceShareAssociationReqBody.class),
            f -> f.withMarshaller(DisassociateResourceShareRequest::getBody,
                DisassociateResourceShareRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceShareAssociationsRequest, SearchResourceShareAssociationsResponse> searchResourceShareAssociations =
        genForSearchResourceShareAssociations();

    private static HttpRequestDef<SearchResourceShareAssociationsRequest, SearchResourceShareAssociationsResponse> genForSearchResourceShareAssociations() {
        // basic
        HttpRequestDef.Builder<SearchResourceShareAssociationsRequest, SearchResourceShareAssociationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SearchResourceShareAssociationsRequest.class,
                    SearchResourceShareAssociationsResponse.class)
                .withName("SearchResourceShareAssociations")
                .withUri("/v1/resource-share-associations/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceShareAssociationsRequest::getXSecurityToken,
                SearchResourceShareAssociationsRequest::setXSecurityToken));
        builder.<SearchResourceShareAssociationsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchResourceShareAssociationsReqBody.class),
            f -> f.withMarshaller(SearchResourceShareAssociationsRequest::getBody,
                SearchResourceShareAssociationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResponse> acceptResourceShareInvitation =
        genForAcceptResourceShareInvitation();

    private static HttpRequestDef<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResponse> genForAcceptResourceShareInvitation() {
        // basic
        HttpRequestDef.Builder<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AcceptResourceShareInvitationRequest.class,
                    AcceptResourceShareInvitationResponse.class)
                .withName("AcceptResourceShareInvitation")
                .withUri("/v1/resource-share-invitations/{resource_share_invitation_id}/accept")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_share_invitation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptResourceShareInvitationRequest::getResourceShareInvitationId,
                AcceptResourceShareInvitationRequest::setResourceShareInvitationId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptResourceShareInvitationRequest::getXSecurityToken,
                AcceptResourceShareInvitationRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResponse> rejectResourceShareInvitation =
        genForRejectResourceShareInvitation();

    private static HttpRequestDef<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResponse> genForRejectResourceShareInvitation() {
        // basic
        HttpRequestDef.Builder<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RejectResourceShareInvitationRequest.class,
                    RejectResourceShareInvitationResponse.class)
                .withName("RejectResourceShareInvitation")
                .withUri("/v1/resource-share-invitations/{resource_share_invitation_id}/reject")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_share_invitation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectResourceShareInvitationRequest::getResourceShareInvitationId,
                RejectResourceShareInvitationRequest::setResourceShareInvitationId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectResourceShareInvitationRequest::getXSecurityToken,
                RejectResourceShareInvitationRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceShareInvitationRequest, SearchResourceShareInvitationResponse> searchResourceShareInvitation =
        genForSearchResourceShareInvitation();

    private static HttpRequestDef<SearchResourceShareInvitationRequest, SearchResourceShareInvitationResponse> genForSearchResourceShareInvitation() {
        // basic
        HttpRequestDef.Builder<SearchResourceShareInvitationRequest, SearchResourceShareInvitationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SearchResourceShareInvitationRequest.class,
                    SearchResourceShareInvitationResponse.class)
                .withName("SearchResourceShareInvitation")
                .withUri("/v1/resource-share-invitations/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceShareInvitationRequest::getXSecurityToken,
                SearchResourceShareInvitationRequest::setXSecurityToken));
        builder.<SearchResourceShareInvitationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchResourceShareInvitationReqBody.class),
            f -> f.withMarshaller(SearchResourceShareInvitationRequest::getBody,
                SearchResourceShareInvitationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateResourceShareTagsRequest, BatchCreateResourceShareTagsResponse> batchCreateResourceShareTags =
        genForBatchCreateResourceShareTags();

    private static HttpRequestDef<BatchCreateResourceShareTagsRequest, BatchCreateResourceShareTagsResponse> genForBatchCreateResourceShareTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateResourceShareTagsRequest, BatchCreateResourceShareTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateResourceShareTagsRequest.class,
                    BatchCreateResourceShareTagsResponse.class)
                .withName("BatchCreateResourceShareTags")
                .withUri("/v1/resource-shares/{resource_share_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateResourceShareTagsRequest::getResourceShareId,
                BatchCreateResourceShareTagsRequest::setResourceShareId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateResourceShareTagsRequest::getXSecurityToken,
                BatchCreateResourceShareTagsRequest::setXSecurityToken));
        builder.<TagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceReqBody.class),
            f -> f.withMarshaller(BatchCreateResourceShareTagsRequest::getBody,
                BatchCreateResourceShareTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteResourceShareTagsRequest, BatchDeleteResourceShareTagsResponse> batchDeleteResourceShareTags =
        genForBatchDeleteResourceShareTags();

    private static HttpRequestDef<BatchDeleteResourceShareTagsRequest, BatchDeleteResourceShareTagsResponse> genForBatchDeleteResourceShareTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteResourceShareTagsRequest, BatchDeleteResourceShareTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteResourceShareTagsRequest.class,
                    BatchDeleteResourceShareTagsResponse.class)
                .withName("BatchDeleteResourceShareTags")
                .withUri("/v1/resource-shares/{resource_share_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteResourceShareTagsRequest::getResourceShareId,
                BatchDeleteResourceShareTagsRequest::setResourceShareId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteResourceShareTagsRequest::getXSecurityToken,
                BatchDeleteResourceShareTagsRequest::setXSecurityToken));
        builder.<UntagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UntagResourceReqBody.class),
            f -> f.withMarshaller(BatchDeleteResourceShareTagsRequest::getBody,
                BatchDeleteResourceShareTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceShareTagsRequest, ListResourceShareTagsResponse> listResourceShareTags =
        genForListResourceShareTags();

    private static HttpRequestDef<ListResourceShareTagsRequest, ListResourceShareTagsResponse> genForListResourceShareTags() {
        // basic
        HttpRequestDef.Builder<ListResourceShareTagsRequest, ListResourceShareTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListResourceShareTagsRequest.class, ListResourceShareTagsResponse.class)
            .withName("ListResourceShareTags")
            .withUri("/v1/resource-shares/tags")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceShareTagsRequest::getLimit, ListResourceShareTagsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceShareTagsRequest::getMarker, ListResourceShareTagsRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceShareTagsRequest::getXSecurityToken,
                ListResourceShareTagsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceSharesByTagsRequest, ListResourceSharesByTagsResponse> listResourceSharesByTags =
        genForListResourceSharesByTags();

    private static HttpRequestDef<ListResourceSharesByTagsRequest, ListResourceSharesByTagsResponse> genForListResourceSharesByTags() {
        // basic
        HttpRequestDef.Builder<ListResourceSharesByTagsRequest, ListResourceSharesByTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListResourceSharesByTagsRequest.class, ListResourceSharesByTagsResponse.class)
                .withName("ListResourceSharesByTags")
                .withUri("/v1/resource-shares/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceSharesByTagsRequest::getLimit,
                ListResourceSharesByTagsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceSharesByTagsRequest::getOffset,
                ListResourceSharesByTagsRequest::setOffset));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceSharesByTagsRequest::getXSecurityToken,
                ListResourceSharesByTagsRequest::setXSecurityToken));
        builder.<ResourceSharesByTagsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceSharesByTagsReqBody.class),
            f -> f.withMarshaller(ListResourceSharesByTagsRequest::getBody, ListResourceSharesByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceShareCountByTagsRequest, SearchResourceShareCountByTagsResponse> searchResourceShareCountByTags =
        genForSearchResourceShareCountByTags();

    private static HttpRequestDef<SearchResourceShareCountByTagsRequest, SearchResourceShareCountByTagsResponse> genForSearchResourceShareCountByTags() {
        // basic
        HttpRequestDef.Builder<SearchResourceShareCountByTagsRequest, SearchResourceShareCountByTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SearchResourceShareCountByTagsRequest.class,
                    SearchResourceShareCountByTagsResponse.class)
                .withName("SearchResourceShareCountByTags")
                .withUri("/v1/resource-shares/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceShareCountByTagsRequest::getXSecurityToken,
                SearchResourceShareCountByTagsRequest::setXSecurityToken));
        builder.<ResourceSharesByTagsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceSharesByTagsReqBody.class),
            f -> f.withMarshaller(SearchResourceShareCountByTagsRequest::getBody,
                SearchResourceShareCountByTagsRequest::setBody));

        // response

        return builder.build();
    }

}
