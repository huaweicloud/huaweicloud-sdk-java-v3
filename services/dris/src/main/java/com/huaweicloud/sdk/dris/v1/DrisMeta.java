package com.huaweicloud.sdk.dris.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dris.v1.model.AddForwardingConfigRequestDTO;
import com.huaweicloud.sdk.dris.v1.model.AddForwardingConfigsRequest;
import com.huaweicloud.sdk.dris.v1.model.AddForwardingConfigsResponse;
import com.huaweicloud.sdk.dris.v1.model.AddRsuDTO;
import com.huaweicloud.sdk.dris.v1.model.AddRsuModel;
import com.huaweicloud.sdk.dris.v1.model.AddTrafficControllerDTO;
import com.huaweicloud.sdk.dris.v1.model.AddTrafficEventDTO;
import com.huaweicloud.sdk.dris.v1.model.AddV2XEdgeAppDTO;
import com.huaweicloud.sdk.dris.v1.model.AddV2XEdgeDTO;
import com.huaweicloud.sdk.dris.v1.model.AddV2XEdgeDataChannelDTO;
import com.huaweicloud.sdk.dris.v1.model.AddVehicleDTO;
import com.huaweicloud.sdk.dris.v1.model.BatchShowEdgeAppVersionsRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowEdgeAppVersionsResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowEdgeAppsRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowEdgeAppsResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowIpcsRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowIpcsResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowRadarsRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowRadarsResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowRsusRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowRsusResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowTrafficControllersRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowTrafficControllersResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowTrafficEventsRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowTrafficEventsResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowVehiclesRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowVehiclesResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateDataChannelRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateDataChannelResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateEdgeAppRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateEdgeAppResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateEdgeApplicationRequestDTO;
import com.huaweicloud.sdk.dris.v1.model.CreateEdgeApplicationVersionDTO;
import com.huaweicloud.sdk.dris.v1.model.CreateEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateRsuModelRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateRsuModelResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateRsuRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateRsuResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateTrafficControllerRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateTrafficControllerResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateTrafficEventRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateTrafficEventResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateV2xEdgeAppRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateV2xEdgeAppResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateV2xEdgeRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateV2xEdgeResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateVehicleRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateVehicleResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteDataChannelRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteDataChannelResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteEdgeAppRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteEdgeAppResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteForwardingConfigRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteForwardingConfigResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteRsuModelRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteRsuModelResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteRsuRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteRsuResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteTrafficControllerRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteTrafficControllerResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteTrafficEventRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteTrafficEventResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteV2XEdgeAppByEdgeAppIdRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteV2XEdgeAppByEdgeAppIdResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteV2XEdgeByV2xEdgeIdRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteV2XEdgeByV2xEdgeIdResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteVehicleRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteVehicleResponse;
import com.huaweicloud.sdk.dris.v1.model.ListEdgeFlowsRequest;
import com.huaweicloud.sdk.dris.v1.model.ListEdgeFlowsResponse;
import com.huaweicloud.sdk.dris.v1.model.ListRsuModelsRequest;
import com.huaweicloud.sdk.dris.v1.model.ListRsuModelsResponse;
import com.huaweicloud.sdk.dris.v1.model.ListV2xEdgeAppRequest;
import com.huaweicloud.sdk.dris.v1.model.ListV2xEdgeAppResponse;
import com.huaweicloud.sdk.dris.v1.model.ListV2xEdgesRequest;
import com.huaweicloud.sdk.dris.v1.model.ListV2xEdgesResponse;
import com.huaweicloud.sdk.dris.v1.model.ModifyRsuRequestDTO;
import com.huaweicloud.sdk.dris.v1.model.ModifyTrafficControllerRequestDTO;
import com.huaweicloud.sdk.dris.v1.model.ModifyV2XEdgeAppDTO;
import com.huaweicloud.sdk.dris.v1.model.ModifyV2XEdgeDTO;
import com.huaweicloud.sdk.dris.v1.model.ModifyVehicleRequestDTO;
import com.huaweicloud.sdk.dris.v1.model.SendImmediateEventRequest;
import com.huaweicloud.sdk.dris.v1.model.SendImmediateEventResponse;
import com.huaweicloud.sdk.dris.v1.model.SendImmediateEventsDTO;
import com.huaweicloud.sdk.dris.v1.model.ShowDataChannelRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowDataChannelResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowDeploymentCodeRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowDeploymentCodeResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowForwardingConfigRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowForwardingConfigResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowForwardingConfigsRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowForwardingConfigsResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowHistoryTrafficEventsRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowHistoryTrafficEventsResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowIpcRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowIpcResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowRsuModelRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowRsuModelResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowTrafficEventRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowTrafficEventResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowV2XEdgeAppDetailByEdgeAppIdRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowV2XEdgeAppDetailByEdgeAppIdResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowV2xEdgeDetailRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowV2xEdgeDetailResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateDataChannelRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateDataChannelResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeAppRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeAppResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeAppVersionDTO;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeAppVersionStateDTO;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeApplicationRequestDTO;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeApplicationVersionStateRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeApplicationVersionStateResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateForwardingConfigRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateForwardingConfigRequestDTO;
import com.huaweicloud.sdk.dris.v1.model.UpdateForwardingConfigResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateRsuModel;
import com.huaweicloud.sdk.dris.v1.model.UpdateRsuModelRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateRsuModelResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateRsuRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateRsuResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateTrafficControllerRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateTrafficControllerResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateTrafficEventDTO;
import com.huaweicloud.sdk.dris.v1.model.UpdateTrafficEventRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateTrafficEventResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateV2xEdgeAppRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateV2xEdgeAppResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateV2xEdgeRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateV2xEdgeResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateVehicleRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateVehicleResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class DrisMeta {

    public static final HttpRequestDef<CreateDataChannelRequest, CreateDataChannelResponse> createDataChannel =
        genForCreateDataChannel();

    private static HttpRequestDef<CreateDataChannelRequest, CreateDataChannelResponse> genForCreateDataChannel() {
        // basic
        HttpRequestDef.Builder<CreateDataChannelRequest, CreateDataChannelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDataChannelRequest.class, CreateDataChannelResponse.class)
                .withName("CreateDataChannel")
                .withUri("/v1/{project_id}/v2x-edges/{v2x_edge_id}/data-channel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataChannelRequest::getV2xEdgeId, CreateDataChannelRequest::setV2xEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataChannelRequest::getInstanceId, CreateDataChannelRequest::setInstanceId));
        builder.<AddV2XEdgeDataChannelDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddV2XEdgeDataChannelDTO.class),
            f -> f.withMarshaller(CreateDataChannelRequest::getBody, CreateDataChannelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataChannelRequest, DeleteDataChannelResponse> deleteDataChannel =
        genForDeleteDataChannel();

    private static HttpRequestDef<DeleteDataChannelRequest, DeleteDataChannelResponse> genForDeleteDataChannel() {
        // basic
        HttpRequestDef.Builder<DeleteDataChannelRequest, DeleteDataChannelResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDataChannelRequest.class, DeleteDataChannelResponse.class)
                .withName("DeleteDataChannel")
                .withUri("/v1/{project_id}/v2x-edges/{v2x_edge_id}/data-channel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataChannelRequest::getV2xEdgeId, DeleteDataChannelRequest::setV2xEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataChannelRequest::getInstanceId, DeleteDataChannelRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDataChannelResponse::getBody, DeleteDataChannelResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataChannelRequest, ShowDataChannelResponse> showDataChannel =
        genForShowDataChannel();

    private static HttpRequestDef<ShowDataChannelRequest, ShowDataChannelResponse> genForShowDataChannel() {
        // basic
        HttpRequestDef.Builder<ShowDataChannelRequest, ShowDataChannelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataChannelRequest.class, ShowDataChannelResponse.class)
                .withName("ShowDataChannel")
                .withUri("/v1/{project_id}/v2x-edges/{v2x_edge_id}/data-channel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataChannelRequest::getV2xEdgeId, ShowDataChannelRequest::setV2xEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataChannelRequest::getInstanceId, ShowDataChannelRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataChannelRequest, UpdateDataChannelResponse> updateDataChannel =
        genForUpdateDataChannel();

    private static HttpRequestDef<UpdateDataChannelRequest, UpdateDataChannelResponse> genForUpdateDataChannel() {
        // basic
        HttpRequestDef.Builder<UpdateDataChannelRequest, UpdateDataChannelResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDataChannelRequest.class, UpdateDataChannelResponse.class)
                .withName("UpdateDataChannel")
                .withUri("/v1/{project_id}/v2x-edges/{v2x_edge_id}/data-channel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataChannelRequest::getV2xEdgeId, UpdateDataChannelRequest::setV2xEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataChannelRequest::getInstanceId, UpdateDataChannelRequest::setInstanceId));
        builder.<AddV2XEdgeDataChannelDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddV2XEdgeDataChannelDTO.class),
            f -> f.withMarshaller(UpdateDataChannelRequest::getBody, UpdateDataChannelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateV2xEdgeRequest, CreateV2xEdgeResponse> createV2xEdge =
        genForCreateV2xEdge();

    private static HttpRequestDef<CreateV2xEdgeRequest, CreateV2xEdgeResponse> genForCreateV2xEdge() {
        // basic
        HttpRequestDef.Builder<CreateV2xEdgeRequest, CreateV2xEdgeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateV2xEdgeRequest.class, CreateV2xEdgeResponse.class)
                .withName("CreateV2xEdge")
                .withUri("/v1/{project_id}/v2x-edges")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateV2xEdgeRequest::getInstanceId, CreateV2xEdgeRequest::setInstanceId));
        builder.<AddV2XEdgeDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddV2XEdgeDTO.class),
            f -> f.withMarshaller(CreateV2xEdgeRequest::getBody, CreateV2xEdgeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteV2XEdgeByV2xEdgeIdRequest, DeleteV2XEdgeByV2xEdgeIdResponse> deleteV2XEdgeByV2xEdgeId =
        genForDeleteV2XEdgeByV2xEdgeId();

    private static HttpRequestDef<DeleteV2XEdgeByV2xEdgeIdRequest, DeleteV2XEdgeByV2xEdgeIdResponse> genForDeleteV2XEdgeByV2xEdgeId() {
        // basic
        HttpRequestDef.Builder<DeleteV2XEdgeByV2xEdgeIdRequest, DeleteV2XEdgeByV2xEdgeIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteV2XEdgeByV2xEdgeIdRequest.class,
                    DeleteV2XEdgeByV2xEdgeIdResponse.class)
                .withName("DeleteV2XEdgeByV2xEdgeId")
                .withUri("/v1/{project_id}/v2x-edges/{v2x_edge_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2XEdgeByV2xEdgeIdRequest::getV2xEdgeId,
                DeleteV2XEdgeByV2xEdgeIdRequest::setV2xEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2XEdgeByV2xEdgeIdRequest::getInstanceId,
                DeleteV2XEdgeByV2xEdgeIdRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteV2XEdgeByV2xEdgeIdResponse::getBody,
                DeleteV2XEdgeByV2xEdgeIdResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListV2xEdgesRequest, ListV2xEdgesResponse> listV2xEdges = genForListV2xEdges();

    private static HttpRequestDef<ListV2xEdgesRequest, ListV2xEdgesResponse> genForListV2xEdges() {
        // basic
        HttpRequestDef.Builder<ListV2xEdgesRequest, ListV2xEdgesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListV2xEdgesRequest.class, ListV2xEdgesResponse.class)
                .withName("ListV2xEdges")
                .withUri("/v1/{project_id}/v2x-edges")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2xEdgesRequest::getOffset, ListV2xEdgesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2xEdgesRequest::getLimit, ListV2xEdgesRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2xEdgesRequest::getStatus, ListV2xEdgesRequest::setStatus));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2xEdgesRequest::getInstanceId, ListV2xEdgesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentCodeRequest, ShowDeploymentCodeResponse> showDeploymentCode =
        genForShowDeploymentCode();

    private static HttpRequestDef<ShowDeploymentCodeRequest, ShowDeploymentCodeResponse> genForShowDeploymentCode() {
        // basic
        HttpRequestDef.Builder<ShowDeploymentCodeRequest, ShowDeploymentCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowDeploymentCodeRequest.class, ShowDeploymentCodeResponse.class)
                .withName("ShowDeploymentCode")
                .withUri("/v1/{project_id}/v2x-edges/{v2x_edge_id}/deployment-code")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentCodeRequest::getV2xEdgeId, ShowDeploymentCodeRequest::setV2xEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentCodeRequest::getInstanceId, ShowDeploymentCodeRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowV2xEdgeDetailRequest, ShowV2xEdgeDetailResponse> showV2xEdgeDetail =
        genForShowV2xEdgeDetail();

    private static HttpRequestDef<ShowV2xEdgeDetailRequest, ShowV2xEdgeDetailResponse> genForShowV2xEdgeDetail() {
        // basic
        HttpRequestDef.Builder<ShowV2xEdgeDetailRequest, ShowV2xEdgeDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowV2xEdgeDetailRequest.class, ShowV2xEdgeDetailResponse.class)
                .withName("ShowV2xEdgeDetail")
                .withUri("/v1/{project_id}/v2x-edges/{v2x_edge_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2xEdgeDetailRequest::getV2xEdgeId, ShowV2xEdgeDetailRequest::setV2xEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2xEdgeDetailRequest::getInstanceId, ShowV2xEdgeDetailRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateV2xEdgeRequest, UpdateV2xEdgeResponse> updateV2xEdge =
        genForUpdateV2xEdge();

    private static HttpRequestDef<UpdateV2xEdgeRequest, UpdateV2xEdgeResponse> genForUpdateV2xEdge() {
        // basic
        HttpRequestDef.Builder<UpdateV2xEdgeRequest, UpdateV2xEdgeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateV2xEdgeRequest.class, UpdateV2xEdgeResponse.class)
                .withName("UpdateV2xEdge")
                .withUri("/v1/{project_id}/v2x-edges/{v2x_edge_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2xEdgeRequest::getV2xEdgeId, UpdateV2xEdgeRequest::setV2xEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2xEdgeRequest::getInstanceId, UpdateV2xEdgeRequest::setInstanceId));
        builder.<ModifyV2XEdgeDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyV2XEdgeDTO.class),
            f -> f.withMarshaller(UpdateV2xEdgeRequest::getBody, UpdateV2xEdgeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddForwardingConfigsRequest, AddForwardingConfigsResponse> addForwardingConfigs =
        genForAddForwardingConfigs();

    private static HttpRequestDef<AddForwardingConfigsRequest, AddForwardingConfigsResponse> genForAddForwardingConfigs() {
        // basic
        HttpRequestDef.Builder<AddForwardingConfigsRequest, AddForwardingConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddForwardingConfigsRequest.class, AddForwardingConfigsResponse.class)
            .withName("AddForwardingConfigs")
            .withUri("/v1/{project_id}/forwarding-configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddForwardingConfigsRequest::getInstanceId,
                AddForwardingConfigsRequest::setInstanceId));
        builder.<AddForwardingConfigRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddForwardingConfigRequestDTO.class),
            f -> f.withMarshaller(AddForwardingConfigsRequest::getBody, AddForwardingConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteForwardingConfigRequest, DeleteForwardingConfigResponse> deleteForwardingConfig =
        genForDeleteForwardingConfig();

    private static HttpRequestDef<DeleteForwardingConfigRequest, DeleteForwardingConfigResponse> genForDeleteForwardingConfig() {
        // basic
        HttpRequestDef.Builder<DeleteForwardingConfigRequest, DeleteForwardingConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteForwardingConfigRequest.class, DeleteForwardingConfigResponse.class)
            .withName("DeleteForwardingConfig")
            .withUri("/v1/{project_id}/forwarding-configs/{forwarding_config_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("forwarding_config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteForwardingConfigRequest::getForwardingConfigId,
                DeleteForwardingConfigRequest::setForwardingConfigId));
        builder.<String>withRequestField("forwarding_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteForwardingConfigRequest::getForwardingType,
                DeleteForwardingConfigRequest::setForwardingType));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteForwardingConfigRequest::getInstanceId,
                DeleteForwardingConfigRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteForwardingConfigResponse::getBody, DeleteForwardingConfigResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowForwardingConfigRequest, ShowForwardingConfigResponse> showForwardingConfig =
        genForShowForwardingConfig();

    private static HttpRequestDef<ShowForwardingConfigRequest, ShowForwardingConfigResponse> genForShowForwardingConfig() {
        // basic
        HttpRequestDef.Builder<ShowForwardingConfigRequest, ShowForwardingConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowForwardingConfigRequest.class, ShowForwardingConfigResponse.class)
            .withName("ShowForwardingConfig")
            .withUri("/v1/{project_id}/forwarding-configs/{forwarding_config_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("forwarding_config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowForwardingConfigRequest::getForwardingConfigId,
                ShowForwardingConfigRequest::setForwardingConfigId));
        builder.<String>withRequestField("forwarding_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowForwardingConfigRequest::getForwardingType,
                ShowForwardingConfigRequest::setForwardingType));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowForwardingConfigRequest::getInstanceId,
                ShowForwardingConfigRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowForwardingConfigsRequest, ShowForwardingConfigsResponse> showForwardingConfigs =
        genForShowForwardingConfigs();

    private static HttpRequestDef<ShowForwardingConfigsRequest, ShowForwardingConfigsResponse> genForShowForwardingConfigs() {
        // basic
        HttpRequestDef.Builder<ShowForwardingConfigsRequest, ShowForwardingConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowForwardingConfigsRequest.class, ShowForwardingConfigsResponse.class)
            .withName("ShowForwardingConfigs")
            .withUri("/v1/{project_id}/forwarding-configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("forwarding_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowForwardingConfigsRequest::getForwardingType,
                ShowForwardingConfigsRequest::setForwardingType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowForwardingConfigsRequest::getOffset, ShowForwardingConfigsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowForwardingConfigsRequest::getLimit, ShowForwardingConfigsRequest::setLimit));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowForwardingConfigsRequest::getInstanceId,
                ShowForwardingConfigsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateForwardingConfigRequest, UpdateForwardingConfigResponse> updateForwardingConfig =
        genForUpdateForwardingConfig();

    private static HttpRequestDef<UpdateForwardingConfigRequest, UpdateForwardingConfigResponse> genForUpdateForwardingConfig() {
        // basic
        HttpRequestDef.Builder<UpdateForwardingConfigRequest, UpdateForwardingConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateForwardingConfigRequest.class, UpdateForwardingConfigResponse.class)
            .withName("UpdateForwardingConfig")
            .withUri("/v1/{project_id}/forwarding-configs/{forwarding_config_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("forwarding_config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateForwardingConfigRequest::getForwardingConfigId,
                UpdateForwardingConfigRequest::setForwardingConfigId));
        builder.<String>withRequestField("forwarding_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateForwardingConfigRequest::getForwardingType,
                UpdateForwardingConfigRequest::setForwardingType));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateForwardingConfigRequest::getInstanceId,
                UpdateForwardingConfigRequest::setInstanceId));
        builder.<UpdateForwardingConfigRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateForwardingConfigRequestDTO.class),
            f -> f.withMarshaller(UpdateForwardingConfigRequest::getBody, UpdateForwardingConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeFlowsRequest, ListEdgeFlowsResponse> listEdgeFlows =
        genForListEdgeFlows();

    private static HttpRequestDef<ListEdgeFlowsRequest, ListEdgeFlowsResponse> genForListEdgeFlows() {
        // basic
        HttpRequestDef.Builder<ListEdgeFlowsRequest, ListEdgeFlowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEdgeFlowsRequest.class, ListEdgeFlowsResponse.class)
                .withName("ListEdgeFlows")
                .withUri("/v1/{project_id}/edge-flow")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeFlowsRequest::getOffset, ListEdgeFlowsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeFlowsRequest::getLimit, ListEdgeFlowsRequest::setLimit));
        builder.<String>withRequestField("from_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeFlowsRequest::getFromDate, ListEdgeFlowsRequest::setFromDate));
        builder.<String>withRequestField("to_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeFlowsRequest::getToDate, ListEdgeFlowsRequest::setToDate));
        builder.<String>withRequestField("edge_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeFlowsRequest::getEdgeId, ListEdgeFlowsRequest::setEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeFlowsRequest::getInstanceId, ListEdgeFlowsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryTrafficEventsRequest, ShowHistoryTrafficEventsResponse> showHistoryTrafficEvents =
        genForShowHistoryTrafficEvents();

    private static HttpRequestDef<ShowHistoryTrafficEventsRequest, ShowHistoryTrafficEventsResponse> genForShowHistoryTrafficEvents() {
        // basic
        HttpRequestDef.Builder<ShowHistoryTrafficEventsRequest, ShowHistoryTrafficEventsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowHistoryTrafficEventsRequest.class, ShowHistoryTrafficEventsResponse.class)
                .withName("ShowHistoryTrafficEvents")
                .withUri("/v1/{project_id}/history-traffic-events")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getOffset,
                ShowHistoryTrafficEventsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getLimit,
                ShowHistoryTrafficEventsRequest::setLimit));
        builder.<Long>withRequestField("from_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getFromDate,
                ShowHistoryTrafficEventsRequest::setFromDate));
        builder.<Long>withRequestField("to_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getToDate,
                ShowHistoryTrafficEventsRequest::setToDate));
        builder.<String>withRequestField("event_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getEventId,
                ShowHistoryTrafficEventsRequest::setEventId));
        builder.<String>withRequestField("event_class",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getEventClass,
                ShowHistoryTrafficEventsRequest::setEventClass));
        builder.<String>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getEventType,
                ShowHistoryTrafficEventsRequest::setEventType));
        builder.<String>withRequestField("event_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getEventSource,
                ShowHistoryTrafficEventsRequest::setEventSource));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getInstanceId,
                ShowHistoryTrafficEventsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowIpcsRequest, BatchShowIpcsResponse> batchShowIpcs =
        genForBatchShowIpcs();

    private static HttpRequestDef<BatchShowIpcsRequest, BatchShowIpcsResponse> genForBatchShowIpcs() {
        // basic
        HttpRequestDef.Builder<BatchShowIpcsRequest, BatchShowIpcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchShowIpcsRequest.class, BatchShowIpcsResponse.class)
                .withName("BatchShowIpcs")
                .withUri("/v1/{project_id}/cameras")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowIpcsRequest::getOffset, BatchShowIpcsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowIpcsRequest::getLimit, BatchShowIpcsRequest::setLimit));
        builder.<BatchShowIpcsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchShowIpcsRequest.StatusEnum.class),
            f -> f.withMarshaller(BatchShowIpcsRequest::getStatus, BatchShowIpcsRequest::setStatus));
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowIpcsRequest::getV2xEdgeId, BatchShowIpcsRequest::setV2xEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowIpcsRequest::getInstanceId, BatchShowIpcsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpcRequest, ShowIpcResponse> showIpc = genForShowIpc();

    private static HttpRequestDef<ShowIpcRequest, ShowIpcResponse> genForShowIpc() {
        // basic
        HttpRequestDef.Builder<ShowIpcRequest, ShowIpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIpcRequest.class, ShowIpcResponse.class)
                .withName("ShowIpc")
                .withUri("/v1/{project_id}/cameras/{camera_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("camera_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpcRequest::getCameraId, ShowIpcRequest::setCameraId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpcRequest::getInstanceId, ShowIpcRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowRadarsRequest, BatchShowRadarsResponse> batchShowRadars =
        genForBatchShowRadars();

    private static HttpRequestDef<BatchShowRadarsRequest, BatchShowRadarsResponse> genForBatchShowRadars() {
        // basic
        HttpRequestDef.Builder<BatchShowRadarsRequest, BatchShowRadarsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchShowRadarsRequest.class, BatchShowRadarsResponse.class)
                .withName("BatchShowRadars")
                .withUri("/v1/{project_id}/radars")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("esn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowRadarsRequest::getEsn, BatchShowRadarsRequest::setEsn));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowRadarsRequest::getOffset, BatchShowRadarsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowRadarsRequest::getLimit, BatchShowRadarsRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowRadarsRequest::getStatus, BatchShowRadarsRequest::setStatus));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowRadarsRequest::getInstanceId, BatchShowRadarsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowRsusRequest, BatchShowRsusResponse> batchShowRsus =
        genForBatchShowRsus();

    private static HttpRequestDef<BatchShowRsusRequest, BatchShowRsusResponse> genForBatchShowRsus() {
        // basic
        HttpRequestDef.Builder<BatchShowRsusRequest, BatchShowRsusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchShowRsusRequest.class, BatchShowRsusResponse.class)
                .withName("BatchShowRsus")
                .withUri("/v1/{project_id}/rsus")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowRsusRequest::getOffset, BatchShowRsusRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowRsusRequest::getLimit, BatchShowRsusRequest::setLimit));
        builder.<String>withRequestField("rsu_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowRsusRequest::getRsuId, BatchShowRsusRequest::setRsuId));
        builder.<String>withRequestField("esn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowRsusRequest::getEsn, BatchShowRsusRequest::setEsn));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowRsusRequest::getStatus, BatchShowRsusRequest::setStatus));
        builder.<String>withRequestField("rsu_model_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowRsusRequest::getRsuModelId, BatchShowRsusRequest::setRsuModelId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowRsusRequest::getInstanceId, BatchShowRsusRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRsuRequest, CreateRsuResponse> createRsu = genForCreateRsu();

    private static HttpRequestDef<CreateRsuRequest, CreateRsuResponse> genForCreateRsu() {
        // basic
        HttpRequestDef.Builder<CreateRsuRequest, CreateRsuResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRsuRequest.class, CreateRsuResponse.class)
                .withName("CreateRsu")
                .withUri("/v1/{project_id}/rsus")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRsuRequest::getInstanceId, CreateRsuRequest::setInstanceId));
        builder.<AddRsuDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddRsuDTO.class),
            f -> f.withMarshaller(CreateRsuRequest::getBody, CreateRsuRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRsuRequest, DeleteRsuResponse> deleteRsu = genForDeleteRsu();

    private static HttpRequestDef<DeleteRsuRequest, DeleteRsuResponse> genForDeleteRsu() {
        // basic
        HttpRequestDef.Builder<DeleteRsuRequest, DeleteRsuResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRsuRequest.class, DeleteRsuResponse.class)
                .withName("DeleteRsu")
                .withUri("/v1/{project_id}/rsus/{rsu_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rsu_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRsuRequest::getRsuId, DeleteRsuRequest::setRsuId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRsuRequest::getInstanceId, DeleteRsuRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRsuResponse::getBody, DeleteRsuResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRsuRequest, UpdateRsuResponse> updateRsu = genForUpdateRsu();

    private static HttpRequestDef<UpdateRsuRequest, UpdateRsuResponse> genForUpdateRsu() {
        // basic
        HttpRequestDef.Builder<UpdateRsuRequest, UpdateRsuResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRsuRequest.class, UpdateRsuResponse.class)
                .withName("UpdateRsu")
                .withUri("/v1/{project_id}/rsus/{rsu_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rsu_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRsuRequest::getRsuId, UpdateRsuRequest::setRsuId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRsuRequest::getInstanceId, UpdateRsuRequest::setInstanceId));
        builder.<ModifyRsuRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyRsuRequestDTO.class),
            f -> f.withMarshaller(UpdateRsuRequest::getBody, UpdateRsuRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendImmediateEventRequest, SendImmediateEventResponse> sendImmediateEvent =
        genForSendImmediateEvent();

    private static HttpRequestDef<SendImmediateEventRequest, SendImmediateEventResponse> genForSendImmediateEvent() {
        // basic
        HttpRequestDef.Builder<SendImmediateEventRequest, SendImmediateEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendImmediateEventRequest.class, SendImmediateEventResponse.class)
                .withName("SendImmediateEvent")
                .withUri("/v1/{project_id}/immediate-event")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendImmediateEventRequest::getInstanceId, SendImmediateEventRequest::setInstanceId));
        builder.<SendImmediateEventsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendImmediateEventsDTO.class),
            f -> f.withMarshaller(SendImmediateEventRequest::getBody, SendImmediateEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowTrafficControllersRequest, BatchShowTrafficControllersResponse> batchShowTrafficControllers =
        genForBatchShowTrafficControllers();

    private static HttpRequestDef<BatchShowTrafficControllersRequest, BatchShowTrafficControllersResponse> genForBatchShowTrafficControllers() {
        // basic
        HttpRequestDef.Builder<BatchShowTrafficControllersRequest, BatchShowTrafficControllersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    BatchShowTrafficControllersRequest.class,
                    BatchShowTrafficControllersResponse.class)
                .withName("BatchShowTrafficControllers")
                .withUri("/v1/{project_id}/traffic-controllers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowTrafficControllersRequest::getOffset,
                BatchShowTrafficControllersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowTrafficControllersRequest::getLimit,
                BatchShowTrafficControllersRequest::setLimit));
        builder.<String>withRequestField("traffic_controller_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficControllersRequest::getTrafficControllerId,
                BatchShowTrafficControllersRequest::setTrafficControllerId));
        builder.<String>withRequestField("esn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficControllersRequest::getEsn,
                BatchShowTrafficControllersRequest::setEsn));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficControllersRequest::getStatus,
                BatchShowTrafficControllersRequest::setStatus));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficControllersRequest::getInstanceId,
                BatchShowTrafficControllersRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrafficControllerRequest, CreateTrafficControllerResponse> createTrafficController =
        genForCreateTrafficController();

    private static HttpRequestDef<CreateTrafficControllerRequest, CreateTrafficControllerResponse> genForCreateTrafficController() {
        // basic
        HttpRequestDef.Builder<CreateTrafficControllerRequest, CreateTrafficControllerResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateTrafficControllerRequest.class, CreateTrafficControllerResponse.class)
            .withName("CreateTrafficController")
            .withUri("/v1/{project_id}/traffic-controllers")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrafficControllerRequest::getInstanceId,
                CreateTrafficControllerRequest::setInstanceId));
        builder.<AddTrafficControllerDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddTrafficControllerDTO.class),
            f -> f.withMarshaller(CreateTrafficControllerRequest::getBody, CreateTrafficControllerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrafficControllerRequest, DeleteTrafficControllerResponse> deleteTrafficController =
        genForDeleteTrafficController();

    private static HttpRequestDef<DeleteTrafficControllerRequest, DeleteTrafficControllerResponse> genForDeleteTrafficController() {
        // basic
        HttpRequestDef.Builder<DeleteTrafficControllerRequest, DeleteTrafficControllerResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteTrafficControllerRequest.class, DeleteTrafficControllerResponse.class)
            .withName("DeleteTrafficController")
            .withUri("/v1/{project_id}/traffic-controllers/{traffic_controller_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("traffic_controller_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTrafficControllerRequest::getTrafficControllerId,
                DeleteTrafficControllerRequest::setTrafficControllerId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTrafficControllerRequest::getInstanceId,
                DeleteTrafficControllerRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTrafficControllerResponse::getBody, DeleteTrafficControllerResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrafficControllerRequest, UpdateTrafficControllerResponse> updateTrafficController =
        genForUpdateTrafficController();

    private static HttpRequestDef<UpdateTrafficControllerRequest, UpdateTrafficControllerResponse> genForUpdateTrafficController() {
        // basic
        HttpRequestDef.Builder<UpdateTrafficControllerRequest, UpdateTrafficControllerResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateTrafficControllerRequest.class, UpdateTrafficControllerResponse.class)
            .withName("UpdateTrafficController")
            .withUri("/v1/{project_id}/traffic-controllers/{traffic_controller_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("traffic_controller_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTrafficControllerRequest::getTrafficControllerId,
                UpdateTrafficControllerRequest::setTrafficControllerId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTrafficControllerRequest::getInstanceId,
                UpdateTrafficControllerRequest::setInstanceId));
        builder.<ModifyTrafficControllerRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyTrafficControllerRequestDTO.class),
            f -> f.withMarshaller(UpdateTrafficControllerRequest::getBody, UpdateTrafficControllerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowTrafficEventsRequest, BatchShowTrafficEventsResponse> batchShowTrafficEvents =
        genForBatchShowTrafficEvents();

    private static HttpRequestDef<BatchShowTrafficEventsRequest, BatchShowTrafficEventsResponse> genForBatchShowTrafficEvents() {
        // basic
        HttpRequestDef.Builder<BatchShowTrafficEventsRequest, BatchShowTrafficEventsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, BatchShowTrafficEventsRequest.class, BatchShowTrafficEventsResponse.class)
            .withName("BatchShowTrafficEvents")
            .withUri("/v1/{project_id}/traffic-events")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getOffset, BatchShowTrafficEventsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getLimit, BatchShowTrafficEventsRequest::setLimit));
        builder.<Integer>withRequestField("area_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getAreaCode,
                BatchShowTrafficEventsRequest::setAreaCode));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getStatus, BatchShowTrafficEventsRequest::setStatus));
        builder.<Integer>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getEventType,
                BatchShowTrafficEventsRequest::setEventType));
        builder.<List<String>>withRequestField("event_source_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getEventSourceType,
                BatchShowTrafficEventsRequest::setEventSourceType));
        builder.<String>withRequestField("event_class",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getEventClass,
                BatchShowTrafficEventsRequest::setEventClass));
        builder.<String>withRequestField("event_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getEventId,
                BatchShowTrafficEventsRequest::setEventId));
        builder.<String>withRequestField("from_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getFromTime,
                BatchShowTrafficEventsRequest::setFromTime));
        builder.<String>withRequestField("to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getToTime, BatchShowTrafficEventsRequest::setToTime));
        builder.<BatchShowTrafficEventsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchShowTrafficEventsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getSortKey,
                BatchShowTrafficEventsRequest::setSortKey));
        builder.<BatchShowTrafficEventsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchShowTrafficEventsRequest.SortDirEnum.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getSortDir,
                BatchShowTrafficEventsRequest::setSortDir));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getInstanceId,
                BatchShowTrafficEventsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrafficEventRequest, CreateTrafficEventResponse> createTrafficEvent =
        genForCreateTrafficEvent();

    private static HttpRequestDef<CreateTrafficEventRequest, CreateTrafficEventResponse> genForCreateTrafficEvent() {
        // basic
        HttpRequestDef.Builder<CreateTrafficEventRequest, CreateTrafficEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTrafficEventRequest.class, CreateTrafficEventResponse.class)
                .withName("CreateTrafficEvent")
                .withUri("/v1/{project_id}/traffic-events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrafficEventRequest::getInstanceId, CreateTrafficEventRequest::setInstanceId));
        builder.<AddTrafficEventDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTrafficEventDTO.class),
            f -> f.withMarshaller(CreateTrafficEventRequest::getBody, CreateTrafficEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrafficEventRequest, DeleteTrafficEventResponse> deleteTrafficEvent =
        genForDeleteTrafficEvent();

    private static HttpRequestDef<DeleteTrafficEventRequest, DeleteTrafficEventResponse> genForDeleteTrafficEvent() {
        // basic
        HttpRequestDef.Builder<DeleteTrafficEventRequest, DeleteTrafficEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTrafficEventRequest.class, DeleteTrafficEventResponse.class)
                .withName("DeleteTrafficEvent")
                .withUri("/v1/{project_id}/traffic-events/{event_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTrafficEventRequest::getEventId, DeleteTrafficEventRequest::setEventId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTrafficEventRequest::getInstanceId, DeleteTrafficEventRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTrafficEventResponse::getBody, DeleteTrafficEventResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrafficEventRequest, ShowTrafficEventResponse> showTrafficEvent =
        genForShowTrafficEvent();

    private static HttpRequestDef<ShowTrafficEventRequest, ShowTrafficEventResponse> genForShowTrafficEvent() {
        // basic
        HttpRequestDef.Builder<ShowTrafficEventRequest, ShowTrafficEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTrafficEventRequest.class, ShowTrafficEventResponse.class)
                .withName("ShowTrafficEvent")
                .withUri("/v1/{project_id}/traffic-events/{event_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrafficEventRequest::getEventId, ShowTrafficEventRequest::setEventId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrafficEventRequest::getInstanceId, ShowTrafficEventRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrafficEventRequest, UpdateTrafficEventResponse> updateTrafficEvent =
        genForUpdateTrafficEvent();

    private static HttpRequestDef<UpdateTrafficEventRequest, UpdateTrafficEventResponse> genForUpdateTrafficEvent() {
        // basic
        HttpRequestDef.Builder<UpdateTrafficEventRequest, UpdateTrafficEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTrafficEventRequest.class, UpdateTrafficEventResponse.class)
                .withName("UpdateTrafficEvent")
                .withUri("/v1/{project_id}/traffic-events/{event_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTrafficEventRequest::getEventId, UpdateTrafficEventRequest::setEventId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTrafficEventRequest::getInstanceId, UpdateTrafficEventRequest::setInstanceId));
        builder.<UpdateTrafficEventDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTrafficEventDTO.class),
            f -> f.withMarshaller(UpdateTrafficEventRequest::getBody, UpdateTrafficEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateV2xEdgeAppRequest, CreateV2xEdgeAppResponse> createV2xEdgeApp =
        genForCreateV2xEdgeApp();

    private static HttpRequestDef<CreateV2xEdgeAppRequest, CreateV2xEdgeAppResponse> genForCreateV2xEdgeApp() {
        // basic
        HttpRequestDef.Builder<CreateV2xEdgeAppRequest, CreateV2xEdgeAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateV2xEdgeAppRequest.class, CreateV2xEdgeAppResponse.class)
                .withName("CreateV2xEdgeApp")
                .withUri("/v1/{project_id}/v2x-edges/{v2x_edge_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateV2xEdgeAppRequest::getV2xEdgeId, CreateV2xEdgeAppRequest::setV2xEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateV2xEdgeAppRequest::getInstanceId, CreateV2xEdgeAppRequest::setInstanceId));
        builder.<AddV2XEdgeAppDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddV2XEdgeAppDTO.class),
            f -> f.withMarshaller(CreateV2xEdgeAppRequest::getBody, CreateV2xEdgeAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteV2XEdgeAppByEdgeAppIdRequest, DeleteV2XEdgeAppByEdgeAppIdResponse> deleteV2XEdgeAppByEdgeAppId =
        genForDeleteV2XEdgeAppByEdgeAppId();

    private static HttpRequestDef<DeleteV2XEdgeAppByEdgeAppIdRequest, DeleteV2XEdgeAppByEdgeAppIdResponse> genForDeleteV2XEdgeAppByEdgeAppId() {
        // basic
        HttpRequestDef.Builder<DeleteV2XEdgeAppByEdgeAppIdRequest, DeleteV2XEdgeAppByEdgeAppIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteV2XEdgeAppByEdgeAppIdRequest.class,
                    DeleteV2XEdgeAppByEdgeAppIdResponse.class)
                .withName("DeleteV2XEdgeAppByEdgeAppId")
                .withUri("/v1/{project_id}/v2x-edges/{v2x_edge_id}/apps/{edge_app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2XEdgeAppByEdgeAppIdRequest::getEdgeAppId,
                DeleteV2XEdgeAppByEdgeAppIdRequest::setEdgeAppId));
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2XEdgeAppByEdgeAppIdRequest::getV2xEdgeId,
                DeleteV2XEdgeAppByEdgeAppIdRequest::setV2xEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2XEdgeAppByEdgeAppIdRequest::getInstanceId,
                DeleteV2XEdgeAppByEdgeAppIdRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteV2XEdgeAppByEdgeAppIdResponse::getBody,
                DeleteV2XEdgeAppByEdgeAppIdResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListV2xEdgeAppRequest, ListV2xEdgeAppResponse> listV2xEdgeApp =
        genForListV2xEdgeApp();

    private static HttpRequestDef<ListV2xEdgeAppRequest, ListV2xEdgeAppResponse> genForListV2xEdgeApp() {
        // basic
        HttpRequestDef.Builder<ListV2xEdgeAppRequest, ListV2xEdgeAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListV2xEdgeAppRequest.class, ListV2xEdgeAppResponse.class)
                .withName("ListV2xEdgeApp")
                .withUri("/v1/{project_id}/v2x-edges/{v2x_edge_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2xEdgeAppRequest::getV2xEdgeId, ListV2xEdgeAppRequest::setV2xEdgeId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2xEdgeAppRequest::getOffset, ListV2xEdgeAppRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2xEdgeAppRequest::getLimit, ListV2xEdgeAppRequest::setLimit));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2xEdgeAppRequest::getInstanceId, ListV2xEdgeAppRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowV2XEdgeAppDetailByEdgeAppIdRequest, ShowV2XEdgeAppDetailByEdgeAppIdResponse> showV2XEdgeAppDetailByEdgeAppId =
        genForShowV2XEdgeAppDetailByEdgeAppId();

    private static HttpRequestDef<ShowV2XEdgeAppDetailByEdgeAppIdRequest, ShowV2XEdgeAppDetailByEdgeAppIdResponse> genForShowV2XEdgeAppDetailByEdgeAppId() {
        // basic
        HttpRequestDef.Builder<ShowV2XEdgeAppDetailByEdgeAppIdRequest, ShowV2XEdgeAppDetailByEdgeAppIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowV2XEdgeAppDetailByEdgeAppIdRequest.class,
                    ShowV2XEdgeAppDetailByEdgeAppIdResponse.class)
                .withName("ShowV2XEdgeAppDetailByEdgeAppId")
                .withUri("/v1/{project_id}/v2x-edges/{v2x_edge_id}/apps/{edge_app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2XEdgeAppDetailByEdgeAppIdRequest::getEdgeAppId,
                ShowV2XEdgeAppDetailByEdgeAppIdRequest::setEdgeAppId));
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2XEdgeAppDetailByEdgeAppIdRequest::getV2xEdgeId,
                ShowV2XEdgeAppDetailByEdgeAppIdRequest::setV2xEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2XEdgeAppDetailByEdgeAppIdRequest::getInstanceId,
                ShowV2XEdgeAppDetailByEdgeAppIdRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateV2xEdgeAppRequest, UpdateV2xEdgeAppResponse> updateV2xEdgeApp =
        genForUpdateV2xEdgeApp();

    private static HttpRequestDef<UpdateV2xEdgeAppRequest, UpdateV2xEdgeAppResponse> genForUpdateV2xEdgeApp() {
        // basic
        HttpRequestDef.Builder<UpdateV2xEdgeAppRequest, UpdateV2xEdgeAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateV2xEdgeAppRequest.class, UpdateV2xEdgeAppResponse.class)
                .withName("UpdateV2xEdgeApp")
                .withUri("/v1/{project_id}/v2x-edges/{v2x_edge_id}/apps/{edge_app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2xEdgeAppRequest::getEdgeAppId, UpdateV2xEdgeAppRequest::setEdgeAppId));
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2xEdgeAppRequest::getV2xEdgeId, UpdateV2xEdgeAppRequest::setV2xEdgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2xEdgeAppRequest::getInstanceId, UpdateV2xEdgeAppRequest::setInstanceId));
        builder.<ModifyV2XEdgeAppDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyV2XEdgeAppDTO.class),
            f -> f.withMarshaller(UpdateV2xEdgeAppRequest::getBody, UpdateV2xEdgeAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowVehiclesRequest, BatchShowVehiclesResponse> batchShowVehicles =
        genForBatchShowVehicles();

    private static HttpRequestDef<BatchShowVehiclesRequest, BatchShowVehiclesResponse> genForBatchShowVehicles() {
        // basic
        HttpRequestDef.Builder<BatchShowVehiclesRequest, BatchShowVehiclesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchShowVehiclesRequest.class, BatchShowVehiclesResponse.class)
                .withName("BatchShowVehicles")
                .withUri("/v1/{project_id}/vehicles")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowVehiclesRequest::getOffset, BatchShowVehiclesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowVehiclesRequest::getLimit, BatchShowVehiclesRequest::setLimit));
        builder.<String>withRequestField("vehicle_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowVehiclesRequest::getVehicleId, BatchShowVehiclesRequest::setVehicleId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowVehiclesRequest::getStatus, BatchShowVehiclesRequest::setStatus));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowVehiclesRequest::getInstanceId, BatchShowVehiclesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVehicleRequest, CreateVehicleResponse> createVehicle =
        genForCreateVehicle();

    private static HttpRequestDef<CreateVehicleRequest, CreateVehicleResponse> genForCreateVehicle() {
        // basic
        HttpRequestDef.Builder<CreateVehicleRequest, CreateVehicleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVehicleRequest.class, CreateVehicleResponse.class)
                .withName("CreateVehicle")
                .withUri("/v1/{project_id}/vehicles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVehicleRequest::getInstanceId, CreateVehicleRequest::setInstanceId));
        builder.<AddVehicleDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddVehicleDTO.class),
            f -> f.withMarshaller(CreateVehicleRequest::getBody, CreateVehicleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVehicleRequest, DeleteVehicleResponse> deleteVehicle =
        genForDeleteVehicle();

    private static HttpRequestDef<DeleteVehicleRequest, DeleteVehicleResponse> genForDeleteVehicle() {
        // basic
        HttpRequestDef.Builder<DeleteVehicleRequest, DeleteVehicleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVehicleRequest.class, DeleteVehicleResponse.class)
                .withName("DeleteVehicle")
                .withUri("/v1/{project_id}/vehicles/{vehicle_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vehicle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVehicleRequest::getVehicleId, DeleteVehicleRequest::setVehicleId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVehicleRequest::getInstanceId, DeleteVehicleRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteVehicleResponse::getBody, DeleteVehicleResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVehicleRequest, UpdateVehicleResponse> updateVehicle =
        genForUpdateVehicle();

    private static HttpRequestDef<UpdateVehicleRequest, UpdateVehicleResponse> genForUpdateVehicle() {
        // basic
        HttpRequestDef.Builder<UpdateVehicleRequest, UpdateVehicleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVehicleRequest.class, UpdateVehicleResponse.class)
                .withName("UpdateVehicle")
                .withUri("/v1/{project_id}/vehicles/{vehicle_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vehicle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVehicleRequest::getVehicleId, UpdateVehicleRequest::setVehicleId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVehicleRequest::getInstanceId, UpdateVehicleRequest::setInstanceId));
        builder.<ModifyVehicleRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyVehicleRequestDTO.class),
            f -> f.withMarshaller(UpdateVehicleRequest::getBody, UpdateVehicleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowEdgeAppsRequest, BatchShowEdgeAppsResponse> batchShowEdgeApps =
        genForBatchShowEdgeApps();

    private static HttpRequestDef<BatchShowEdgeAppsRequest, BatchShowEdgeAppsResponse> genForBatchShowEdgeApps() {
        // basic
        HttpRequestDef.Builder<BatchShowEdgeAppsRequest, BatchShowEdgeAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchShowEdgeAppsRequest.class, BatchShowEdgeAppsResponse.class)
                .withName("BatchShowEdgeApps")
                .withUri("/v1/{project_id}/v2x-edge-apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowEdgeAppsRequest::getEdgeAppId, BatchShowEdgeAppsRequest::setEdgeAppId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowEdgeAppsRequest::getOffset, BatchShowEdgeAppsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowEdgeAppsRequest::getLimit, BatchShowEdgeAppsRequest::setLimit));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowEdgeAppsRequest::getInstanceId, BatchShowEdgeAppsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeAppRequest, CreateEdgeAppResponse> createEdgeApp =
        genForCreateEdgeApp();

    private static HttpRequestDef<CreateEdgeAppRequest, CreateEdgeAppResponse> genForCreateEdgeApp() {
        // basic
        HttpRequestDef.Builder<CreateEdgeAppRequest, CreateEdgeAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEdgeAppRequest.class, CreateEdgeAppResponse.class)
                .withName("CreateEdgeApp")
                .withUri("/v1/{project_id}/v2x-edge-apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeAppRequest::getInstanceId, CreateEdgeAppRequest::setInstanceId));
        builder.<CreateEdgeApplicationRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEdgeApplicationRequestDTO.class),
            f -> f.withMarshaller(CreateEdgeAppRequest::getBody, CreateEdgeAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeAppRequest, DeleteEdgeAppResponse> deleteEdgeApp =
        genForDeleteEdgeApp();

    private static HttpRequestDef<DeleteEdgeAppRequest, DeleteEdgeAppResponse> genForDeleteEdgeApp() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeAppRequest, DeleteEdgeAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEdgeAppRequest.class, DeleteEdgeAppResponse.class)
                .withName("DeleteEdgeApp")
                .withUri("/v1/{project_id}/v2x-edge-apps/{edge_app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeAppRequest::getEdgeAppId, DeleteEdgeAppRequest::setEdgeAppId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeAppRequest::getInstanceId, DeleteEdgeAppRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEdgeAppResponse::getBody, DeleteEdgeAppResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeAppRequest, UpdateEdgeAppResponse> updateEdgeApp =
        genForUpdateEdgeApp();

    private static HttpRequestDef<UpdateEdgeAppRequest, UpdateEdgeAppResponse> genForUpdateEdgeApp() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeAppRequest, UpdateEdgeAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEdgeAppRequest.class, UpdateEdgeAppResponse.class)
                .withName("UpdateEdgeApp")
                .withUri("/v1/{project_id}/v2x-edge-apps/{edge_app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeAppRequest::getEdgeAppId, UpdateEdgeAppRequest::setEdgeAppId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeAppRequest::getInstanceId, UpdateEdgeAppRequest::setInstanceId));
        builder.<UpdateEdgeApplicationRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeApplicationRequestDTO.class),
            f -> f.withMarshaller(UpdateEdgeAppRequest::getBody, UpdateEdgeAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowEdgeAppVersionsRequest, BatchShowEdgeAppVersionsResponse> batchShowEdgeAppVersions =
        genForBatchShowEdgeAppVersions();

    private static HttpRequestDef<BatchShowEdgeAppVersionsRequest, BatchShowEdgeAppVersionsResponse> genForBatchShowEdgeAppVersions() {
        // basic
        HttpRequestDef.Builder<BatchShowEdgeAppVersionsRequest, BatchShowEdgeAppVersionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, BatchShowEdgeAppVersionsRequest.class, BatchShowEdgeAppVersionsResponse.class)
                .withName("BatchShowEdgeAppVersions")
                .withUri("/v1/{project_id}/v2x-edge-apps/{edge_app_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowEdgeAppVersionsRequest::getEdgeAppId,
                BatchShowEdgeAppVersionsRequest::setEdgeAppId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowEdgeAppVersionsRequest::getVersion,
                BatchShowEdgeAppVersionsRequest::setVersion));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowEdgeAppVersionsRequest::getOffset,
                BatchShowEdgeAppVersionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowEdgeAppVersionsRequest::getLimit,
                BatchShowEdgeAppVersionsRequest::setLimit));
        builder.<BatchShowEdgeAppVersionsRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchShowEdgeAppVersionsRequest.StateEnum.class),
            f -> f.withMarshaller(BatchShowEdgeAppVersionsRequest::getState,
                BatchShowEdgeAppVersionsRequest::setState));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowEdgeAppVersionsRequest::getInstanceId,
                BatchShowEdgeAppVersionsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> createEdgeApplicationVersion =
        genForCreateEdgeApplicationVersion();

    private static HttpRequestDef<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> genForCreateEdgeApplicationVersion() {
        // basic
        HttpRequestDef.Builder<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateEdgeApplicationVersionRequest.class,
                    CreateEdgeApplicationVersionResponse.class)
                .withName("CreateEdgeApplicationVersion")
                .withUri("/v1/{project_id}/v2x-edge-apps/{edge_app_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeApplicationVersionRequest::getEdgeAppId,
                CreateEdgeApplicationVersionRequest::setEdgeAppId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeApplicationVersionRequest::getInstanceId,
                CreateEdgeApplicationVersionRequest::setInstanceId));
        builder.<CreateEdgeApplicationVersionDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEdgeApplicationVersionDTO.class),
            f -> f.withMarshaller(CreateEdgeApplicationVersionRequest::getBody,
                CreateEdgeApplicationVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> deleteEdgeApplicationVersion =
        genForDeleteEdgeApplicationVersion();

    private static HttpRequestDef<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> genForDeleteEdgeApplicationVersion() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteEdgeApplicationVersionRequest.class,
                    DeleteEdgeApplicationVersionResponse.class)
                .withName("DeleteEdgeApplicationVersion")
                .withUri("/v1/{project_id}/v2x-edge-apps/{edge_app_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeApplicationVersionRequest::getEdgeAppId,
                DeleteEdgeApplicationVersionRequest::setEdgeAppId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeApplicationVersionRequest::getVersion,
                DeleteEdgeApplicationVersionRequest::setVersion));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeApplicationVersionRequest::getInstanceId,
                DeleteEdgeApplicationVersionRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEdgeApplicationVersionResponse::getBody,
                DeleteEdgeApplicationVersionResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> showEdgeApplicationVersion =
        genForShowEdgeApplicationVersion();

    private static HttpRequestDef<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> genForShowEdgeApplicationVersion() {
        // basic
        HttpRequestDef.Builder<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowEdgeApplicationVersionRequest.class,
                    ShowEdgeApplicationVersionResponse.class)
                .withName("ShowEdgeApplicationVersion")
                .withUri("/v1/{project_id}/v2x-edge-apps/{edge_app_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeApplicationVersionRequest::getEdgeAppId,
                ShowEdgeApplicationVersionRequest::setEdgeAppId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeApplicationVersionRequest::getVersion,
                ShowEdgeApplicationVersionRequest::setVersion));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeApplicationVersionRequest::getInstanceId,
                ShowEdgeApplicationVersionRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> updateEdgeApplicationVersion =
        genForUpdateEdgeApplicationVersion();

    private static HttpRequestDef<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> genForUpdateEdgeApplicationVersion() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateEdgeApplicationVersionRequest.class,
                    UpdateEdgeApplicationVersionResponse.class)
                .withName("UpdateEdgeApplicationVersion")
                .withUri("/v1/{project_id}/v2x-edge-apps/{edge_app_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getEdgeAppId,
                UpdateEdgeApplicationVersionRequest::setEdgeAppId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getVersion,
                UpdateEdgeApplicationVersionRequest::setVersion));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getInstanceId,
                UpdateEdgeApplicationVersionRequest::setInstanceId));
        builder.<UpdateEdgeAppVersionDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeAppVersionDTO.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getBody,
                UpdateEdgeApplicationVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> updateEdgeApplicationVersionState =
        genForUpdateEdgeApplicationVersionState();

    private static HttpRequestDef<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> genForUpdateEdgeApplicationVersionState() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateEdgeApplicationVersionStateRequest.class,
                    UpdateEdgeApplicationVersionStateResponse.class)
                .withName("UpdateEdgeApplicationVersionState")
                .withUri("/v1/{project_id}/v2x-edge-apps/{edge_app_id}/versions/{version}/state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getEdgeAppId,
                UpdateEdgeApplicationVersionStateRequest::setEdgeAppId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getVersion,
                UpdateEdgeApplicationVersionStateRequest::setVersion));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getInstanceId,
                UpdateEdgeApplicationVersionStateRequest::setInstanceId));
        builder.<UpdateEdgeAppVersionStateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeAppVersionStateDTO.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getBody,
                UpdateEdgeApplicationVersionStateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRsuModelRequest, CreateRsuModelResponse> createRsuModel =
        genForCreateRsuModel();

    private static HttpRequestDef<CreateRsuModelRequest, CreateRsuModelResponse> genForCreateRsuModel() {
        // basic
        HttpRequestDef.Builder<CreateRsuModelRequest, CreateRsuModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRsuModelRequest.class, CreateRsuModelResponse.class)
                .withName("CreateRsuModel")
                .withUri("/v1/{project_id}/rsu-models")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRsuModelRequest::getInstanceId, CreateRsuModelRequest::setInstanceId));
        builder.<AddRsuModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddRsuModel.class),
            f -> f.withMarshaller(CreateRsuModelRequest::getBody, CreateRsuModelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRsuModelRequest, DeleteRsuModelResponse> deleteRsuModel =
        genForDeleteRsuModel();

    private static HttpRequestDef<DeleteRsuModelRequest, DeleteRsuModelResponse> genForDeleteRsuModel() {
        // basic
        HttpRequestDef.Builder<DeleteRsuModelRequest, DeleteRsuModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRsuModelRequest.class, DeleteRsuModelResponse.class)
                .withName("DeleteRsuModel")
                .withUri("/v1/{project_id}/rsu-models/{rsu_model_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rsu_model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRsuModelRequest::getRsuModelId, DeleteRsuModelRequest::setRsuModelId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRsuModelRequest::getInstanceId, DeleteRsuModelRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRsuModelResponse::getBody, DeleteRsuModelResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListRsuModelsRequest, ListRsuModelsResponse> listRsuModels =
        genForListRsuModels();

    private static HttpRequestDef<ListRsuModelsRequest, ListRsuModelsResponse> genForListRsuModels() {
        // basic
        HttpRequestDef.Builder<ListRsuModelsRequest, ListRsuModelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRsuModelsRequest.class, ListRsuModelsResponse.class)
                .withName("ListRsuModels")
                .withUri("/v1/{project_id}/rsu-models")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRsuModelsRequest::getLimit, ListRsuModelsRequest::setLimit));
        builder.<String>withRequestField("manufacturer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRsuModelsRequest::getManufacturerName,
                ListRsuModelsRequest::setManufacturerName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRsuModelsRequest::getOffset, ListRsuModelsRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRsuModelsRequest::getInstanceId, ListRsuModelsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRsuModelRequest, ShowRsuModelResponse> showRsuModel = genForShowRsuModel();

    private static HttpRequestDef<ShowRsuModelRequest, ShowRsuModelResponse> genForShowRsuModel() {
        // basic
        HttpRequestDef.Builder<ShowRsuModelRequest, ShowRsuModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRsuModelRequest.class, ShowRsuModelResponse.class)
                .withName("ShowRsuModel")
                .withUri("/v1/{project_id}/rsu-models/{rsu_model_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rsu_model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRsuModelRequest::getRsuModelId, ShowRsuModelRequest::setRsuModelId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRsuModelRequest::getInstanceId, ShowRsuModelRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRsuModelRequest, UpdateRsuModelResponse> updateRsuModel =
        genForUpdateRsuModel();

    private static HttpRequestDef<UpdateRsuModelRequest, UpdateRsuModelResponse> genForUpdateRsuModel() {
        // basic
        HttpRequestDef.Builder<UpdateRsuModelRequest, UpdateRsuModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRsuModelRequest.class, UpdateRsuModelResponse.class)
                .withName("UpdateRsuModel")
                .withUri("/v1/{project_id}/rsu-models/{rsu_model_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rsu_model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRsuModelRequest::getRsuModelId, UpdateRsuModelRequest::setRsuModelId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRsuModelRequest::getInstanceId, UpdateRsuModelRequest::setInstanceId));
        builder.<UpdateRsuModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRsuModel.class),
            f -> f.withMarshaller(UpdateRsuModelRequest::getBody, UpdateRsuModelRequest::setBody));

        // response

        return builder.build();
    }

}
