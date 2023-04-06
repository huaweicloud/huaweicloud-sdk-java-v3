package com.huaweicloud.sdk.ram.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ram.v1.model.*;

@SuppressWarnings("unchecked")
public class RamMeta {

    public static final HttpRequestDef<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResponse> associateResourceSharePermission =
        genForassociateResourceSharePermission();

    private static HttpRequestDef<AssociateResourceSharePermissionRequest, AssociateResourceSharePermissionResponse> genForassociateResourceSharePermission() {
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
            f -> f.withMarshaller(AssociateResourceSharePermissionRequest::getResourceShareId, (req, v) -> {
                req.setResourceShareId(v);
            }));
        builder.<AssociatePermissionReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociatePermissionReqBody.class),
            f -> f.withMarshaller(AssociateResourceSharePermissionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResponse> disassociateResourceSharePermission =
        genFordisassociateResourceSharePermission();

    private static HttpRequestDef<DisassociateResourceSharePermissionRequest, DisassociateResourceSharePermissionResponse> genFordisassociateResourceSharePermission() {
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
            f -> f.withMarshaller(DisassociateResourceSharePermissionRequest::getResourceShareId, (req, v) -> {
                req.setResourceShareId(v);
            }));
        builder.<DisassociatePermissionReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociatePermissionReqBody.class),
            f -> f.withMarshaller(DisassociateResourceSharePermissionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResponse> listResourceSharePermissions =
        genForlistResourceSharePermissions();

    private static HttpRequestDef<ListResourceSharePermissionsRequest, ListResourceSharePermissionsResponse> genForlistResourceSharePermissions() {
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
            f -> f.withMarshaller(ListResourceSharePermissionsRequest::getResourceShareId, (req, v) -> {
                req.setResourceShareId(v);
            }));
        builder.<String>withRequestField("permission_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceSharePermissionsRequest::getPermissionName, (req, v) -> {
                req.setPermissionName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceSharePermissionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceSharePermissionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableOrganizationShareRequest, DisableOrganizationShareResponse> disableOrganizationShare =
        genFordisableOrganizationShare();

    private static HttpRequestDef<DisableOrganizationShareRequest, DisableOrganizationShareResponse> genFordisableOrganizationShare() {
        // basic
        HttpRequestDef.Builder<DisableOrganizationShareRequest, DisableOrganizationShareResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, DisableOrganizationShareRequest.class, DisableOrganizationShareResponse.class)
                .withName("DisableOrganizationShare")
                .withUri("/v1/organization-share/disable")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableOrganizationShareRequest, EnableOrganizationShareResponse> enableOrganizationShare =
        genForenableOrganizationShare();

    private static HttpRequestDef<EnableOrganizationShareRequest, EnableOrganizationShareResponse> genForenableOrganizationShare() {
        // basic
        HttpRequestDef.Builder<EnableOrganizationShareRequest, EnableOrganizationShareResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, EnableOrganizationShareRequest.class, EnableOrganizationShareResponse.class)
            .withName("EnableOrganizationShare")
            .withUri("/v1/organization-share/enable")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrganizationShareRequest, ShowOrganizationShareResponse> showOrganizationShare =
        genForshowOrganizationShare();

    private static HttpRequestDef<ShowOrganizationShareRequest, ShowOrganizationShareResponse> genForshowOrganizationShare() {
        // basic
        HttpRequestDef.Builder<ShowOrganizationShareRequest, ShowOrganizationShareResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOrganizationShareRequest.class, ShowOrganizationShareResponse.class)
            .withName("ShowOrganizationShare")
            .withUri("/v1/organization-share")
            .withContentType("application/json");

        // requests

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
                .withUri("/v1/permissions")
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
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPermissionRequest, ShowPermissionResponse> showPermission =
        genForshowPermission();

    private static HttpRequestDef<ShowPermissionRequest, ShowPermissionResponse> genForshowPermission() {
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
            f -> f.withMarshaller(ShowPermissionRequest::getPermissionId, (req, v) -> {
                req.setPermissionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchDistinctPrincipalsRequest, SearchDistinctPrincipalsResponse> searchDistinctPrincipals =
        genForsearchDistinctPrincipals();

    private static HttpRequestDef<SearchDistinctPrincipalsRequest, SearchDistinctPrincipalsResponse> genForsearchDistinctPrincipals() {
        // basic
        HttpRequestDef.Builder<SearchDistinctPrincipalsRequest, SearchDistinctPrincipalsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, SearchDistinctPrincipalsRequest.class, SearchDistinctPrincipalsResponse.class)
                .withName("SearchDistinctPrincipals")
                .withUri("/v1/shared-principals/search-distinct-principal")
                .withContentType("application/json");

        // requests
        builder.<SearchDistinctSharedPrincipalsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchDistinctSharedPrincipalsReqBody.class),
            f -> f.withMarshaller(SearchDistinctPrincipalsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse> searchSharedPrincipals =
        genForsearchSharedPrincipals();

    private static HttpRequestDef<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse> genForsearchSharedPrincipals() {
        // basic
        HttpRequestDef.Builder<SearchSharedPrincipalsRequest, SearchSharedPrincipalsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SearchSharedPrincipalsRequest.class, SearchSharedPrincipalsResponse.class)
            .withName("SearchSharedPrincipals")
            .withUri("/v1/shared-principals/search")
            .withContentType("application/json");

        // requests
        builder.<SearchSharedPrincipalsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchSharedPrincipalsReqBody.class),
            f -> f.withMarshaller(SearchSharedPrincipalsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchDistinctSharedResourcesRequest, SearchDistinctSharedResourcesResponse> searchDistinctSharedResources =
        genForsearchDistinctSharedResources();

    private static HttpRequestDef<SearchDistinctSharedResourcesRequest, SearchDistinctSharedResourcesResponse> genForsearchDistinctSharedResources() {
        // basic
        HttpRequestDef.Builder<SearchDistinctSharedResourcesRequest, SearchDistinctSharedResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SearchDistinctSharedResourcesRequest.class,
                    SearchDistinctSharedResourcesResponse.class)
                .withName("SearchDistinctSharedResources")
                .withUri("/v1/shared-resources/search-distinct-resource")
                .withContentType("application/json");

        // requests
        builder.<SearchDistinctSharedResourcesReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchDistinctSharedResourcesReqBody.class),
            f -> f.withMarshaller(SearchDistinctSharedResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchSharedResourcesRequest, SearchSharedResourcesResponse> searchSharedResources =
        genForsearchSharedResources();

    private static HttpRequestDef<SearchSharedResourcesRequest, SearchSharedResourcesResponse> genForsearchSharedResources() {
        // basic
        HttpRequestDef.Builder<SearchSharedResourcesRequest, SearchSharedResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SearchSharedResourcesRequest.class, SearchSharedResourcesResponse.class)
            .withName("SearchSharedResources")
            .withUri("/v1/shared-resources/search")
            .withContentType("application/json");

        // requests
        builder.<SearchSharedResourcesReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchSharedResourcesReqBody.class),
            f -> f.withMarshaller(SearchSharedResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceShareRequest, CreateResourceShareResponse> createResourceShare =
        genForcreateResourceShare();

    private static HttpRequestDef<CreateResourceShareRequest, CreateResourceShareResponse> genForcreateResourceShare() {
        // basic
        HttpRequestDef.Builder<CreateResourceShareRequest, CreateResourceShareResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceShareRequest.class, CreateResourceShareResponse.class)
                .withName("CreateResourceShare")
                .withUri("/v1/resource-shares")
                .withContentType("application/json");

        // requests
        builder.<CreateResourceShareReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceShareReqBody.class),
            f -> f.withMarshaller(CreateResourceShareRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceShareRequest, DeleteResourceShareResponse> deleteResourceShare =
        genFordeleteResourceShare();

    private static HttpRequestDef<DeleteResourceShareRequest, DeleteResourceShareResponse> genFordeleteResourceShare() {
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
            f -> f.withMarshaller(DeleteResourceShareRequest::getResourceShareId, (req, v) -> {
                req.setResourceShareId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceSharesRequest, SearchResourceSharesResponse> searchResourceShares =
        genForsearchResourceShares();

    private static HttpRequestDef<SearchResourceSharesRequest, SearchResourceSharesResponse> genForsearchResourceShares() {
        // basic
        HttpRequestDef.Builder<SearchResourceSharesRequest, SearchResourceSharesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SearchResourceSharesRequest.class, SearchResourceSharesResponse.class)
            .withName("SearchResourceShares")
            .withUri("/v1/resource-shares/search")
            .withContentType("application/json");

        // requests
        builder.<SearchResourceSharesReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchResourceSharesReqBody.class),
            f -> f.withMarshaller(SearchResourceSharesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceShareRequest, UpdateResourceShareResponse> updateResourceShare =
        genForupdateResourceShare();

    private static HttpRequestDef<UpdateResourceShareRequest, UpdateResourceShareResponse> genForupdateResourceShare() {
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
            f -> f.withMarshaller(UpdateResourceShareRequest::getResourceShareId, (req, v) -> {
                req.setResourceShareId(v);
            }));
        builder.<UpdateResourceShareReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResourceShareReqBody.class),
            f -> f.withMarshaller(UpdateResourceShareRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateResourceShareRequest, AssociateResourceShareResponse> associateResourceShare =
        genForassociateResourceShare();

    private static HttpRequestDef<AssociateResourceShareRequest, AssociateResourceShareResponse> genForassociateResourceShare() {
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
            f -> f.withMarshaller(AssociateResourceShareRequest::getResourceShareId, (req, v) -> {
                req.setResourceShareId(v);
            }));
        builder.<ResourceShareAssociationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceShareAssociationReqBody.class),
            f -> f.withMarshaller(AssociateResourceShareRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateResourceShareRequest, DisassociateResourceShareResponse> disassociateResourceShare =
        genFordisassociateResourceShare();

    private static HttpRequestDef<DisassociateResourceShareRequest, DisassociateResourceShareResponse> genFordisassociateResourceShare() {
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
            f -> f.withMarshaller(DisassociateResourceShareRequest::getResourceShareId, (req, v) -> {
                req.setResourceShareId(v);
            }));
        builder.<ResourceShareAssociationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceShareAssociationReqBody.class),
            f -> f.withMarshaller(DisassociateResourceShareRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceShareAssociationsRequest, SearchResourceShareAssociationsResponse> searchResourceShareAssociations =
        genForsearchResourceShareAssociations();

    private static HttpRequestDef<SearchResourceShareAssociationsRequest, SearchResourceShareAssociationsResponse> genForsearchResourceShareAssociations() {
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
        builder.<SearchResourceShareAssociationsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchResourceShareAssociationsReqBody.class),
            f -> f.withMarshaller(SearchResourceShareAssociationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResponse> acceptResourceShareInvitation =
        genForacceptResourceShareInvitation();

    private static HttpRequestDef<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResponse> genForacceptResourceShareInvitation() {
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
            f -> f.withMarshaller(AcceptResourceShareInvitationRequest::getResourceShareInvitationId, (req, v) -> {
                req.setResourceShareInvitationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResponse> rejectResourceShareInvitation =
        genForrejectResourceShareInvitation();

    private static HttpRequestDef<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResponse> genForrejectResourceShareInvitation() {
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
            f -> f.withMarshaller(RejectResourceShareInvitationRequest::getResourceShareInvitationId, (req, v) -> {
                req.setResourceShareInvitationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceShareInvitationRequest, SearchResourceShareInvitationResponse> searchResourceShareInvitation =
        genForsearchResourceShareInvitation();

    private static HttpRequestDef<SearchResourceShareInvitationRequest, SearchResourceShareInvitationResponse> genForsearchResourceShareInvitation() {
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
        builder.<SearchResourceShareInvitationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchResourceShareInvitationReqBody.class),
            f -> f.withMarshaller(SearchResourceShareInvitationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateResourceShareTagsRequest, BatchCreateResourceShareTagsResponse> batchCreateResourceShareTags =
        genForbatchCreateResourceShareTags();

    private static HttpRequestDef<BatchCreateResourceShareTagsRequest, BatchCreateResourceShareTagsResponse> genForbatchCreateResourceShareTags() {
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
            f -> f.withMarshaller(BatchCreateResourceShareTagsRequest::getResourceShareId, (req, v) -> {
                req.setResourceShareId(v);
            }));
        builder.<TagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceReqBody.class),
            f -> f.withMarshaller(BatchCreateResourceShareTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteResourceShareTagsRequest, BatchDeleteResourceShareTagsResponse> batchDeleteResourceShareTags =
        genForbatchDeleteResourceShareTags();

    private static HttpRequestDef<BatchDeleteResourceShareTagsRequest, BatchDeleteResourceShareTagsResponse> genForbatchDeleteResourceShareTags() {
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
            f -> f.withMarshaller(BatchDeleteResourceShareTagsRequest::getResourceShareId, (req, v) -> {
                req.setResourceShareId(v);
            }));
        builder.<UntagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UntagResourceReqBody.class),
            f -> f.withMarshaller(BatchDeleteResourceShareTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceShareTagsRequest, ListResourceShareTagsResponse> listResourceShareTags =
        genForlistResourceShareTags();

    private static HttpRequestDef<ListResourceShareTagsRequest, ListResourceShareTagsResponse> genForlistResourceShareTags() {
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
            f -> f.withMarshaller(ListResourceShareTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceShareTagsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceSharesByTagsRequest, ListResourceSharesByTagsResponse> listResourceSharesByTags =
        genForlistResourceSharesByTags();

    private static HttpRequestDef<ListResourceSharesByTagsRequest, ListResourceSharesByTagsResponse> genForlistResourceSharesByTags() {
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
            f -> f.withMarshaller(ListResourceSharesByTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceSharesByTagsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ResourceSharesByTagsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceSharesByTagsReqBody.class),
            f -> f.withMarshaller(ListResourceSharesByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceShareCountByTagsRequest, SearchResourceShareCountByTagsResponse> searchResourceShareCountByTags =
        genForsearchResourceShareCountByTags();

    private static HttpRequestDef<SearchResourceShareCountByTagsRequest, SearchResourceShareCountByTagsResponse> genForsearchResourceShareCountByTags() {
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
        builder.<ResourceSharesByTagsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceSharesByTagsReqBody.class),
            f -> f.withMarshaller(SearchResourceShareCountByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
