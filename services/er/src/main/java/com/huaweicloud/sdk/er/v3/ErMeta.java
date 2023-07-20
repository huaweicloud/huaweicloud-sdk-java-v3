package com.huaweicloud.sdk.er.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
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
        genForassociateRouteTable();

    private static HttpRequestDef<AssociateRouteTableRequest, AssociateRouteTableResponse> genForassociateRouteTable() {
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
            f -> f.withMarshaller(AssociateRouteTableRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRouteTableRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRouteTableRequest::getXClientToken, (req, v) -> {
                req.setXClientToken(v);
            }));
        builder.<AssociationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociationRequestBody.class),
            f -> f.withMarshaller(AssociateRouteTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genFordisassociateRouteTable();

    private static HttpRequestDef<DisassociateRouteTableRequest, DisassociateRouteTableResponse> genFordisassociateRouteTable() {
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
            f -> f.withMarshaller(DisassociateRouteTableRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateRouteTableRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<AssociationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociationRequestBody.class),
            f -> f.withMarshaller(DisassociateRouteTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssociationsRequest, ListAssociationsResponse> listAssociations =
        genForlistAssociations();

    private static HttpRequestDef<ListAssociationsRequest, ListAssociationsResponse> genForlistAssociations() {
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
            f -> f.withMarshaller(ListAssociationsRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociationsRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociationsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("attachment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssociationsRequest::getAttachmentId, (req, v) -> {
                req.setAttachmentId(v);
            }));
        builder.<List<ListAssociationsRequest.ResourceTypeEnum>>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssociationsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<List<ListAssociationsRequest.StateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssociationsRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssociationsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<ListAssociationsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssociationsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttachmentsRequest, ListAttachmentsResponse> listAttachments =
        genForlistAttachments();

    private static HttpRequestDef<ListAttachmentsRequest, ListAttachmentsResponse> genForlistAttachments() {
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
            f -> f.withMarshaller(ListAttachmentsRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<ListAttachmentsRequest.StateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<List<ListAttachmentsRequest.ResourceTypeEnum>>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<List<String>>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<ListAttachmentsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAttachmentRequest, ShowAttachmentResponse> showAttachment =
        genForshowAttachment();

    private static HttpRequestDef<ShowAttachmentRequest, ShowAttachmentResponse> genForshowAttachment() {
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
            f -> f.withMarshaller(ShowAttachmentRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAttachmentRequest::getAttachmentId, (req, v) -> {
                req.setAttachmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAttachmentRequest, UpdateAttachmentResponse> updateAttachment =
        genForupdateAttachment();

    private static HttpRequestDef<UpdateAttachmentRequest, UpdateAttachmentResponse> genForupdateAttachment() {
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
            f -> f.withMarshaller(UpdateAttachmentRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAttachmentRequest::getAttachmentId, (req, v) -> {
                req.setAttachmentId(v);
            }));
        builder.<UpdateAttachmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAttachmentRequestBody.class),
            f -> f.withMarshaller(UpdateAttachmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> listAvailabilityZone =
        genForlistAvailabilityZone();

    private static HttpRequestDef<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> genForlistAvailabilityZone() {
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
            f -> f.withMarshaller(ListAvailabilityZoneRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse> changeAvailabilityZone =
        genForchangeAvailabilityZone();

    private static HttpRequestDef<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse> genForchangeAvailabilityZone() {
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
            f -> f.withMarshaller(ChangeAvailabilityZoneRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<EnterpriseRouterAZ>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnterpriseRouterAZ.class),
            f -> f.withMarshaller(ChangeAvailabilityZoneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse> createEnterpriseRouter =
        genForcreateEnterpriseRouter();

    private static HttpRequestDef<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse> genForcreateEnterpriseRouter() {
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
            f -> f.withMarshaller(CreateEnterpriseRouterRequest::getXClientToken, (req, v) -> {
                req.setXClientToken(v);
            }));
        builder.<CreateEnterpriseRouterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEnterpriseRouterRequestBody.class),
            f -> f.withMarshaller(CreateEnterpriseRouterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genFordeleteEnterpriseRouter();

    private static HttpRequestDef<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse> genFordeleteEnterpriseRouter() {
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
            f -> f.withMarshaller(DeleteEnterpriseRouterRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse> listEnterpriseRouters =
        genForlistEnterpriseRouters();

    private static HttpRequestDef<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse> genForlistEnterpriseRouters() {
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
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<ListEnterpriseRoutersRequest.StateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<Boolean>withRequestField("owned_by_self",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getOwnedBySelf, (req, v) -> {
                req.setOwnedBySelf(v);
            }));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<ListEnterpriseRoutersRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEnterpriseRoutersRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse> showEnterpriseRouter =
        genForshowEnterpriseRouter();

    private static HttpRequestDef<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse> genForshowEnterpriseRouter() {
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
            f -> f.withMarshaller(ShowEnterpriseRouterRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse> updateEnterpriseRouter =
        genForupdateEnterpriseRouter();

    private static HttpRequestDef<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse> genForupdateEnterpriseRouter() {
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
            f -> f.withMarshaller(UpdateEnterpriseRouterRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<UpdateEnterpriseRouterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEnterpriseRouterRequestBody.class),
            f -> f.withMarshaller(UpdateEnterpriseRouterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlowLogRequest, CreateFlowLogResponse> createFlowLog =
        genForcreateFlowLog();

    private static HttpRequestDef<CreateFlowLogRequest, CreateFlowLogResponse> genForcreateFlowLog() {
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
            f -> f.withMarshaller(CreateFlowLogRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFlowLogRequest::getXClientToken, (req, v) -> {
                req.setXClientToken(v);
            }));
        builder.<CreateFlowLogRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFlowLogRequestBody.class),
            f -> f.withMarshaller(CreateFlowLogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateFlowLogResponse::getXClientToken, CreateFlowLogResponse::setXClientToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlowLogRequest, DeleteFlowLogResponse> deleteFlowLog =
        genFordeleteFlowLog();

    private static HttpRequestDef<DeleteFlowLogRequest, DeleteFlowLogResponse> genFordeleteFlowLog() {
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
            f -> f.withMarshaller(DeleteFlowLogRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("flow_log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlowLogRequest::getFlowLogId, (req, v) -> {
                req.setFlowLogId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableFlowLogRequest, DisableFlowLogResponse> disableFlowLog =
        genFordisableFlowLog();

    private static HttpRequestDef<DisableFlowLogRequest, DisableFlowLogResponse> genFordisableFlowLog() {
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
            f -> f.withMarshaller(DisableFlowLogRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("flow_log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableFlowLogRequest::getFlowLogId, (req, v) -> {
                req.setFlowLogId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableFlowLogRequest, EnableFlowLogResponse> enableFlowLog =
        genForenableFlowLog();

    private static HttpRequestDef<EnableFlowLogRequest, EnableFlowLogResponse> genForenableFlowLog() {
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
            f -> f.withMarshaller(EnableFlowLogRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("flow_log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableFlowLogRequest::getFlowLogId, (req, v) -> {
                req.setFlowLogId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogs = genForlistFlowLogs();

    private static HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> genForlistFlowLogs() {
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
            f -> f.withMarshaller(ListFlowLogsRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<ListFlowLogsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<List<String>>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<ListFlowLogsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlowLogRequest, ShowFlowLogResponse> showFlowLog = genForshowFlowLog();

    private static HttpRequestDef<ShowFlowLogRequest, ShowFlowLogResponse> genForshowFlowLog() {
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
            f -> f.withMarshaller(ShowFlowLogRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("flow_log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlowLogRequest::getFlowLogId, (req, v) -> {
                req.setFlowLogId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlowLogRequest, UpdateFlowLogResponse> updateFlowLog =
        genForupdateFlowLog();

    private static HttpRequestDef<UpdateFlowLogRequest, UpdateFlowLogResponse> genForupdateFlowLog() {
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
            f -> f.withMarshaller(UpdateFlowLogRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("flow_log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlowLogRequest::getFlowLogId, (req, v) -> {
                req.setFlowLogId(v);
            }));
        builder.<UpdateFlowLogRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlowLogRequestBody.class),
            f -> f.withMarshaller(UpdateFlowLogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisablePropagationRequest, DisablePropagationResponse> disablePropagation =
        genFordisablePropagation();

    private static HttpRequestDef<DisablePropagationRequest, DisablePropagationResponse> genFordisablePropagation() {
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
            f -> f.withMarshaller(DisablePropagationRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisablePropagationRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<PropagationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PropagationRequestBody.class),
            f -> f.withMarshaller(DisablePropagationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnablePropagationRequest, EnablePropagationResponse> enablePropagation =
        genForenablePropagation();

    private static HttpRequestDef<EnablePropagationRequest, EnablePropagationResponse> genForenablePropagation() {
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
            f -> f.withMarshaller(EnablePropagationRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnablePropagationRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnablePropagationRequest::getXClientToken, (req, v) -> {
                req.setXClientToken(v);
            }));
        builder.<PropagationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PropagationRequestBody.class),
            f -> f.withMarshaller(EnablePropagationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForlistPropagations();

    private static HttpRequestDef<ListPropagationsRequest, ListPropagationsResponse> genForlistPropagations() {
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
            f -> f.withMarshaller(ListPropagationsRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropagationsRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPropagationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropagationsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("attachment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPropagationsRequest::getAttachmentId, (req, v) -> {
                req.setAttachmentId(v);
            }));
        builder.<List<ListPropagationsRequest.ResourceTypeEnum>>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPropagationsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<List<ListPropagationsRequest.StateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPropagationsRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPropagationsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<ListPropagationsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPropagationsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForshowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForshowQuotas() {
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
            f -> f.withMarshaller(ShowQuotasRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<String>>withRequestField("erId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowQuotasRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<List<String>>withRequestField("routeTableId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowQuotasRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<List<String>>withRequestField("vpcId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowQuotasRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStaticRouteRequest, CreateStaticRouteResponse> createStaticRoute =
        genForcreateStaticRoute();

    private static HttpRequestDef<CreateStaticRouteRequest, CreateStaticRouteResponse> genForcreateStaticRoute() {
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
            f -> f.withMarshaller(CreateStaticRouteRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStaticRouteRequest::getXClientToken, (req, v) -> {
                req.setXClientToken(v);
            }));
        builder.<CreateRouteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRouteRequestBody.class),
            f -> f.withMarshaller(CreateStaticRouteRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genFordeleteStaticRoute();

    private static HttpRequestDef<DeleteStaticRouteRequest, DeleteStaticRouteResponse> genFordeleteStaticRoute() {
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
            f -> f.withMarshaller(DeleteStaticRouteRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<String>withRequestField("route_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStaticRouteRequest::getRouteId, (req, v) -> {
                req.setRouteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse> listEffectiveRoutes =
        genForlistEffectiveRoutes();

    private static HttpRequestDef<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse> genForlistEffectiveRoutes() {
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
            f -> f.withMarshaller(ListEffectiveRoutesRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEffectiveRoutesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEffectiveRoutesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("destination",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEffectiveRoutesRequest::getDestination, (req, v) -> {
                req.setDestination(v);
            }));
        builder.<List<ListEffectiveRoutesRequest.ResourceTypeEnum>>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEffectiveRoutesRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStaticRoutesRequest, ListStaticRoutesResponse> listStaticRoutes =
        genForlistStaticRoutes();

    private static HttpRequestDef<ListStaticRoutesRequest, ListStaticRoutesResponse> genForlistStaticRoutes() {
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
            f -> f.withMarshaller(ListStaticRoutesRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("destination",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getDestination, (req, v) -> {
                req.setDestination(v);
            }));
        builder.<List<String>>withRequestField("attachment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getAttachmentId, (req, v) -> {
                req.setAttachmentId(v);
            }));
        builder.<List<ListStaticRoutesRequest.ResourceTypeEnum>>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<ListStaticRoutesRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStaticRoutesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStaticRouteRequest, ShowStaticRouteResponse> showStaticRoute =
        genForshowStaticRoute();

    private static HttpRequestDef<ShowStaticRouteRequest, ShowStaticRouteResponse> genForshowStaticRoute() {
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
            f -> f.withMarshaller(ShowStaticRouteRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<String>withRequestField("route_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStaticRouteRequest::getRouteId, (req, v) -> {
                req.setRouteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStaticRouteRequest, UpdateStaticRouteResponse> updateStaticRoute =
        genForupdateStaticRoute();

    private static HttpRequestDef<UpdateStaticRouteRequest, UpdateStaticRouteResponse> genForupdateStaticRoute() {
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
            f -> f.withMarshaller(UpdateStaticRouteRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<String>withRequestField("route_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStaticRouteRequest::getRouteId, (req, v) -> {
                req.setRouteId(v);
            }));
        builder.<UpdateRouteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRouteRequestBody.class),
            f -> f.withMarshaller(UpdateStaticRouteRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTable =
        genForcreateRouteTable();

    private static HttpRequestDef<CreateRouteTableRequest, CreateRouteTableResponse> genForcreateRouteTable() {
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
            f -> f.withMarshaller(CreateRouteTableRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRouteTableRequest::getXClientToken, (req, v) -> {
                req.setXClientToken(v);
            }));
        builder.<CreateRouteTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRouteTableRequestBody.class),
            f -> f.withMarshaller(CreateRouteTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genFordeleteRouteTable();

    private static HttpRequestDef<DeleteRouteTableRequest, DeleteRouteTableResponse> genFordeleteRouteTable() {
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
            f -> f.withMarshaller(DeleteRouteTableRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRouteTableRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTables =
        genForlistRouteTables();

    private static HttpRequestDef<ListRouteTablesRequest, ListRouteTablesResponse> genForlistRouteTables() {
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
            f -> f.withMarshaller(ListRouteTablesRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<ListRouteTablesRequest.StateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<Boolean>withRequestField("is_default_propagation_table",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getIsDefaultPropagationTable, (req, v) -> {
                req.setIsDefaultPropagationTable(v);
            }));
        builder.<Boolean>withRequestField("is_default_association_table",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getIsDefaultAssociationTable, (req, v) -> {
                req.setIsDefaultAssociationTable(v);
            }));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<ListRouteTablesRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTable =
        genForshowRouteTable();

    private static HttpRequestDef<ShowRouteTableRequest, ShowRouteTableResponse> genForshowRouteTable() {
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
            f -> f.withMarshaller(ShowRouteTableRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRouteTableRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTable =
        genForupdateRouteTable();

    private static HttpRequestDef<UpdateRouteTableRequest, UpdateRouteTableResponse> genForupdateRouteTable() {
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
            f -> f.withMarshaller(UpdateRouteTableRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("route_table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRouteTableRequest::getRouteTableId, (req, v) -> {
                req.setRouteTableId(v);
            }));
        builder.<UpdateRouteTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateRouteTableRequestBody.class),
            f -> f.withMarshaller(UpdateRouteTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTags =
        genForbatchCreateResourceTags();

    private static HttpRequestDef<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> genForbatchCreateResourceTags() {
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
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<BatchCreateResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<BatchOperateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchCreateResourceTagsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTag =
        genForcreateResourceTag();

    private static HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> genForcreateResourceTag() {
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
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<CreateResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<CreateResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateResourceTagResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTag =
        genFordeleteResourceTag();

    private static HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> genFordeleteResourceTag() {
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
            f -> f.withMarshaller(DeleteResourceTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<DeleteResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteResourceTagResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForlistProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForlistProjectTags() {
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
            f -> f.withMarshaller(ListProjectTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTag =
        genForshowResourceTag();

    private static HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> genForshowResourceTag() {
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
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<ShowResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse> createVpcAttachment =
        genForcreateVpcAttachment();

    private static HttpRequestDef<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse> genForcreateVpcAttachment() {
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
            f -> f.withMarshaller(CreateVpcAttachmentRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpcAttachmentRequest::getXClientToken, (req, v) -> {
                req.setXClientToken(v);
            }));
        builder.<CreateVpcAttachmentBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpcAttachmentBody.class),
            f -> f.withMarshaller(CreateVpcAttachmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genFordeleteVpcAttachment();

    private static HttpRequestDef<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse> genFordeleteVpcAttachment() {
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
            f -> f.withMarshaller(DeleteVpcAttachmentRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("vpc_attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcAttachmentRequest::getVpcAttachmentId, (req, v) -> {
                req.setVpcAttachmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse> listVpcAttachments =
        genForlistVpcAttachments();

    private static HttpRequestDef<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse> genForlistVpcAttachments() {
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
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<ListVpcAttachmentsRequest.StateEnum>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<ListVpcAttachmentsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcAttachmentsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse> showVpcAttachment =
        genForshowVpcAttachment();

    private static HttpRequestDef<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse> genForshowVpcAttachment() {
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
            f -> f.withMarshaller(ShowVpcAttachmentRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("vpc_attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpcAttachmentRequest::getVpcAttachmentId, (req, v) -> {
                req.setVpcAttachmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse> updateVpcAttachment =
        genForupdateVpcAttachment();

    private static HttpRequestDef<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse> genForupdateVpcAttachment() {
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
            f -> f.withMarshaller(UpdateVpcAttachmentRequest::getErId, (req, v) -> {
                req.setErId(v);
            }));
        builder.<String>withRequestField("vpc_attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcAttachmentRequest::getVpcAttachmentId, (req, v) -> {
                req.setVpcAttachmentId(v);
            }));
        builder.<UpdateVpcAttachmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpcAttachmentRequestBody.class),
            f -> f.withMarshaller(UpdateVpcAttachmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
