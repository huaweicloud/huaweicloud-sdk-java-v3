package com.huaweicloud.sdk.dris.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dris.v1.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class DrisMeta {

    public static final HttpRequestDef<CreateDataChannelRequest, CreateDataChannelResponse> createDataChannel =
        genForcreateDataChannel();

    private static HttpRequestDef<CreateDataChannelRequest, CreateDataChannelResponse> genForcreateDataChannel() {
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
            f -> f.withMarshaller(CreateDataChannelRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataChannelRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddV2XEdgeDataChannelDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddV2XEdgeDataChannelDTO.class),
            f -> f.withMarshaller(CreateDataChannelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataChannelRequest, DeleteDataChannelResponse> deleteDataChannel =
        genFordeleteDataChannel();

    private static HttpRequestDef<DeleteDataChannelRequest, DeleteDataChannelResponse> genFordeleteDataChannel() {
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
            f -> f.withMarshaller(DeleteDataChannelRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataChannelRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDataChannelResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataChannelRequest, ShowDataChannelResponse> showDataChannel =
        genForshowDataChannel();

    private static HttpRequestDef<ShowDataChannelRequest, ShowDataChannelResponse> genForshowDataChannel() {
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
            f -> f.withMarshaller(ShowDataChannelRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataChannelRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataChannelRequest, UpdateDataChannelResponse> updateDataChannel =
        genForupdateDataChannel();

    private static HttpRequestDef<UpdateDataChannelRequest, UpdateDataChannelResponse> genForupdateDataChannel() {
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
            f -> f.withMarshaller(UpdateDataChannelRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataChannelRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddV2XEdgeDataChannelDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddV2XEdgeDataChannelDTO.class),
            f -> f.withMarshaller(UpdateDataChannelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateV2xEdgeRequest, CreateV2xEdgeResponse> createV2xEdge =
        genForcreateV2xEdge();

    private static HttpRequestDef<CreateV2xEdgeRequest, CreateV2xEdgeResponse> genForcreateV2xEdge() {
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
            f -> f.withMarshaller(CreateV2xEdgeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddV2XEdgeDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddV2XEdgeDTO.class),
            f -> f.withMarshaller(CreateV2xEdgeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteV2XEdgeByV2xEdgeIdRequest, DeleteV2XEdgeByV2xEdgeIdResponse> deleteV2XEdgeByV2xEdgeId =
        genFordeleteV2XEdgeByV2xEdgeId();

    private static HttpRequestDef<DeleteV2XEdgeByV2xEdgeIdRequest, DeleteV2XEdgeByV2xEdgeIdResponse> genFordeleteV2XEdgeByV2xEdgeId() {
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
            f -> f.withMarshaller(DeleteV2XEdgeByV2xEdgeIdRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2XEdgeByV2xEdgeIdRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteV2XEdgeByV2xEdgeIdResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListV2xEdgesRequest, ListV2xEdgesResponse> listV2xEdges = genForlistV2xEdges();

    private static HttpRequestDef<ListV2xEdgesRequest, ListV2xEdgesResponse> genForlistV2xEdges() {
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
            f -> f.withMarshaller(ListV2xEdgesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2xEdgesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2xEdgesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2xEdgesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentCodeRequest, ShowDeploymentCodeResponse> showDeploymentCode =
        genForshowDeploymentCode();

    private static HttpRequestDef<ShowDeploymentCodeRequest, ShowDeploymentCodeResponse> genForshowDeploymentCode() {
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
            f -> f.withMarshaller(ShowDeploymentCodeRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentCodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowV2xEdgeDetailRequest, ShowV2xEdgeDetailResponse> showV2xEdgeDetail =
        genForshowV2xEdgeDetail();

    private static HttpRequestDef<ShowV2xEdgeDetailRequest, ShowV2xEdgeDetailResponse> genForshowV2xEdgeDetail() {
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
            f -> f.withMarshaller(ShowV2xEdgeDetailRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2xEdgeDetailRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateV2xEdgeRequest, UpdateV2xEdgeResponse> updateV2xEdge =
        genForupdateV2xEdge();

    private static HttpRequestDef<UpdateV2xEdgeRequest, UpdateV2xEdgeResponse> genForupdateV2xEdge() {
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
            f -> f.withMarshaller(UpdateV2xEdgeRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2xEdgeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ModifyV2XEdgeDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyV2XEdgeDTO.class),
            f -> f.withMarshaller(UpdateV2xEdgeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddForwardingConfigsRequest, AddForwardingConfigsResponse> addForwardingConfigs =
        genForaddForwardingConfigs();

    private static HttpRequestDef<AddForwardingConfigsRequest, AddForwardingConfigsResponse> genForaddForwardingConfigs() {
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
            f -> f.withMarshaller(AddForwardingConfigsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddForwardingConfigRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddForwardingConfigRequestDTO.class),
            f -> f.withMarshaller(AddForwardingConfigsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteForwardingConfigRequest, DeleteForwardingConfigResponse> deleteForwardingConfig =
        genFordeleteForwardingConfig();

    private static HttpRequestDef<DeleteForwardingConfigRequest, DeleteForwardingConfigResponse> genFordeleteForwardingConfig() {
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
            f -> f.withMarshaller(DeleteForwardingConfigRequest::getForwardingConfigId, (req, v) -> {
                req.setForwardingConfigId(v);
            }));
        builder.<String>withRequestField("forwarding_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteForwardingConfigRequest::getForwardingType, (req, v) -> {
                req.setForwardingType(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteForwardingConfigRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteForwardingConfigResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowForwardingConfigRequest, ShowForwardingConfigResponse> showForwardingConfig =
        genForshowForwardingConfig();

    private static HttpRequestDef<ShowForwardingConfigRequest, ShowForwardingConfigResponse> genForshowForwardingConfig() {
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
            f -> f.withMarshaller(ShowForwardingConfigRequest::getForwardingConfigId, (req, v) -> {
                req.setForwardingConfigId(v);
            }));
        builder.<String>withRequestField("forwarding_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowForwardingConfigRequest::getForwardingType, (req, v) -> {
                req.setForwardingType(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowForwardingConfigRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowForwardingConfigsRequest, ShowForwardingConfigsResponse> showForwardingConfigs =
        genForshowForwardingConfigs();

    private static HttpRequestDef<ShowForwardingConfigsRequest, ShowForwardingConfigsResponse> genForshowForwardingConfigs() {
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
            f -> f.withMarshaller(ShowForwardingConfigsRequest::getForwardingType, (req, v) -> {
                req.setForwardingType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowForwardingConfigsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowForwardingConfigsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowForwardingConfigsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateForwardingConfigRequest, UpdateForwardingConfigResponse> updateForwardingConfig =
        genForupdateForwardingConfig();

    private static HttpRequestDef<UpdateForwardingConfigRequest, UpdateForwardingConfigResponse> genForupdateForwardingConfig() {
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
            f -> f.withMarshaller(UpdateForwardingConfigRequest::getForwardingConfigId, (req, v) -> {
                req.setForwardingConfigId(v);
            }));
        builder.<String>withRequestField("forwarding_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateForwardingConfigRequest::getForwardingType, (req, v) -> {
                req.setForwardingType(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateForwardingConfigRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateForwardingConfigRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateForwardingConfigRequestDTO.class),
            f -> f.withMarshaller(UpdateForwardingConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryTrafficEventsRequest, ShowHistoryTrafficEventsResponse> showHistoryTrafficEvents =
        genForshowHistoryTrafficEvents();

    private static HttpRequestDef<ShowHistoryTrafficEventsRequest, ShowHistoryTrafficEventsResponse> genForshowHistoryTrafficEvents() {
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
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("from_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getFromDate, (req, v) -> {
                req.setFromDate(v);
            }));
        builder.<Long>withRequestField("to_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getToDate, (req, v) -> {
                req.setToDate(v);
            }));
        builder.<String>withRequestField("event_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<String>withRequestField("event_class",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getEventClass, (req, v) -> {
                req.setEventClass(v);
            }));
        builder.<String>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getEventType, (req, v) -> {
                req.setEventType(v);
            }));
        builder.<String>withRequestField("event_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getEventSource, (req, v) -> {
                req.setEventSource(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTrafficEventsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowIpcsRequest, BatchShowIpcsResponse> batchShowIpcs =
        genForbatchShowIpcs();

    private static HttpRequestDef<BatchShowIpcsRequest, BatchShowIpcsResponse> genForbatchShowIpcs() {
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
            f -> f.withMarshaller(BatchShowIpcsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowIpcsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<BatchShowIpcsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchShowIpcsRequest.StatusEnum.class),
            f -> f.withMarshaller(BatchShowIpcsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowIpcsRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowIpcsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpcRequest, ShowIpcResponse> showIpc = genForshowIpc();

    private static HttpRequestDef<ShowIpcRequest, ShowIpcResponse> genForshowIpc() {
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
            f -> f.withMarshaller(ShowIpcRequest::getCameraId, (req, v) -> {
                req.setCameraId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpcRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowRsusRequest, BatchShowRsusResponse> batchShowRsus =
        genForbatchShowRsus();

    private static HttpRequestDef<BatchShowRsusRequest, BatchShowRsusResponse> genForbatchShowRsus() {
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
            f -> f.withMarshaller(BatchShowRsusRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowRsusRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("rsu_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowRsusRequest::getRsuId, (req, v) -> {
                req.setRsuId(v);
            }));
        builder.<String>withRequestField("esn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowRsusRequest::getEsn, (req, v) -> {
                req.setEsn(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowRsusRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("rsu_model_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowRsusRequest::getRsuModelId, (req, v) -> {
                req.setRsuModelId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowRsusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRsuRequest, CreateRsuResponse> createRsu = genForcreateRsu();

    private static HttpRequestDef<CreateRsuRequest, CreateRsuResponse> genForcreateRsu() {
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
            f -> f.withMarshaller(CreateRsuRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddRsuDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddRsuDTO.class),
            f -> f.withMarshaller(CreateRsuRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRsuRequest, DeleteRsuResponse> deleteRsu = genFordeleteRsu();

    private static HttpRequestDef<DeleteRsuRequest, DeleteRsuResponse> genFordeleteRsu() {
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
            f -> f.withMarshaller(DeleteRsuRequest::getRsuId, (req, v) -> {
                req.setRsuId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRsuRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRsuResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRsuRequest, UpdateRsuResponse> updateRsu = genForupdateRsu();

    private static HttpRequestDef<UpdateRsuRequest, UpdateRsuResponse> genForupdateRsu() {
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
            f -> f.withMarshaller(UpdateRsuRequest::getRsuId, (req, v) -> {
                req.setRsuId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRsuRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ModifyRsuRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyRsuRequestDTO.class),
            f -> f.withMarshaller(UpdateRsuRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendImmediateEventRequest, SendImmediateEventResponse> sendImmediateEvent =
        genForsendImmediateEvent();

    private static HttpRequestDef<SendImmediateEventRequest, SendImmediateEventResponse> genForsendImmediateEvent() {
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
            f -> f.withMarshaller(SendImmediateEventRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<SendImmediateEventsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendImmediateEventsDTO.class),
            f -> f.withMarshaller(SendImmediateEventRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowTrafficControllersRequest, BatchShowTrafficControllersResponse> batchShowTrafficControllers =
        genForbatchShowTrafficControllers();

    private static HttpRequestDef<BatchShowTrafficControllersRequest, BatchShowTrafficControllersResponse> genForbatchShowTrafficControllers() {
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
            f -> f.withMarshaller(BatchShowTrafficControllersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowTrafficControllersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("traffic_controller_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficControllersRequest::getTrafficControllerId, (req, v) -> {
                req.setTrafficControllerId(v);
            }));
        builder.<String>withRequestField("esn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficControllersRequest::getEsn, (req, v) -> {
                req.setEsn(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficControllersRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficControllersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrafficControllerRequest, CreateTrafficControllerResponse> createTrafficController =
        genForcreateTrafficController();

    private static HttpRequestDef<CreateTrafficControllerRequest, CreateTrafficControllerResponse> genForcreateTrafficController() {
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
            f -> f.withMarshaller(CreateTrafficControllerRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddTrafficControllerDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddTrafficControllerDTO.class),
            f -> f.withMarshaller(CreateTrafficControllerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrafficControllerRequest, DeleteTrafficControllerResponse> deleteTrafficController =
        genFordeleteTrafficController();

    private static HttpRequestDef<DeleteTrafficControllerRequest, DeleteTrafficControllerResponse> genFordeleteTrafficController() {
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
            f -> f.withMarshaller(DeleteTrafficControllerRequest::getTrafficControllerId, (req, v) -> {
                req.setTrafficControllerId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTrafficControllerRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTrafficControllerResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrafficControllerRequest, UpdateTrafficControllerResponse> updateTrafficController =
        genForupdateTrafficController();

    private static HttpRequestDef<UpdateTrafficControllerRequest, UpdateTrafficControllerResponse> genForupdateTrafficController() {
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
            f -> f.withMarshaller(UpdateTrafficControllerRequest::getTrafficControllerId, (req, v) -> {
                req.setTrafficControllerId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTrafficControllerRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ModifyTrafficControllerRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyTrafficControllerRequestDTO.class),
            f -> f.withMarshaller(UpdateTrafficControllerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowTrafficEventsRequest, BatchShowTrafficEventsResponse> batchShowTrafficEvents =
        genForbatchShowTrafficEvents();

    private static HttpRequestDef<BatchShowTrafficEventsRequest, BatchShowTrafficEventsResponse> genForbatchShowTrafficEvents() {
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
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("area_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getAreaCode, (req, v) -> {
                req.setAreaCode(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getEventType, (req, v) -> {
                req.setEventType(v);
            }));
        builder.<List<String>>withRequestField("event_source_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getEventSourceType, (req, v) -> {
                req.setEventSourceType(v);
            }));
        builder.<String>withRequestField("event_class",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getEventClass, (req, v) -> {
                req.setEventClass(v);
            }));
        builder.<String>withRequestField("event_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<String>withRequestField("from_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getFromTime, (req, v) -> {
                req.setFromTime(v);
            }));
        builder.<String>withRequestField("to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getToTime, (req, v) -> {
                req.setToTime(v);
            }));
        builder.<BatchShowTrafficEventsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchShowTrafficEventsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<BatchShowTrafficEventsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchShowTrafficEventsRequest.SortDirEnum.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTrafficEventsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrafficEventRequest, CreateTrafficEventResponse> createTrafficEvent =
        genForcreateTrafficEvent();

    private static HttpRequestDef<CreateTrafficEventRequest, CreateTrafficEventResponse> genForcreateTrafficEvent() {
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
            f -> f.withMarshaller(CreateTrafficEventRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddTrafficEventDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTrafficEventDTO.class),
            f -> f.withMarshaller(CreateTrafficEventRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrafficEventRequest, DeleteTrafficEventResponse> deleteTrafficEvent =
        genFordeleteTrafficEvent();

    private static HttpRequestDef<DeleteTrafficEventRequest, DeleteTrafficEventResponse> genFordeleteTrafficEvent() {
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
            f -> f.withMarshaller(DeleteTrafficEventRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTrafficEventRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTrafficEventResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrafficEventRequest, ShowTrafficEventResponse> showTrafficEvent =
        genForshowTrafficEvent();

    private static HttpRequestDef<ShowTrafficEventRequest, ShowTrafficEventResponse> genForshowTrafficEvent() {
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
            f -> f.withMarshaller(ShowTrafficEventRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrafficEventRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrafficEventRequest, UpdateTrafficEventResponse> updateTrafficEvent =
        genForupdateTrafficEvent();

    private static HttpRequestDef<UpdateTrafficEventRequest, UpdateTrafficEventResponse> genForupdateTrafficEvent() {
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
            f -> f.withMarshaller(UpdateTrafficEventRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTrafficEventRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateTrafficEventDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTrafficEventDTO.class),
            f -> f.withMarshaller(UpdateTrafficEventRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateV2xEdgeAppRequest, CreateV2xEdgeAppResponse> createV2xEdgeApp =
        genForcreateV2xEdgeApp();

    private static HttpRequestDef<CreateV2xEdgeAppRequest, CreateV2xEdgeAppResponse> genForcreateV2xEdgeApp() {
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
            f -> f.withMarshaller(CreateV2xEdgeAppRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateV2xEdgeAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddV2XEdgeAppDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddV2XEdgeAppDTO.class),
            f -> f.withMarshaller(CreateV2xEdgeAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteV2XEdgeAppByEdgeAppIdRequest, DeleteV2XEdgeAppByEdgeAppIdResponse> deleteV2XEdgeAppByEdgeAppId =
        genFordeleteV2XEdgeAppByEdgeAppId();

    private static HttpRequestDef<DeleteV2XEdgeAppByEdgeAppIdRequest, DeleteV2XEdgeAppByEdgeAppIdResponse> genFordeleteV2XEdgeAppByEdgeAppId() {
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
            f -> f.withMarshaller(DeleteV2XEdgeAppByEdgeAppIdRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            }));
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2XEdgeAppByEdgeAppIdRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteV2XEdgeAppByEdgeAppIdRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteV2XEdgeAppByEdgeAppIdResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListV2xEdgeAppRequest, ListV2xEdgeAppResponse> listV2xEdgeApp =
        genForlistV2xEdgeApp();

    private static HttpRequestDef<ListV2xEdgeAppRequest, ListV2xEdgeAppResponse> genForlistV2xEdgeApp() {
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
            f -> f.withMarshaller(ListV2xEdgeAppRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2xEdgeAppRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListV2xEdgeAppRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListV2xEdgeAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowV2XEdgeAppDetailByEdgeAppIdRequest, ShowV2XEdgeAppDetailByEdgeAppIdResponse> showV2XEdgeAppDetailByEdgeAppId =
        genForshowV2XEdgeAppDetailByEdgeAppId();

    private static HttpRequestDef<ShowV2XEdgeAppDetailByEdgeAppIdRequest, ShowV2XEdgeAppDetailByEdgeAppIdResponse> genForshowV2XEdgeAppDetailByEdgeAppId() {
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
            f -> f.withMarshaller(ShowV2XEdgeAppDetailByEdgeAppIdRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            }));
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2XEdgeAppDetailByEdgeAppIdRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowV2XEdgeAppDetailByEdgeAppIdRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateV2xEdgeAppRequest, UpdateV2xEdgeAppResponse> updateV2xEdgeApp =
        genForupdateV2xEdgeApp();

    private static HttpRequestDef<UpdateV2xEdgeAppRequest, UpdateV2xEdgeAppResponse> genForupdateV2xEdgeApp() {
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
            f -> f.withMarshaller(UpdateV2xEdgeAppRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            }));
        builder.<String>withRequestField("v2x_edge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2xEdgeAppRequest::getV2xEdgeId, (req, v) -> {
                req.setV2xEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateV2xEdgeAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ModifyV2XEdgeAppDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyV2XEdgeAppDTO.class),
            f -> f.withMarshaller(UpdateV2xEdgeAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowVehiclesRequest, BatchShowVehiclesResponse> batchShowVehicles =
        genForbatchShowVehicles();

    private static HttpRequestDef<BatchShowVehiclesRequest, BatchShowVehiclesResponse> genForbatchShowVehicles() {
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
            f -> f.withMarshaller(BatchShowVehiclesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowVehiclesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("vehicle_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowVehiclesRequest::getVehicleId, (req, v) -> {
                req.setVehicleId(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowVehiclesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowVehiclesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVehicleRequest, CreateVehicleResponse> createVehicle =
        genForcreateVehicle();

    private static HttpRequestDef<CreateVehicleRequest, CreateVehicleResponse> genForcreateVehicle() {
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
            f -> f.withMarshaller(CreateVehicleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddVehicleDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddVehicleDTO.class),
            f -> f.withMarshaller(CreateVehicleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVehicleRequest, DeleteVehicleResponse> deleteVehicle =
        genFordeleteVehicle();

    private static HttpRequestDef<DeleteVehicleRequest, DeleteVehicleResponse> genFordeleteVehicle() {
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
            f -> f.withMarshaller(DeleteVehicleRequest::getVehicleId, (req, v) -> {
                req.setVehicleId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVehicleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteVehicleResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVehicleRequest, UpdateVehicleResponse> updateVehicle =
        genForupdateVehicle();

    private static HttpRequestDef<UpdateVehicleRequest, UpdateVehicleResponse> genForupdateVehicle() {
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
            f -> f.withMarshaller(UpdateVehicleRequest::getVehicleId, (req, v) -> {
                req.setVehicleId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVehicleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ModifyVehicleRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyVehicleRequestDTO.class),
            f -> f.withMarshaller(UpdateVehicleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowEdgeAppsRequest, BatchShowEdgeAppsResponse> batchShowEdgeApps =
        genForbatchShowEdgeApps();

    private static HttpRequestDef<BatchShowEdgeAppsRequest, BatchShowEdgeAppsResponse> genForbatchShowEdgeApps() {
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
            f -> f.withMarshaller(BatchShowEdgeAppsRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowEdgeAppsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowEdgeAppsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowEdgeAppsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeAppRequest, CreateEdgeAppResponse> createEdgeApp =
        genForcreateEdgeApp();

    private static HttpRequestDef<CreateEdgeAppRequest, CreateEdgeAppResponse> genForcreateEdgeApp() {
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
            f -> f.withMarshaller(CreateEdgeAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateEdgeApplicationRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEdgeApplicationRequestDTO.class),
            f -> f.withMarshaller(CreateEdgeAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeAppRequest, DeleteEdgeAppResponse> deleteEdgeApp =
        genFordeleteEdgeApp();

    private static HttpRequestDef<DeleteEdgeAppRequest, DeleteEdgeAppResponse> genFordeleteEdgeApp() {
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
            f -> f.withMarshaller(DeleteEdgeAppRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEdgeAppResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeAppRequest, UpdateEdgeAppResponse> updateEdgeApp =
        genForupdateEdgeApp();

    private static HttpRequestDef<UpdateEdgeAppRequest, UpdateEdgeAppResponse> genForupdateEdgeApp() {
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
            f -> f.withMarshaller(UpdateEdgeAppRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateEdgeApplicationRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeApplicationRequestDTO.class),
            f -> f.withMarshaller(UpdateEdgeAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowEdgeAppVersionsRequest, BatchShowEdgeAppVersionsResponse> batchShowEdgeAppVersions =
        genForbatchShowEdgeAppVersions();

    private static HttpRequestDef<BatchShowEdgeAppVersionsRequest, BatchShowEdgeAppVersionsResponse> genForbatchShowEdgeAppVersions() {
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
            f -> f.withMarshaller(BatchShowEdgeAppVersionsRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowEdgeAppVersionsRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowEdgeAppVersionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowEdgeAppVersionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<BatchShowEdgeAppVersionsRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchShowEdgeAppVersionsRequest.StateEnum.class),
            f -> f.withMarshaller(BatchShowEdgeAppVersionsRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowEdgeAppVersionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> createEdgeApplicationVersion =
        genForcreateEdgeApplicationVersion();

    private static HttpRequestDef<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> genForcreateEdgeApplicationVersion() {
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
            f -> f.withMarshaller(CreateEdgeApplicationVersionRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeApplicationVersionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateEdgeApplicationVersionDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEdgeApplicationVersionDTO.class),
            f -> f.withMarshaller(CreateEdgeApplicationVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> deleteEdgeApplicationVersion =
        genFordeleteEdgeApplicationVersion();

    private static HttpRequestDef<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> genFordeleteEdgeApplicationVersion() {
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
            f -> f.withMarshaller(DeleteEdgeApplicationVersionRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeApplicationVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeApplicationVersionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEdgeApplicationVersionResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> showEdgeApplicationVersion =
        genForshowEdgeApplicationVersion();

    private static HttpRequestDef<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> genForshowEdgeApplicationVersion() {
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
            f -> f.withMarshaller(ShowEdgeApplicationVersionRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeApplicationVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeApplicationVersionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> updateEdgeApplicationVersion =
        genForupdateEdgeApplicationVersion();

    private static HttpRequestDef<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> genForupdateEdgeApplicationVersion() {
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
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateEdgeAppVersionDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeAppVersionDTO.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> updateEdgeApplicationVersionState =
        genForupdateEdgeApplicationVersionState();

    private static HttpRequestDef<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> genForupdateEdgeApplicationVersionState() {
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
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateEdgeAppVersionStateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeAppVersionStateDTO.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeFlowsRequest, ListEdgeFlowsResponse> listEdgeFlows =
        genForlistEdgeFlows();

    private static HttpRequestDef<ListEdgeFlowsRequest, ListEdgeFlowsResponse> genForlistEdgeFlows() {
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
            f -> f.withMarshaller(ListEdgeFlowsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeFlowsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("from_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeFlowsRequest::getFromDate, (req, v) -> {
                req.setFromDate(v);
            }));
        builder.<String>withRequestField("to_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeFlowsRequest::getToDate, (req, v) -> {
                req.setToDate(v);
            }));
        builder.<String>withRequestField("edge_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeFlowsRequest::getEdgeId, (req, v) -> {
                req.setEdgeId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeFlowsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRsuModelRequest, CreateRsuModelResponse> createRsuModel =
        genForcreateRsuModel();

    private static HttpRequestDef<CreateRsuModelRequest, CreateRsuModelResponse> genForcreateRsuModel() {
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
            f -> f.withMarshaller(CreateRsuModelRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddRsuModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddRsuModel.class),
            f -> f.withMarshaller(CreateRsuModelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRsuModelRequest, DeleteRsuModelResponse> deleteRsuModel =
        genFordeleteRsuModel();

    private static HttpRequestDef<DeleteRsuModelRequest, DeleteRsuModelResponse> genFordeleteRsuModel() {
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
            f -> f.withMarshaller(DeleteRsuModelRequest::getRsuModelId, (req, v) -> {
                req.setRsuModelId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRsuModelRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRsuModelResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListRsuModelsRequest, ListRsuModelsResponse> listRsuModels =
        genForlistRsuModels();

    private static HttpRequestDef<ListRsuModelsRequest, ListRsuModelsResponse> genForlistRsuModels() {
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
            f -> f.withMarshaller(ListRsuModelsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("manufacturer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRsuModelsRequest::getManufacturerName, (req, v) -> {
                req.setManufacturerName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRsuModelsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRsuModelsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRsuModelRequest, ShowRsuModelResponse> showRsuModel = genForshowRsuModel();

    private static HttpRequestDef<ShowRsuModelRequest, ShowRsuModelResponse> genForshowRsuModel() {
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
            f -> f.withMarshaller(ShowRsuModelRequest::getRsuModelId, (req, v) -> {
                req.setRsuModelId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRsuModelRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRsuModelRequest, UpdateRsuModelResponse> updateRsuModel =
        genForupdateRsuModel();

    private static HttpRequestDef<UpdateRsuModelRequest, UpdateRsuModelResponse> genForupdateRsuModel() {
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
            f -> f.withMarshaller(UpdateRsuModelRequest::getRsuModelId, (req, v) -> {
                req.setRsuModelId(v);
            }));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRsuModelRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateRsuModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRsuModel.class),
            f -> f.withMarshaller(UpdateRsuModelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
