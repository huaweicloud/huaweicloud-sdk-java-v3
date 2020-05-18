package com.huaweicloud.sdk.ecs.v2;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.HttpMethod;

import com.huaweicloud.sdk.ecs.v2.model.*;

@SuppressWarnings("unchecked")
public class EcsMeta {

    public static final HttpRequestDef<AttachServerVolumeRequest, AttachServerVolumeResponse> attachServerVolume = genForattachServerVolume();

    private static HttpRequestDef<AttachServerVolumeRequest, AttachServerVolumeResponse> genForattachServerVolume() {
        // basic
        HttpRequestDef.Builder<AttachServerVolumeRequest, AttachServerVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachServerVolumeRequest.class, AttachServerVolumeResponse.class)
                .withUri("/v1/{project_id}/cloudservers/{server_id}/attachvolume")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(AttachServerVolumeRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                AttachServerVolumeRequestBody.class,
                f -> f.withMarshaller(AttachServerVolumeRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<BatchAddServerNicsRequest, BatchAddServerNicsResponse> batchAddServerNics = genForbatchAddServerNics();

    private static HttpRequestDef<BatchAddServerNicsRequest, BatchAddServerNicsResponse> genForbatchAddServerNics() {
        // basic
        HttpRequestDef.Builder<BatchAddServerNicsRequest, BatchAddServerNicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddServerNicsRequest.class, BatchAddServerNicsResponse.class)
                .withUri("/v1/{project_id}/cloudservers/{server_id}/nics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(BatchAddServerNicsRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                BatchAddServerNicsRequestBody.class,
                f -> f.withMarshaller(BatchAddServerNicsRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> batchCreateServerTags = genForbatchCreateServerTags();

    private static HttpRequestDef<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> genForbatchCreateServerTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateServerTagsRequest.class, BatchCreateServerTagsResponse.class)
                .withUri("/v1/{project_id}/cloudservers/{server_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(BatchCreateServerTagsRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                BatchCreateServerTagsRequestBody.class,
                f -> f.withMarshaller(BatchCreateServerTagsRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> batchDeleteServerNics = genForbatchDeleteServerNics();

    private static HttpRequestDef<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> genForbatchDeleteServerNics() {
        // basic
        HttpRequestDef.Builder<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteServerNicsRequest.class, BatchDeleteServerNicsResponse.class)
                .withUri("/v1/{project_id}/cloudservers/{server_id}/nics/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(BatchDeleteServerNicsRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                BatchDeleteServerNicsRequestBody.class,
                f -> f.withMarshaller(BatchDeleteServerNicsRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> batchDeleteServerTags = genForbatchDeleteServerTags();

    private static HttpRequestDef<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> genForbatchDeleteServerTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteServerTagsRequest.class, BatchDeleteServerTagsResponse.class)
                .withUri("/v1/{project_id}/cloudservers/{server_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(BatchDeleteServerTagsRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                BatchDeleteServerTagsRequestBody.class,
                f -> f.withMarshaller(BatchDeleteServerTagsRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<BatchRebootServersRequest, BatchRebootServersResponse> batchRebootServers = genForbatchRebootServers();

    private static HttpRequestDef<BatchRebootServersRequest, BatchRebootServersResponse> genForbatchRebootServers() {
        // basic
        HttpRequestDef.Builder<BatchRebootServersRequest, BatchRebootServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRebootServersRequest.class, BatchRebootServersResponse.class)
                .withUri("/v1/{project_id}/cloudservers/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                BatchRebootServersRequestBody.class,
                f -> f.withMarshaller(BatchRebootServersRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<BatchStartServersRequest, BatchStartServersResponse> batchStartServers = genForbatchStartServers();

    private static HttpRequestDef<BatchStartServersRequest, BatchStartServersResponse> genForbatchStartServers() {
        // basic
        HttpRequestDef.Builder<BatchStartServersRequest, BatchStartServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStartServersRequest.class, BatchStartServersResponse.class)
                .withUri("/v1/{project_id}/cloudservers/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                BatchStartServersRequestBody.class,
                f -> f.withMarshaller(BatchStartServersRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<BatchStopServersRequest, BatchStopServersResponse> batchStopServers = genForbatchStopServers();

    private static HttpRequestDef<BatchStopServersRequest, BatchStopServersResponse> genForbatchStopServers() {
        // basic
        HttpRequestDef.Builder<BatchStopServersRequest, BatchStopServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStopServersRequest.class, BatchStopServersResponse.class)
                .withUri("/v1/{project_id}/cloudservers/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                BatchStopServersRequestBody.class,
                f -> f.withMarshaller(BatchStopServersRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreatePostPaidServersRequest, CreatePostPaidServersResponse> createPostPaidServers = genForcreatePostPaidServers();

    private static HttpRequestDef<CreatePostPaidServersRequest, CreatePostPaidServersResponse> genForcreatePostPaidServers() {
        // basic
        HttpRequestDef.Builder<CreatePostPaidServersRequest, CreatePostPaidServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePostPaidServersRequest.class, CreatePostPaidServersResponse.class)
                .withUri("/v1/{project_id}/cloudservers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreatePostPaidServersRequestBody.class,
                f -> f.withMarshaller(CreatePostPaidServersRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DeleteServersRequest, DeleteServersResponse> deleteServers = genFordeleteServers();

    private static HttpRequestDef<DeleteServersRequest, DeleteServersResponse> genFordeleteServers() {
        // basic
        HttpRequestDef.Builder<DeleteServersRequest, DeleteServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteServersRequest.class, DeleteServersResponse.class)
                .withUri("/v1/{project_id}/cloudservers/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                DeleteServersRequestBody.class,
                f -> f.withMarshaller(DeleteServersRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DetachServerVolumeRequest, DetachServerVolumeResponse> detachServerVolume = genFordetachServerVolume();

    private static HttpRequestDef<DetachServerVolumeRequest, DetachServerVolumeResponse> genFordetachServerVolume() {
        // basic
        HttpRequestDef.Builder<DetachServerVolumeRequest, DetachServerVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DetachServerVolumeRequest.class, DetachServerVolumeResponse.class)
                .withUri("/v1/{project_id}/cloudservers/{server_id}/detachvolume/{volume_id}");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DetachServerVolumeRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );
        builder.withRequestField("volume_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DetachServerVolumeRequest::getVolumeId, (req, v) -> {
                    req.setVolumeId(v);
                })
        );
        builder.withRequestField("delete_flag",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                DetachServerVolumeRequest.DeleteFlagEnum.class,
                f -> f.withMarshaller(DetachServerVolumeRequest::getDeleteFlag, (req, v) -> {
                    req.setDeleteFlag(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withUri("/v1/{project_id}/cloudservers/flavors");

        // requests
        builder.withRequestField("availability_zone",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListFlavorsRequest::getAvailabilityZone, (req, v) -> {
                    req.setAvailabilityZone(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> listServerBlockDevices = genForlistServerBlockDevices();

    private static HttpRequestDef<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> genForlistServerBlockDevices() {
        // basic
        HttpRequestDef.Builder<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServerBlockDevicesRequest.class, ListServerBlockDevicesResponse.class)
                .withUri("/v1/{project_id}/cloudservers/{server_id}/block_device");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListServerBlockDevicesRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListServerInterfacesRequest, ListServerInterfacesResponse> listServerInterfaces = genForlistServerInterfaces();

    private static HttpRequestDef<ListServerInterfacesRequest, ListServerInterfacesResponse> genForlistServerInterfaces() {
        // basic
        HttpRequestDef.Builder<ListServerInterfacesRequest, ListServerInterfacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServerInterfacesRequest.class, ListServerInterfacesResponse.class)
                .withUri("/v1/{project_id}/cloudservers/{server_id}/os-interface");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListServerInterfacesRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListServersDetailsRequest, ListServersDetailsResponse> listServersDetails = genForlistServersDetails();

    private static HttpRequestDef<ListServersDetailsRequest, ListServersDetailsResponse> genForlistServersDetails() {
        // basic
        HttpRequestDef.Builder<ListServersDetailsRequest, ListServersDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServersDetailsRequest.class, ListServersDetailsResponse.class)
                .withUri("/v1/{project_id}/cloudservers/detail");

        // requests
        builder.withRequestField("offset",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListServersDetailsRequest::getOffset, (req, v) -> {
                    req.setOffset(v);
                })
        );
        builder.withRequestField("flavor",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListServersDetailsRequest::getFlavor, (req, v) -> {
                    req.setFlavor(v);
                })
        );
        builder.withRequestField("name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListServersDetailsRequest::getName, (req, v) -> {
                    req.setName(v);
                })
        );
        builder.withRequestField("status",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListServersDetailsRequest::getStatus, (req, v) -> {
                    req.setStatus(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListServersDetailsRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );
        builder.withRequestField("not-tags",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListServersDetailsRequest::getNotTags, (req, v) -> {
                    req.setNotTags(v);
                })
        );
        builder.withRequestField("reservation_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListServersDetailsRequest::getReservationId, (req, v) -> {
                    req.setReservationId(v);
                })
        );
        builder.withRequestField("enterprise_project_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListServersDetailsRequest::getEnterpriseProjectId, (req, v) -> {
                    req.setEnterpriseProjectId(v);
                })
        );
        builder.withRequestField("tags",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListServersDetailsRequest::getTags, (req, v) -> {
                    req.setTags(v);
                })
        );
        builder.withRequestField("ip",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListServersDetailsRequest::getIp, (req, v) -> {
                    req.setIp(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<NovaCreateServersRequest, NovaCreateServersResponse> novaCreateServers = genFornovaCreateServers();

    private static HttpRequestDef<NovaCreateServersRequest, NovaCreateServersResponse> genFornovaCreateServers() {
        // basic
        HttpRequestDef.Builder<NovaCreateServersRequest, NovaCreateServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NovaCreateServersRequest.class, NovaCreateServersResponse.class)
                .withUri("/v2.1/{project_id}/servers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("OpenStack-API-Version",
                LocationType.Header,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(NovaCreateServersRequest::getOpenStackAPIVersion, (req, v) -> {
                    req.setOpenStackAPIVersion(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                NovaCreateServersRequestBody.class,
                f -> f.withMarshaller(NovaCreateServersRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<NovaDeleteServerRequest, NovaDeleteServerResponse> novaDeleteServer = genFornovaDeleteServer();

    private static HttpRequestDef<NovaDeleteServerRequest, NovaDeleteServerResponse> genFornovaDeleteServer() {
        // basic
        HttpRequestDef.Builder<NovaDeleteServerRequest, NovaDeleteServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, NovaDeleteServerRequest.class, NovaDeleteServerResponse.class)
                .withUri("/v2.1/{project_id}/servers/{server_id}");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(NovaDeleteServerRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<NovaListServersDetailsRequest, NovaListServersDetailsResponse> novaListServersDetails = genFornovaListServersDetails();

    private static HttpRequestDef<NovaListServersDetailsRequest, NovaListServersDetailsResponse> genFornovaListServersDetails() {
        // basic
        HttpRequestDef.Builder<NovaListServersDetailsRequest, NovaListServersDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NovaListServersDetailsRequest.class, NovaListServersDetailsResponse.class)
                .withUri("/v2.1/{project_id}/servers/detail");

        // requests
        builder.withRequestField("changes-since",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(NovaListServersDetailsRequest::getChangesSince, (req, v) -> {
                    req.setChangesSince(v);
                })
        );
        builder.withRequestField("ip",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(NovaListServersDetailsRequest::getIp, (req, v) -> {
                    req.setIp(v);
                })
        );
        builder.withRequestField("image",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(NovaListServersDetailsRequest::getImage, (req, v) -> {
                    req.setImage(v);
                })
        );
        builder.withRequestField("flavor",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(NovaListServersDetailsRequest::getFlavor, (req, v) -> {
                    req.setFlavor(v);
                })
        );
        builder.withRequestField("name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(NovaListServersDetailsRequest::getName, (req, v) -> {
                    req.setName(v);
                })
        );
        builder.withRequestField("status",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                NovaListServersDetailsRequest.StatusEnum.class,
                f -> f.withMarshaller(NovaListServersDetailsRequest::getStatus, (req, v) -> {
                    req.setStatus(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(NovaListServersDetailsRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );
        builder.withRequestField("marker",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(NovaListServersDetailsRequest::getMarker, (req, v) -> {
                    req.setMarker(v);
                })
        );
        builder.withRequestField("tags",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(NovaListServersDetailsRequest::getTags, (req, v) -> {
                    req.setTags(v);
                })
        );
        builder.withRequestField("not-tags",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(NovaListServersDetailsRequest::getNotTags, (req, v) -> {
                    req.setNotTags(v);
                })
        );
        builder.withRequestField("reservation_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(NovaListServersDetailsRequest::getReservationId, (req, v) -> {
                    req.setReservationId(v);
                })
        );
        builder.withRequestField("sort_key",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                NovaListServersDetailsRequest.SortKeyEnum.class,
                f -> f.withMarshaller(NovaListServersDetailsRequest::getSortKey, (req, v) -> {
                    req.setSortKey(v);
                })
        );
        builder.withRequestField("OpenStack-API-Version",
                LocationType.Header,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(NovaListServersDetailsRequest::getOpenStackAPIVersion, (req, v) -> {
                    req.setOpenStackAPIVersion(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<NovaShowServerRequest, NovaShowServerResponse> novaShowServer = genFornovaShowServer();

    private static HttpRequestDef<NovaShowServerRequest, NovaShowServerResponse> genFornovaShowServer() {
        // basic
        HttpRequestDef.Builder<NovaShowServerRequest, NovaShowServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NovaShowServerRequest.class, NovaShowServerResponse.class)
                .withUri("/v2.1/{project_id}/servers/{server_id}");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(NovaShowServerRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );
        builder.withRequestField("OpenStack-API-Version",
                LocationType.Header,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(NovaShowServerRequest::getOpenStackAPIVersion, (req, v) -> {
                    req.setOpenStackAPIVersion(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ResizePostPaidServerRequest, ResizePostPaidServerResponse> resizePostPaidServer = genForresizePostPaidServer();

    private static HttpRequestDef<ResizePostPaidServerRequest, ResizePostPaidServerResponse> genForresizePostPaidServer() {
        // basic
        HttpRequestDef.Builder<ResizePostPaidServerRequest, ResizePostPaidServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizePostPaidServerRequest.class, ResizePostPaidServerResponse.class)
                .withUri("/v1/{project_id}/cloudservers/{server_id}/resize")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ResizePostPaidServerRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                ResizePostPaidServerRequestBody.class,
                f -> f.withMarshaller(ResizePostPaidServerRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowServerRequest, ShowServerResponse> showServer = genForshowServer();

    private static HttpRequestDef<ShowServerRequest, ShowServerResponse> genForshowServer() {
        // basic
        HttpRequestDef.Builder<ShowServerRequest, ShowServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerRequest.class, ShowServerResponse.class)
                .withUri("/v1/{project_id}/cloudservers/{server_id}");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowServerRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowServerTagsRequest, ShowServerTagsResponse> showServerTags = genForshowServerTags();

    private static HttpRequestDef<ShowServerTagsRequest, ShowServerTagsResponse> genForshowServerTags() {
        // basic
        HttpRequestDef.Builder<ShowServerTagsRequest, ShowServerTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerTagsRequest.class, ShowServerTagsResponse.class)
                .withUri("/v1/{project_id}/cloudservers/{server_id}/tags");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowServerTagsRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<UpdateServerRequest, UpdateServerResponse> updateServer = genForupdateServer();

    private static HttpRequestDef<UpdateServerRequest, UpdateServerResponse> genForupdateServer() {
        // basic
        HttpRequestDef.Builder<UpdateServerRequest, UpdateServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateServerRequest.class, UpdateServerResponse.class)
                .withUri("/v1/{project_id}/cloudservers/{server_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateServerRequest::getServerId, (req, v) -> {
                    req.setServerId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                UpdateServerRequestBody.class,
                f -> f.withMarshaller(UpdateServerRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForshowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForshowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withUri("/v1/{project_id}/jobs/{job_id}");

        // requests
        builder.withRequestField("job_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                    req.setJobId(v);
                })
        );

        // response

        return builder.build();

    }

}

