package com.huaweicloud.sdk.er.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.er.v3.model.AcceptAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.AcceptAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.AssociateRouteTableRequest;
import com.huaweicloud.sdk.er.v3.model.AssociateRouteTableResponse;
import com.huaweicloud.sdk.er.v3.model.AssociationRequestBody;
import com.huaweicloud.sdk.er.v3.model.BatchCreateResourceTagsRequest;
import com.huaweicloud.sdk.er.v3.model.BatchCreateResourceTagsResponse;
import com.huaweicloud.sdk.er.v3.model.BatchOperateResourceTagsRequestBody;
import com.huaweicloud.sdk.er.v3.model.ChangeAvailabilityZoneRequest;
import com.huaweicloud.sdk.er.v3.model.ChangeAvailabilityZoneResponse;
import com.huaweicloud.sdk.er.v3.model.CreateEnterpriseRouterRequest;
import com.huaweicloud.sdk.er.v3.model.CreateEnterpriseRouterRequestBody;
import com.huaweicloud.sdk.er.v3.model.CreateEnterpriseRouterResponse;
import com.huaweicloud.sdk.er.v3.model.CreateFlowLogRequest;
import com.huaweicloud.sdk.er.v3.model.CreateFlowLogRequestBody;
import com.huaweicloud.sdk.er.v3.model.CreateFlowLogResponse;
import com.huaweicloud.sdk.er.v3.model.CreateResourceTagRequest;
import com.huaweicloud.sdk.er.v3.model.CreateResourceTagRequestBody;
import com.huaweicloud.sdk.er.v3.model.CreateResourceTagResponse;
import com.huaweicloud.sdk.er.v3.model.CreateRouteRequestBody;
import com.huaweicloud.sdk.er.v3.model.CreateRouteTableRequest;
import com.huaweicloud.sdk.er.v3.model.CreateRouteTableRequestBody;
import com.huaweicloud.sdk.er.v3.model.CreateRouteTableResponse;
import com.huaweicloud.sdk.er.v3.model.CreateStaticRouteRequest;
import com.huaweicloud.sdk.er.v3.model.CreateStaticRouteResponse;
import com.huaweicloud.sdk.er.v3.model.CreateVpcAttachmentBody;
import com.huaweicloud.sdk.er.v3.model.CreateVpcAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.CreateVpcAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.DeleteEnterpriseRouterRequest;
import com.huaweicloud.sdk.er.v3.model.DeleteEnterpriseRouterResponse;
import com.huaweicloud.sdk.er.v3.model.DeleteFlowLogRequest;
import com.huaweicloud.sdk.er.v3.model.DeleteFlowLogResponse;
import com.huaweicloud.sdk.er.v3.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.er.v3.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.er.v3.model.DeleteRouteTableRequest;
import com.huaweicloud.sdk.er.v3.model.DeleteRouteTableResponse;
import com.huaweicloud.sdk.er.v3.model.DeleteStaticRouteRequest;
import com.huaweicloud.sdk.er.v3.model.DeleteStaticRouteResponse;
import com.huaweicloud.sdk.er.v3.model.DeleteVpcAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.DeleteVpcAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.DisableFlowLogRequest;
import com.huaweicloud.sdk.er.v3.model.DisableFlowLogResponse;
import com.huaweicloud.sdk.er.v3.model.DisablePropagationRequest;
import com.huaweicloud.sdk.er.v3.model.DisablePropagationResponse;
import com.huaweicloud.sdk.er.v3.model.DisassociateRouteTableRequest;
import com.huaweicloud.sdk.er.v3.model.DisassociateRouteTableResponse;
import com.huaweicloud.sdk.er.v3.model.EnableFlowLogRequest;
import com.huaweicloud.sdk.er.v3.model.EnableFlowLogResponse;
import com.huaweicloud.sdk.er.v3.model.EnablePropagationRequest;
import com.huaweicloud.sdk.er.v3.model.EnablePropagationResponse;
import com.huaweicloud.sdk.er.v3.model.EnterpriseRouterAZ;
import com.huaweicloud.sdk.er.v3.model.ListAssociationsRequest;
import com.huaweicloud.sdk.er.v3.model.ListAssociationsResponse;
import com.huaweicloud.sdk.er.v3.model.ListAttachmentsRequest;
import com.huaweicloud.sdk.er.v3.model.ListAttachmentsResponse;
import com.huaweicloud.sdk.er.v3.model.ListAvailabilityZoneRequest;
import com.huaweicloud.sdk.er.v3.model.ListAvailabilityZoneResponse;
import com.huaweicloud.sdk.er.v3.model.ListEffectiveRoutesRequest;
import com.huaweicloud.sdk.er.v3.model.ListEffectiveRoutesResponse;
import com.huaweicloud.sdk.er.v3.model.ListEnterpriseRoutersRequest;
import com.huaweicloud.sdk.er.v3.model.ListEnterpriseRoutersResponse;
import com.huaweicloud.sdk.er.v3.model.ListFlowLogsRequest;
import com.huaweicloud.sdk.er.v3.model.ListFlowLogsResponse;
import com.huaweicloud.sdk.er.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.er.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.er.v3.model.ListPropagationsRequest;
import com.huaweicloud.sdk.er.v3.model.ListPropagationsResponse;
import com.huaweicloud.sdk.er.v3.model.ListRouteTablesRequest;
import com.huaweicloud.sdk.er.v3.model.ListRouteTablesResponse;
import com.huaweicloud.sdk.er.v3.model.ListStaticRoutesRequest;
import com.huaweicloud.sdk.er.v3.model.ListStaticRoutesResponse;
import com.huaweicloud.sdk.er.v3.model.ListVpcAttachmentsRequest;
import com.huaweicloud.sdk.er.v3.model.ListVpcAttachmentsResponse;
import com.huaweicloud.sdk.er.v3.model.PropagationRequestBody;
import com.huaweicloud.sdk.er.v3.model.RejectAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.RejectAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.ShowAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.ShowAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.ShowEnterpriseRouterRequest;
import com.huaweicloud.sdk.er.v3.model.ShowEnterpriseRouterResponse;
import com.huaweicloud.sdk.er.v3.model.ShowFlowLogRequest;
import com.huaweicloud.sdk.er.v3.model.ShowFlowLogResponse;
import com.huaweicloud.sdk.er.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.er.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.er.v3.model.ShowResourceTagRequest;
import com.huaweicloud.sdk.er.v3.model.ShowResourceTagResponse;
import com.huaweicloud.sdk.er.v3.model.ShowRouteTableRequest;
import com.huaweicloud.sdk.er.v3.model.ShowRouteTableResponse;
import com.huaweicloud.sdk.er.v3.model.ShowStaticRouteRequest;
import com.huaweicloud.sdk.er.v3.model.ShowStaticRouteResponse;
import com.huaweicloud.sdk.er.v3.model.ShowVpcAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.ShowVpcAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.UpdateAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.UpdateAttachmentRequestBody;
import com.huaweicloud.sdk.er.v3.model.UpdateAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.UpdateEnterpriseRouterRequest;
import com.huaweicloud.sdk.er.v3.model.UpdateEnterpriseRouterRequestBody;
import com.huaweicloud.sdk.er.v3.model.UpdateEnterpriseRouterResponse;
import com.huaweicloud.sdk.er.v3.model.UpdateFlowLogRequest;
import com.huaweicloud.sdk.er.v3.model.UpdateFlowLogRequestBody;
import com.huaweicloud.sdk.er.v3.model.UpdateFlowLogResponse;
import com.huaweicloud.sdk.er.v3.model.UpdateRouteRequestBody;
import com.huaweicloud.sdk.er.v3.model.UpdateRouteTableRequest;
import com.huaweicloud.sdk.er.v3.model.UpdateRouteTableRequestBody;
import com.huaweicloud.sdk.er.v3.model.UpdateRouteTableResponse;
import com.huaweicloud.sdk.er.v3.model.UpdateStaticRouteRequest;
import com.huaweicloud.sdk.er.v3.model.UpdateStaticRouteResponse;
import com.huaweicloud.sdk.er.v3.model.UpdateVpcAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.UpdateVpcAttachmentRequestBody;
import com.huaweicloud.sdk.er.v3.model.UpdateVpcAttachmentResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class ErMeta {

    public static final HttpRequestDef<AssociateRouteTableRequest, AssociateRouteTableResponse> associateRouteTable =
        genForAssociateRouteTable();

    private static HttpRequestDef<AssociateRouteTableRequest, AssociateRouteTableResponse> genForAssociateRouteTable() {
        // basic
        HttpRequestDef.Builder<AssociateRouteTableRequest, AssociateRouteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateRouteTableRequest.class, AssociateRouteTableResponse.class)
                .withName("AssociateRouteTable")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/route-tables/{route_table_id}/associate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRouteTableRequest::getErId, AssociateRouteTableRequest::setErId));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRouteTableRequest::getRouteTableId,
                AssociateRouteTableRequest::setRouteTableId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRouteTableRequest::getXClientToken,
                AssociateRouteTableRequest::setXClientToken));
        builder.<AssociationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociationRequestBody.class),
            f -> f.withMarshaller(AssociateRouteTableRequest::getBody, AssociateRouteTableRequest::setBody));

        // response

        builder.<String>withResponseField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AssociateRouteTableResponse::getXClientToken,
                AssociateRouteTableResponse::setXClientToken));
        return builder.build();
    }

    public static final HttpRequestDef<DisassociateRouteTableRequest, DisassociateRouteTableResponse> disassociateRouteTable =
        genForDisassociateRouteTable();

    private static HttpRequestDef<DisassociateRouteTableRequest, DisassociateRouteTableResponse> genForDisassociateRouteTable() {
        // basic
        HttpRequestDef.Builder<DisassociateRouteTableRequest, DisassociateRouteTableResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisassociateRouteTableRequest.class, DisassociateRouteTableResponse.class)
            .withName("DisassociateRouteTable")
            .withUri("/v3/{project_id}/enterprise-router/{er_id}/route-tables/{route_table_id}/disassociate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateRouteTableRequest::getErId, DisassociateRouteTableRequest::setErId));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateRouteTableRequest::getRouteTableId,
                DisassociateRouteTableRequest::setRouteTableId));
        builder.<AssociationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociationRequestBody.class),
            f -> f.withMarshaller(DisassociateRouteTableRequest::getBody, DisassociateRouteTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssociationsRequest, ListAssociationsResponse> listAssociations =
        genForListAssociations();

    private static HttpRequestDef<ListAssociationsRequest, ListAssociationsResponse> genForListAssociations() {
        // basic
        HttpRequestDef.Builder<ListAssociationsRequest, ListAssociationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAssociationsRequest.class, ListAssociationsResponse.class)
                .withName("ListAssociations")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/route-tables/{route_table_id}/associations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociationsRequest::getErId, ListAssociationsRequest::setErId));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociationsRequest::getRouteTableId, ListAssociationsRequest::setRouteTableId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociationsRequest::getLimit, ListAssociationsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociationsRequest::getMarker, ListAssociationsRequest::setMarker));
        builder.<List<String>>withRequestField("attachment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssociationsRequest::getAttachmentId, ListAssociationsRequest::setAttachmentId));
        builder.<List<ListAssociationsRequest.ResourceTypeEnum>>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssociationsRequest::getResourceType, ListAssociationsRequest::setResourceType));
        builder.<List<ListAssociationsRequest.StateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssociationsRequest::getState, ListAssociationsRequest::setState));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssociationsRequest::getSortKey, ListAssociationsRequest::setSortKey));
        builder.<List<ListAssociationsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssociationsRequest::getSortDir, ListAssociationsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AcceptAttachmentRequest, AcceptAttachmentResponse> acceptAttachment =
        genForAcceptAttachment();

    private static HttpRequestDef<AcceptAttachmentRequest, AcceptAttachmentResponse> genForAcceptAttachment() {
        // basic
        HttpRequestDef.Builder<AcceptAttachmentRequest, AcceptAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AcceptAttachmentRequest.class, AcceptAttachmentResponse.class)
                .withName("AcceptAttachment")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/attachments/{attachment_id}/accept")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptAttachmentRequest::getErId, AcceptAttachmentRequest::setErId));
        builder.<String>withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptAttachmentRequest::getAttachmentId, AcceptAttachmentRequest::setAttachmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttachmentsRequest, ListAttachmentsResponse> listAttachments =
        genForListAttachments();

    private static HttpRequestDef<ListAttachmentsRequest, ListAttachmentsResponse> genForListAttachments() {
        // basic
        HttpRequestDef.Builder<ListAttachmentsRequest, ListAttachmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAttachmentsRequest.class, ListAttachmentsResponse.class)
                .withName("ListAttachments")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/attachments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getErId, ListAttachmentsRequest::setErId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getLimit, ListAttachmentsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getMarker, ListAttachmentsRequest::setMarker));
        builder.<List<ListAttachmentsRequest.StateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getState, ListAttachmentsRequest::setState));
        builder.<List<ListAttachmentsRequest.ResourceTypeEnum>>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getResourceType, ListAttachmentsRequest::setResourceType));
        builder.<List<String>>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getResourceId, ListAttachmentsRequest::setResourceId));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getSortKey, ListAttachmentsRequest::setSortKey));
        builder.<List<ListAttachmentsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getSortDir, ListAttachmentsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RejectAttachmentRequest, RejectAttachmentResponse> rejectAttachment =
        genForRejectAttachment();

    private static HttpRequestDef<RejectAttachmentRequest, RejectAttachmentResponse> genForRejectAttachment() {
        // basic
        HttpRequestDef.Builder<RejectAttachmentRequest, RejectAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RejectAttachmentRequest.class, RejectAttachmentResponse.class)
                .withName("RejectAttachment")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/attachments/{attachment_id}/reject")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectAttachmentRequest::getErId, RejectAttachmentRequest::setErId));
        builder.<String>withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectAttachmentRequest::getAttachmentId, RejectAttachmentRequest::setAttachmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAttachmentRequest, ShowAttachmentResponse> showAttachment =
        genForShowAttachment();

    private static HttpRequestDef<ShowAttachmentRequest, ShowAttachmentResponse> genForShowAttachment() {
        // basic
        HttpRequestDef.Builder<ShowAttachmentRequest, ShowAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAttachmentRequest.class, ShowAttachmentResponse.class)
                .withName("ShowAttachment")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/attachments/{attachment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAttachmentRequest::getErId, ShowAttachmentRequest::setErId));
        builder.<String>withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAttachmentRequest::getAttachmentId, ShowAttachmentRequest::setAttachmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAttachmentRequest, UpdateAttachmentResponse> updateAttachment =
        genForUpdateAttachment();

    private static HttpRequestDef<UpdateAttachmentRequest, UpdateAttachmentResponse> genForUpdateAttachment() {
        // basic
        HttpRequestDef.Builder<UpdateAttachmentRequest, UpdateAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAttachmentRequest.class, UpdateAttachmentResponse.class)
                .withName("UpdateAttachment")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/attachments/{attachment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAttachmentRequest::getErId, UpdateAttachmentRequest::setErId));
        builder.<String>withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAttachmentRequest::getAttachmentId, UpdateAttachmentRequest::setAttachmentId));
        builder.<UpdateAttachmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAttachmentRequestBody.class),
            f -> f.withMarshaller(UpdateAttachmentRequest::getBody, UpdateAttachmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> listAvailabilityZone =
        genForListAvailabilityZone();

    private static HttpRequestDef<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> genForListAvailabilityZone() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailabilityZoneRequest.class, ListAvailabilityZoneResponse.class)
            .withName("ListAvailabilityZone")
            .withUri("/v3/{project_id}/enterprise-router/availability-zones")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailabilityZoneRequest::getInstanceId,
                ListAvailabilityZoneRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse> changeAvailabilityZone =
        genForChangeAvailabilityZone();

    private static HttpRequestDef<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse> genForChangeAvailabilityZone() {
        // basic
        HttpRequestDef.Builder<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeAvailabilityZoneRequest.class, ChangeAvailabilityZoneResponse.class)
            .withName("ChangeAvailabilityZone")
            .withUri("/v3/{project_id}/enterprise-router/instances/{er_id}/change-availability-zone-ids")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeAvailabilityZoneRequest::getErId, ChangeAvailabilityZoneRequest::setErId));
        builder.<EnterpriseRouterAZ>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnterpriseRouterAZ.class),
            f -> f.withMarshaller(ChangeAvailabilityZoneRequest::getBody, ChangeAvailabilityZoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse> createEnterpriseRouter =
        genForCreateEnterpriseRouter();

    private static HttpRequestDef<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse> genForCreateEnterpriseRouter() {
        // basic
        HttpRequestDef.Builder<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateEnterpriseRouterRequest.class, CreateEnterpriseRouterResponse.class)
            .withName("CreateEnterpriseRouter")
            .withUri("/v3/{project_id}/enterprise-router/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEnterpriseRouterRequest::getXClientToken,
                CreateEnterpriseRouterRequest::setXClientToken));
        builder.<CreateEnterpriseRouterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEnterpriseRouterRequestBody.class),
            f -> f.withMarshaller(CreateEnterpriseRouterRequest::getBody, CreateEnterpriseRouterRequest::setBody));

        // response

        builder.<String>withResponseField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateEnterpriseRouterResponse::getXClientToken,
                CreateEnterpriseRouterResponse::setXClientToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse> deleteEnterpriseRouter =
        genForDeleteEnterpriseRouter();

    private static HttpRequestDef<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse> genForDeleteEnterpriseRouter() {
        // basic
        HttpRequestDef.Builder<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEnterpriseRouterRequest.class, DeleteEnterpriseRouterResponse.class)
            .withName("DeleteEnterpriseRouter")
            .withUri("/v3/{project_id}/enterprise-router/instances/{er_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnterpriseRouterRequest::getErId, DeleteEnterpriseRouterRequest::setErId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse> listEnterpriseRouters =
        genForListEnterpriseRouters();

    private static HttpRequestDef<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse> genForListEnterpriseRouters() {
        // basic
        HttpRequestDef.Builder<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEnterpriseRoutersRequest.class, ListEnterpriseRoutersResponse.class)
            .withName("ListEnterpriseRouters")
            .withUri("/v3/{project_id}/enterprise-router/instances")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getLimit, ListEnterpriseRoutersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getMarker, ListEnterpriseRoutersRequest::setMarker));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getEnterpriseProjectId,
                ListEnterpriseRoutersRequest::setEnterpriseProjectId));
        builder.<List<ListEnterpriseRoutersRequest.StateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getState, ListEnterpriseRoutersRequest::setState));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getId, ListEnterpriseRoutersRequest::setId));
        builder.<List<String>>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getResourceId,
                ListEnterpriseRoutersRequest::setResourceId));
        builder.<Boolean>withRequestField("owned_by_self",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getOwnedBySelf,
                ListEnterpriseRoutersRequest::setOwnedBySelf));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getSortKey, ListEnterpriseRoutersRequest::setSortKey));
        builder.<List<ListEnterpriseRoutersRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getSortDir, ListEnterpriseRoutersRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse> showEnterpriseRouter =
        genForShowEnterpriseRouter();

    private static HttpRequestDef<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse> genForShowEnterpriseRouter() {
        // basic
        HttpRequestDef.Builder<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEnterpriseRouterRequest.class, ShowEnterpriseRouterResponse.class)
            .withName("ShowEnterpriseRouter")
            .withUri("/v3/{project_id}/enterprise-router/instances/{er_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnterpriseRouterRequest::getErId, ShowEnterpriseRouterRequest::setErId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse> updateEnterpriseRouter =
        genForUpdateEnterpriseRouter();

    private static HttpRequestDef<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse> genForUpdateEnterpriseRouter() {
        // basic
        HttpRequestDef.Builder<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateEnterpriseRouterRequest.class, UpdateEnterpriseRouterResponse.class)
            .withName("UpdateEnterpriseRouter")
            .withUri("/v3/{project_id}/enterprise-router/instances/{er_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnterpriseRouterRequest::getErId, UpdateEnterpriseRouterRequest::setErId));
        builder.<UpdateEnterpriseRouterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEnterpriseRouterRequestBody.class),
            f -> f.withMarshaller(UpdateEnterpriseRouterRequest::getBody, UpdateEnterpriseRouterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlowLogRequest, CreateFlowLogResponse> createFlowLog =
        genForCreateFlowLog();

    private static HttpRequestDef<CreateFlowLogRequest, CreateFlowLogResponse> genForCreateFlowLog() {
        // basic
        HttpRequestDef.Builder<CreateFlowLogRequest, CreateFlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFlowLogRequest.class, CreateFlowLogResponse.class)
                .withName("CreateFlowLog")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/flow-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFlowLogRequest::getErId, CreateFlowLogRequest::setErId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFlowLogRequest::getXClientToken, CreateFlowLogRequest::setXClientToken));
        builder.<CreateFlowLogRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFlowLogRequestBody.class),
            f -> f.withMarshaller(CreateFlowLogRequest::getBody, CreateFlowLogRequest::setBody));

        // response

        builder.<String>withResponseField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateFlowLogResponse::getXClientToken, CreateFlowLogResponse::setXClientToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlowLogRequest, DeleteFlowLogResponse> deleteFlowLog =
        genForDeleteFlowLog();

    private static HttpRequestDef<DeleteFlowLogRequest, DeleteFlowLogResponse> genForDeleteFlowLog() {
        // basic
        HttpRequestDef.Builder<DeleteFlowLogRequest, DeleteFlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFlowLogRequest.class, DeleteFlowLogResponse.class)
                .withName("DeleteFlowLog")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/flow-logs/{flow_log_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlowLogRequest::getErId, DeleteFlowLogRequest::setErId));
        builder.<String>withRequestField("flow_log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlowLogRequest::getFlowLogId, DeleteFlowLogRequest::setFlowLogId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableFlowLogRequest, DisableFlowLogResponse> disableFlowLog =
        genForDisableFlowLog();

    private static HttpRequestDef<DisableFlowLogRequest, DisableFlowLogResponse> genForDisableFlowLog() {
        // basic
        HttpRequestDef.Builder<DisableFlowLogRequest, DisableFlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableFlowLogRequest.class, DisableFlowLogResponse.class)
                .withName("DisableFlowLog")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/flow-logs/{flow_log_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableFlowLogRequest::getErId, DisableFlowLogRequest::setErId));
        builder.<String>withRequestField("flow_log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableFlowLogRequest::getFlowLogId, DisableFlowLogRequest::setFlowLogId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableFlowLogRequest, EnableFlowLogResponse> enableFlowLog =
        genForEnableFlowLog();

    private static HttpRequestDef<EnableFlowLogRequest, EnableFlowLogResponse> genForEnableFlowLog() {
        // basic
        HttpRequestDef.Builder<EnableFlowLogRequest, EnableFlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableFlowLogRequest.class, EnableFlowLogResponse.class)
                .withName("EnableFlowLog")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/flow-logs/{flow_log_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableFlowLogRequest::getErId, EnableFlowLogRequest::setErId));
        builder.<String>withRequestField("flow_log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableFlowLogRequest::getFlowLogId, EnableFlowLogRequest::setFlowLogId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogs = genForListFlowLogs();

    private static HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> genForListFlowLogs() {
        // basic
        HttpRequestDef.Builder<ListFlowLogsRequest, ListFlowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlowLogsRequest.class, ListFlowLogsResponse.class)
                .withName("ListFlowLogs")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/flow-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getErId, ListFlowLogsRequest::setErId));
        builder.<ListFlowLogsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getResourceType, ListFlowLogsRequest::setResourceType));
        builder.<List<String>>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getResourceId, ListFlowLogsRequest::setResourceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLimit, ListFlowLogsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getMarker, ListFlowLogsRequest::setMarker));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getSortKey, ListFlowLogsRequest::setSortKey));
        builder.<List<ListFlowLogsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getSortDir, ListFlowLogsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlowLogRequest, ShowFlowLogResponse> showFlowLog = genForShowFlowLog();

    private static HttpRequestDef<ShowFlowLogRequest, ShowFlowLogResponse> genForShowFlowLog() {
        // basic
        HttpRequestDef.Builder<ShowFlowLogRequest, ShowFlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlowLogRequest.class, ShowFlowLogResponse.class)
                .withName("ShowFlowLog")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/flow-logs/{flow_log_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlowLogRequest::getErId, ShowFlowLogRequest::setErId));
        builder.<String>withRequestField("flow_log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlowLogRequest::getFlowLogId, ShowFlowLogRequest::setFlowLogId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlowLogRequest, UpdateFlowLogResponse> updateFlowLog =
        genForUpdateFlowLog();

    private static HttpRequestDef<UpdateFlowLogRequest, UpdateFlowLogResponse> genForUpdateFlowLog() {
        // basic
        HttpRequestDef.Builder<UpdateFlowLogRequest, UpdateFlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFlowLogRequest.class, UpdateFlowLogResponse.class)
                .withName("UpdateFlowLog")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/flow-logs/{flow_log_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlowLogRequest::getErId, UpdateFlowLogRequest::setErId));
        builder.<String>withRequestField("flow_log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlowLogRequest::getFlowLogId, UpdateFlowLogRequest::setFlowLogId));
        builder.<UpdateFlowLogRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlowLogRequestBody.class),
            f -> f.withMarshaller(UpdateFlowLogRequest::getBody, UpdateFlowLogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisablePropagationRequest, DisablePropagationResponse> disablePropagation =
        genForDisablePropagation();

    private static HttpRequestDef<DisablePropagationRequest, DisablePropagationResponse> genForDisablePropagation() {
        // basic
        HttpRequestDef.Builder<DisablePropagationRequest, DisablePropagationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisablePropagationRequest.class, DisablePropagationResponse.class)
                .withName("DisablePropagation")
                .withUri(
                    "/v3/{project_id}/enterprise-router/{er_id}/route-tables/{route_table_id}/disable-propagations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisablePropagationRequest::getErId, DisablePropagationRequest::setErId));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisablePropagationRequest::getRouteTableId,
                DisablePropagationRequest::setRouteTableId));
        builder.<PropagationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PropagationRequestBody.class),
            f -> f.withMarshaller(DisablePropagationRequest::getBody, DisablePropagationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnablePropagationRequest, EnablePropagationResponse> enablePropagation =
        genForEnablePropagation();

    private static HttpRequestDef<EnablePropagationRequest, EnablePropagationResponse> genForEnablePropagation() {
        // basic
        HttpRequestDef.Builder<EnablePropagationRequest, EnablePropagationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnablePropagationRequest.class, EnablePropagationResponse.class)
                .withName("EnablePropagation")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/route-tables/{route_table_id}/enable-propagations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnablePropagationRequest::getErId, EnablePropagationRequest::setErId));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnablePropagationRequest::getRouteTableId,
                EnablePropagationRequest::setRouteTableId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnablePropagationRequest::getXClientToken,
                EnablePropagationRequest::setXClientToken));
        builder.<PropagationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PropagationRequestBody.class),
            f -> f.withMarshaller(EnablePropagationRequest::getBody, EnablePropagationRequest::setBody));

        // response

        builder.<String>withResponseField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(EnablePropagationResponse::getXClientToken,
                EnablePropagationResponse::setXClientToken));
        return builder.build();
    }

    public static final HttpRequestDef<ListPropagationsRequest, ListPropagationsResponse> listPropagations =
        genForListPropagations();

    private static HttpRequestDef<ListPropagationsRequest, ListPropagationsResponse> genForListPropagations() {
        // basic
        HttpRequestDef.Builder<ListPropagationsRequest, ListPropagationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPropagationsRequest.class, ListPropagationsResponse.class)
                .withName("ListPropagations")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/route-tables/{route_table_id}/propagations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropagationsRequest::getErId, ListPropagationsRequest::setErId));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropagationsRequest::getRouteTableId, ListPropagationsRequest::setRouteTableId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPropagationsRequest::getLimit, ListPropagationsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropagationsRequest::getMarker, ListPropagationsRequest::setMarker));
        builder.<List<String>>withRequestField("attachment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPropagationsRequest::getAttachmentId, ListPropagationsRequest::setAttachmentId));
        builder.<List<ListPropagationsRequest.ResourceTypeEnum>>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPropagationsRequest::getResourceType, ListPropagationsRequest::setResourceType));
        builder.<List<ListPropagationsRequest.StateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPropagationsRequest::getState, ListPropagationsRequest::setState));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPropagationsRequest::getSortKey, ListPropagationsRequest::setSortKey));
        builder.<List<ListPropagationsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPropagationsRequest::getSortDir, ListPropagationsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForShowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForShowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v3/{project_id}/enterprise-router/quotas")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowQuotasRequest::getType, ShowQuotasRequest::setType));
        builder.<List<String>>withRequestField("erId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowQuotasRequest::getErId, ShowQuotasRequest::setErId));
        builder.<List<String>>withRequestField("routeTableId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowQuotasRequest::getRouteTableId, ShowQuotasRequest::setRouteTableId));
        builder.<List<String>>withRequestField("vpcId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowQuotasRequest::getVpcId, ShowQuotasRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStaticRouteRequest, CreateStaticRouteResponse> createStaticRoute =
        genForCreateStaticRoute();

    private static HttpRequestDef<CreateStaticRouteRequest, CreateStaticRouteResponse> genForCreateStaticRoute() {
        // basic
        HttpRequestDef.Builder<CreateStaticRouteRequest, CreateStaticRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStaticRouteRequest.class, CreateStaticRouteResponse.class)
                .withName("CreateStaticRoute")
                .withUri("/v3/{project_id}/enterprise-router/route-tables/{route_table_id}/static-routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStaticRouteRequest::getRouteTableId,
                CreateStaticRouteRequest::setRouteTableId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStaticRouteRequest::getXClientToken,
                CreateStaticRouteRequest::setXClientToken));
        builder.<CreateRouteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRouteRequestBody.class),
            f -> f.withMarshaller(CreateStaticRouteRequest::getBody, CreateStaticRouteRequest::setBody));

        // response

        builder.<String>withResponseField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateStaticRouteResponse::getXClientToken,
                CreateStaticRouteResponse::setXClientToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteStaticRouteRequest, DeleteStaticRouteResponse> deleteStaticRoute =
        genForDeleteStaticRoute();

    private static HttpRequestDef<DeleteStaticRouteRequest, DeleteStaticRouteResponse> genForDeleteStaticRoute() {
        // basic
        HttpRequestDef.Builder<DeleteStaticRouteRequest, DeleteStaticRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStaticRouteRequest.class, DeleteStaticRouteResponse.class)
                .withName("DeleteStaticRoute")
                .withUri("/v3/{project_id}/enterprise-router/route-tables/{route_table_id}/static-routes/{route_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStaticRouteRequest::getRouteTableId,
                DeleteStaticRouteRequest::setRouteTableId));
        builder.<String>withRequestField("route_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStaticRouteRequest::getRouteId, DeleteStaticRouteRequest::setRouteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse> listEffectiveRoutes =
        genForListEffectiveRoutes();

    private static HttpRequestDef<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse> genForListEffectiveRoutes() {
        // basic
        HttpRequestDef.Builder<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEffectiveRoutesRequest.class, ListEffectiveRoutesResponse.class)
                .withName("ListEffectiveRoutes")
                .withUri("/v3/{project_id}/enterprise-router/route-tables/{route_table_id}/routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEffectiveRoutesRequest::getRouteTableId,
                ListEffectiveRoutesRequest::setRouteTableId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEffectiveRoutesRequest::getLimit, ListEffectiveRoutesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEffectiveRoutesRequest::getMarker, ListEffectiveRoutesRequest::setMarker));
        builder.<List<String>>withRequestField("destination",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEffectiveRoutesRequest::getDestination,
                ListEffectiveRoutesRequest::setDestination));
        builder.<List<ListEffectiveRoutesRequest.ResourceTypeEnum>>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEffectiveRoutesRequest::getResourceType,
                ListEffectiveRoutesRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStaticRoutesRequest, ListStaticRoutesResponse> listStaticRoutes =
        genForListStaticRoutes();

    private static HttpRequestDef<ListStaticRoutesRequest, ListStaticRoutesResponse> genForListStaticRoutes() {
        // basic
        HttpRequestDef.Builder<ListStaticRoutesRequest, ListStaticRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStaticRoutesRequest.class, ListStaticRoutesResponse.class)
                .withName("ListStaticRoutes")
                .withUri("/v3/{project_id}/enterprise-router/route-tables/{route_table_id}/static-routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getRouteTableId, ListStaticRoutesRequest::setRouteTableId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getLimit, ListStaticRoutesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getMarker, ListStaticRoutesRequest::setMarker));
        builder.<List<String>>withRequestField("destination",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getDestination, ListStaticRoutesRequest::setDestination));
        builder.<List<String>>withRequestField("attachment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getAttachmentId, ListStaticRoutesRequest::setAttachmentId));
        builder.<List<ListStaticRoutesRequest.ResourceTypeEnum>>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getResourceType, ListStaticRoutesRequest::setResourceType));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getSortKey, ListStaticRoutesRequest::setSortKey));
        builder.<List<ListStaticRoutesRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getSortDir, ListStaticRoutesRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStaticRouteRequest, ShowStaticRouteResponse> showStaticRoute =
        genForShowStaticRoute();

    private static HttpRequestDef<ShowStaticRouteRequest, ShowStaticRouteResponse> genForShowStaticRoute() {
        // basic
        HttpRequestDef.Builder<ShowStaticRouteRequest, ShowStaticRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStaticRouteRequest.class, ShowStaticRouteResponse.class)
                .withName("ShowStaticRoute")
                .withUri("/v3/{project_id}/enterprise-router/route-tables/{route_table_id}/static-routes/{route_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStaticRouteRequest::getRouteTableId, ShowStaticRouteRequest::setRouteTableId));
        builder.<String>withRequestField("route_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStaticRouteRequest::getRouteId, ShowStaticRouteRequest::setRouteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStaticRouteRequest, UpdateStaticRouteResponse> updateStaticRoute =
        genForUpdateStaticRoute();

    private static HttpRequestDef<UpdateStaticRouteRequest, UpdateStaticRouteResponse> genForUpdateStaticRoute() {
        // basic
        HttpRequestDef.Builder<UpdateStaticRouteRequest, UpdateStaticRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStaticRouteRequest.class, UpdateStaticRouteResponse.class)
                .withName("UpdateStaticRoute")
                .withUri("/v3/{project_id}/enterprise-router/route-tables/{route_table_id}/static-routes/{route_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStaticRouteRequest::getRouteTableId,
                UpdateStaticRouteRequest::setRouteTableId));
        builder.<String>withRequestField("route_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStaticRouteRequest::getRouteId, UpdateStaticRouteRequest::setRouteId));
        builder.<UpdateRouteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRouteRequestBody.class),
            f -> f.withMarshaller(UpdateStaticRouteRequest::getBody, UpdateStaticRouteRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTable =
        genForCreateRouteTable();

    private static HttpRequestDef<CreateRouteTableRequest, CreateRouteTableResponse> genForCreateRouteTable() {
        // basic
        HttpRequestDef.Builder<CreateRouteTableRequest, CreateRouteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRouteTableRequest.class, CreateRouteTableResponse.class)
                .withName("CreateRouteTable")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/route-tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRouteTableRequest::getErId, CreateRouteTableRequest::setErId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRouteTableRequest::getXClientToken, CreateRouteTableRequest::setXClientToken));
        builder.<CreateRouteTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRouteTableRequestBody.class),
            f -> f.withMarshaller(CreateRouteTableRequest::getBody, CreateRouteTableRequest::setBody));

        // response

        builder.<String>withResponseField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRouteTableResponse::getXClientToken,
                CreateRouteTableResponse::setXClientToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteRouteTableRequest, DeleteRouteTableResponse> deleteRouteTable =
        genForDeleteRouteTable();

    private static HttpRequestDef<DeleteRouteTableRequest, DeleteRouteTableResponse> genForDeleteRouteTable() {
        // basic
        HttpRequestDef.Builder<DeleteRouteTableRequest, DeleteRouteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRouteTableRequest.class, DeleteRouteTableResponse.class)
                .withName("DeleteRouteTable")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/route-tables/{route_table_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRouteTableRequest::getErId, DeleteRouteTableRequest::setErId));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRouteTableRequest::getRouteTableId, DeleteRouteTableRequest::setRouteTableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTables =
        genForListRouteTables();

    private static HttpRequestDef<ListRouteTablesRequest, ListRouteTablesResponse> genForListRouteTables() {
        // basic
        HttpRequestDef.Builder<ListRouteTablesRequest, ListRouteTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRouteTablesRequest.class, ListRouteTablesResponse.class)
                .withName("ListRouteTables")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/route-tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getErId, ListRouteTablesRequest::setErId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getLimit, ListRouteTablesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getMarker, ListRouteTablesRequest::setMarker));
        builder.<List<ListRouteTablesRequest.StateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getState, ListRouteTablesRequest::setState));
        builder.<Boolean>withRequestField("is_default_propagation_table",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getIsDefaultPropagationTable,
                ListRouteTablesRequest::setIsDefaultPropagationTable));
        builder.<Boolean>withRequestField("is_default_association_table",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getIsDefaultAssociationTable,
                ListRouteTablesRequest::setIsDefaultAssociationTable));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getSortKey, ListRouteTablesRequest::setSortKey));
        builder.<List<ListRouteTablesRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getSortDir, ListRouteTablesRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTable =
        genForShowRouteTable();

    private static HttpRequestDef<ShowRouteTableRequest, ShowRouteTableResponse> genForShowRouteTable() {
        // basic
        HttpRequestDef.Builder<ShowRouteTableRequest, ShowRouteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRouteTableRequest.class, ShowRouteTableResponse.class)
                .withName("ShowRouteTable")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/route-tables/{route_table_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRouteTableRequest::getErId, ShowRouteTableRequest::setErId));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRouteTableRequest::getRouteTableId, ShowRouteTableRequest::setRouteTableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTable =
        genForUpdateRouteTable();

    private static HttpRequestDef<UpdateRouteTableRequest, UpdateRouteTableResponse> genForUpdateRouteTable() {
        // basic
        HttpRequestDef.Builder<UpdateRouteTableRequest, UpdateRouteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRouteTableRequest.class, UpdateRouteTableResponse.class)
                .withName("UpdateRouteTable")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/route-tables/{route_table_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRouteTableRequest::getErId, UpdateRouteTableRequest::setErId));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRouteTableRequest::getRouteTableId, UpdateRouteTableRequest::setRouteTableId));
        builder.<UpdateRouteTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateRouteTableRequestBody.class),
            f -> f.withMarshaller(UpdateRouteTableRequest::getBody, UpdateRouteTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTags =
        genForBatchCreateResourceTags();

    private static HttpRequestDef<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> genForBatchCreateResourceTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateResourceTagsRequest.class, BatchCreateResourceTagsResponse.class)
            .withName("BatchCreateResourceTags")
            .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceId,
                BatchCreateResourceTagsRequest::setResourceId));
        builder.<BatchCreateResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceType,
                BatchCreateResourceTagsRequest::setResourceType));
        builder.<BatchOperateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getBody, BatchCreateResourceTagsRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchCreateResourceTagsResponse::getBody, BatchCreateResourceTagsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTag =
        genForCreateResourceTag();

    private static HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> genForCreateResourceTag() {
        // basic
        HttpRequestDef.Builder<CreateResourceTagRequest, CreateResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceTagRequest.class, CreateResourceTagResponse.class)
                .withName("CreateResourceTag")
                .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceId, CreateResourceTagRequest::setResourceId));
        builder.<CreateResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceType,
                CreateResourceTagRequest::setResourceType));
        builder.<CreateResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getBody, CreateResourceTagRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateResourceTagResponse::getBody, CreateResourceTagResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTag =
        genForDeleteResourceTag();

    private static HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> genForDeleteResourceTag() {
        // basic
        HttpRequestDef.Builder<DeleteResourceTagRequest, DeleteResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResourceTagRequest.class, DeleteResourceTagResponse.class)
                .withName("DeleteResourceTag")
                .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getKey, DeleteResourceTagRequest::setKey));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceId, DeleteResourceTagRequest::setResourceId));
        builder.<DeleteResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceType,
                DeleteResourceTagRequest::setResourceType));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteResourceTagResponse::getBody, DeleteResourceTagResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForListProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForListProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v3/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListProjectTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListProjectTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getResourceType, ListProjectTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTag =
        genForShowResourceTag();

    private static HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> genForShowResourceTag() {
        // basic
        HttpRequestDef.Builder<ShowResourceTagRequest, ShowResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceTagRequest.class, ShowResourceTagResponse.class)
                .withName("ShowResourceTag")
                .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceId, ShowResourceTagRequest::setResourceId));
        builder.<ShowResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceType, ShowResourceTagRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse> createVpcAttachment =
        genForCreateVpcAttachment();

    private static HttpRequestDef<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse> genForCreateVpcAttachment() {
        // basic
        HttpRequestDef.Builder<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcAttachmentRequest.class, CreateVpcAttachmentResponse.class)
                .withName("CreateVpcAttachment")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/vpc-attachments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpcAttachmentRequest::getErId, CreateVpcAttachmentRequest::setErId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpcAttachmentRequest::getXClientToken,
                CreateVpcAttachmentRequest::setXClientToken));
        builder.<CreateVpcAttachmentBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpcAttachmentBody.class),
            f -> f.withMarshaller(CreateVpcAttachmentRequest::getBody, CreateVpcAttachmentRequest::setBody));

        // response

        builder.<String>withResponseField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVpcAttachmentResponse::getXClientToken,
                CreateVpcAttachmentResponse::setXClientToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse> deleteVpcAttachment =
        genForDeleteVpcAttachment();

    private static HttpRequestDef<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse> genForDeleteVpcAttachment() {
        // basic
        HttpRequestDef.Builder<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteVpcAttachmentRequest.class, DeleteVpcAttachmentResponse.class)
            .withName("DeleteVpcAttachment")
            .withUri("/v3/{project_id}/enterprise-router/{er_id}/vpc-attachments/{vpc_attachment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcAttachmentRequest::getErId, DeleteVpcAttachmentRequest::setErId));
        builder.<String>withRequestField("vpc_attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcAttachmentRequest::getVpcAttachmentId,
                DeleteVpcAttachmentRequest::setVpcAttachmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse> listVpcAttachments =
        genForListVpcAttachments();

    private static HttpRequestDef<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse> genForListVpcAttachments() {
        // basic
        HttpRequestDef.Builder<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcAttachmentsRequest.class, ListVpcAttachmentsResponse.class)
                .withName("ListVpcAttachments")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/vpc-attachments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getErId, ListVpcAttachmentsRequest::setErId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getLimit, ListVpcAttachmentsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getMarker, ListVpcAttachmentsRequest::setMarker));
        builder.<List<ListVpcAttachmentsRequest.StateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getState, ListVpcAttachmentsRequest::setState));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getId, ListVpcAttachmentsRequest::setId));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getSortKey, ListVpcAttachmentsRequest::setSortKey));
        builder.<List<ListVpcAttachmentsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getSortDir, ListVpcAttachmentsRequest::setSortDir));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getVpcId, ListVpcAttachmentsRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse> showVpcAttachment =
        genForShowVpcAttachment();

    private static HttpRequestDef<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse> genForShowVpcAttachment() {
        // basic
        HttpRequestDef.Builder<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpcAttachmentRequest.class, ShowVpcAttachmentResponse.class)
                .withName("ShowVpcAttachment")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/vpc-attachments/{vpc_attachment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpcAttachmentRequest::getErId, ShowVpcAttachmentRequest::setErId));
        builder.<String>withRequestField("vpc_attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpcAttachmentRequest::getVpcAttachmentId,
                ShowVpcAttachmentRequest::setVpcAttachmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse> updateVpcAttachment =
        genForUpdateVpcAttachment();

    private static HttpRequestDef<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse> genForUpdateVpcAttachment() {
        // basic
        HttpRequestDef.Builder<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpcAttachmentRequest.class, UpdateVpcAttachmentResponse.class)
                .withName("UpdateVpcAttachment")
                .withUri("/v3/{project_id}/enterprise-router/{er_id}/vpc-attachments/{vpc_attachment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("er_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcAttachmentRequest::getErId, UpdateVpcAttachmentRequest::setErId));
        builder.<String>withRequestField("vpc_attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcAttachmentRequest::getVpcAttachmentId,
                UpdateVpcAttachmentRequest::setVpcAttachmentId));
        builder.<UpdateVpcAttachmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpcAttachmentRequestBody.class),
            f -> f.withMarshaller(UpdateVpcAttachmentRequest::getBody, UpdateVpcAttachmentRequest::setBody));

        // response

        return builder.build();
    }

}
