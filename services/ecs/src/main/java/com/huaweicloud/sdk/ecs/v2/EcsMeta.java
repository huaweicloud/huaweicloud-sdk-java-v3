package com.huaweicloud.sdk.ecs.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ecs.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class EcsMeta {

    public static final HttpRequestDef<AddServerGroupMemberRequest, AddServerGroupMemberResponse> addServerGroupMember = genForaddServerGroupMember();

    private static HttpRequestDef<AddServerGroupMemberRequest, AddServerGroupMemberResponse> genForaddServerGroupMember() {
        // basic
        HttpRequestDef.Builder<AddServerGroupMemberRequest, AddServerGroupMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddServerGroupMemberRequest.class, AddServerGroupMemberResponse.class)
                .withName("AddServerGroupMember")
                .withUri("/v1/{project_id}/cloudservers/os-server-groups/{server_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddServerGroupMemberRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddServerGroupMemberRequestBody.class,
            f -> f.withMarshaller(AddServerGroupMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachServerVolumeRequest, AttachServerVolumeResponse> attachServerVolume = genForattachServerVolume();

    private static HttpRequestDef<AttachServerVolumeRequest, AttachServerVolumeResponse> genForattachServerVolume() {
        // basic
        HttpRequestDef.Builder<AttachServerVolumeRequest, AttachServerVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachServerVolumeRequest.class, AttachServerVolumeResponse.class)
                .withName("AttachServerVolume")
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
                .withName("BatchAddServerNics")
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
                .withName("BatchCreateServerTags")
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
                .withName("BatchDeleteServerNics")
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
                .withName("BatchDeleteServerTags")
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
                .withName("BatchRebootServers")
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
                .withName("BatchStartServers")
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
                .withName("BatchStopServers")
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

    public static final HttpRequestDef<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> changeServerOsWithCloudInit = genForchangeServerOsWithCloudInit();

    private static HttpRequestDef<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> genForchangeServerOsWithCloudInit() {
        // basic
        HttpRequestDef.Builder<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeServerOsWithCloudInitRequest.class, ChangeServerOsWithCloudInitResponse.class)
                .withName("ChangeServerOsWithCloudInit")
                .withUri("/v2/{project_id}/cloudservers/{server_id}/changeos")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ChangeServerOsWithCloudInitRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ChangeServerOsWithCloudInitRequestBody.class,
            f -> f.withMarshaller(ChangeServerOsWithCloudInitRequest::getBody, (req, v) -> {
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
                .withName("CreatePostPaidServers")
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

    public static final HttpRequestDef<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroup = genForcreateServerGroup();

    private static HttpRequestDef<CreateServerGroupRequest, CreateServerGroupResponse> genForcreateServerGroup() {
        // basic
        HttpRequestDef.Builder<CreateServerGroupRequest, CreateServerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateServerGroupRequest.class, CreateServerGroupResponse.class)
                .withName("CreateServerGroup")
                .withUri("/v1/{project_id}/cloudservers/os-server-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateServerGroupRequestBody.class,
            f -> f.withMarshaller(CreateServerGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServersRequest, CreateServersResponse> createServers = genForcreateServers();

    private static HttpRequestDef<CreateServersRequest, CreateServersResponse> genForcreateServers() {
        // basic
        HttpRequestDef.Builder<CreateServersRequest, CreateServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateServersRequest.class, CreateServersResponse.class)
                .withName("CreateServers")
                .withUri("/v1.1/{project_id}/cloudservers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateServersRequestBody.class,
            f -> f.withMarshaller(CreateServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerGroupRequest, DeleteServerGroupResponse> deleteServerGroup = genFordeleteServerGroup();

    private static HttpRequestDef<DeleteServerGroupRequest, DeleteServerGroupResponse> genFordeleteServerGroup() {
        // basic
        HttpRequestDef.Builder<DeleteServerGroupRequest, DeleteServerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServerGroupRequest.class, DeleteServerGroupResponse.class)
                .withName("DeleteServerGroup")
                .withUri("/v1/{project_id}/cloudservers/os-server-groups/{server_group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteServerGroupRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> deleteServerGroupMember = genFordeleteServerGroupMember();

    private static HttpRequestDef<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> genFordeleteServerGroupMember() {
        // basic
        HttpRequestDef.Builder<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteServerGroupMemberRequest.class, DeleteServerGroupMemberResponse.class)
                .withName("DeleteServerGroupMember")
                .withUri("/v1/{project_id}/cloudservers/os-server-groups/{server_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteServerGroupMemberRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeleteServerGroupMemberRequestBody.class,
            f -> f.withMarshaller(DeleteServerGroupMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerMetadataRequest, DeleteServerMetadataResponse> deleteServerMetadata = genFordeleteServerMetadata();

    private static HttpRequestDef<DeleteServerMetadataRequest, DeleteServerMetadataResponse> genFordeleteServerMetadata() {
        // basic
        HttpRequestDef.Builder<DeleteServerMetadataRequest, DeleteServerMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServerMetadataRequest.class, DeleteServerMetadataResponse.class)
                .withName("DeleteServerMetadata")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/metadata/{key}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteServerMetadataRequest::getKey, (req, v) -> {
                req.setKey(v);
            })
        );
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteServerMetadataRequest::getServerId, (req, v) -> {
                req.setServerId(v);
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
                .withName("DeleteServers")
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
                .withName("DetachServerVolume")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/detachvolume/{volume_id}")
                .withContentType("application/json");

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
                .withName("ListFlavors")
                .withUri("/v1/{project_id}/cloudservers/flavors")
                .withContentType("application/json");

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

    public static final HttpRequestDef<ListResizeFlavorsRequest, ListResizeFlavorsResponse> listResizeFlavors = genForlistResizeFlavors();

    private static HttpRequestDef<ListResizeFlavorsRequest, ListResizeFlavorsResponse> genForlistResizeFlavors() {
        // basic
        HttpRequestDef.Builder<ListResizeFlavorsRequest, ListResizeFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResizeFlavorsRequest.class, ListResizeFlavorsResponse.class)
                .withName("ListResizeFlavors")
                .withUri("/v1/{project_id}/cloudservers/resize_flavors")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResizeFlavorsRequest::getInstanceUuid, (req, v) -> {
                req.setInstanceUuid(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListResizeFlavorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResizeFlavorsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListResizeFlavorsRequest.SortDirEnum.class,
            f -> f.withMarshaller(ListResizeFlavorsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            })
        );
        builder.withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListResizeFlavorsRequest.SortKeyEnum.class,
            f -> f.withMarshaller(ListResizeFlavorsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            })
        );
        builder.withRequestField("source_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResizeFlavorsRequest::getSourceFlavorId, (req, v) -> {
                req.setSourceFlavorId(v);
            })
        );
        builder.withRequestField("source_flavor_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResizeFlavorsRequest::getSourceFlavorName, (req, v) -> {
                req.setSourceFlavorName(v);
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
                .withName("ListServerBlockDevices")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/block_device")
                .withContentType("application/json");

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
                .withName("ListServerInterfaces")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/os-interface")
                .withContentType("application/json");

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
                .withName("ListServersDetails")
                .withUri("/v1/{project_id}/cloudservers/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServersDetailsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
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
        builder.withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServersDetailsRequest::getIp, (req, v) -> {
                req.setIp(v);
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
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServersDetailsRequest::getName, (req, v) -> {
                req.setName(v);
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
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListServersDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
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
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServersDetailsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
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

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> novaAssociateSecurityGroup = genFornovaAssociateSecurityGroup();

    private static HttpRequestDef<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> genFornovaAssociateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NovaAssociateSecurityGroupRequest.class, NovaAssociateSecurityGroupResponse.class)
                .withName("NovaAssociateSecurityGroup")
                .withUri("/v2.1/{project_id}/servers/{server_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NovaAssociateSecurityGroupRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NovaAssociateSecurityGroupRequestBody.class,
            f -> f.withMarshaller(NovaAssociateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaCreateKeypairRequest, NovaCreateKeypairResponse> novaCreateKeypair = genFornovaCreateKeypair();

    private static HttpRequestDef<NovaCreateKeypairRequest, NovaCreateKeypairResponse> genFornovaCreateKeypair() {
        // basic
        HttpRequestDef.Builder<NovaCreateKeypairRequest, NovaCreateKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NovaCreateKeypairRequest.class, NovaCreateKeypairResponse.class)
                .withName("NovaCreateKeypair")
                .withUri("/v2.1/{project_id}/os-keypairs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("OpenStack-API-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NovaCreateKeypairRequest::getOpenStackAPIVersion, (req, v) -> {
                req.setOpenStackAPIVersion(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NovaCreateKeypairRequestBody.class,
            f -> f.withMarshaller(NovaCreateKeypairRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withName("NovaCreateServers")
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

    public static final HttpRequestDef<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> novaDeleteKeypair = genFornovaDeleteKeypair();

    private static HttpRequestDef<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> genFornovaDeleteKeypair() {
        // basic
        HttpRequestDef.Builder<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, NovaDeleteKeypairRequest.class, NovaDeleteKeypairResponse.class)
                .withName("NovaDeleteKeypair")
                .withUri("/v2.1/{project_id}/os-keypairs/{keypair_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NovaDeleteKeypairRequest::getKeypairName, (req, v) -> {
                req.setKeypairName(v);
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
                .withName("NovaDeleteServer")
                .withUri("/v2.1/{project_id}/servers/{server_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> novaDisassociateSecurityGroup = genFornovaDisassociateSecurityGroup();

    private static HttpRequestDef<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> genFornovaDisassociateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NovaDisassociateSecurityGroupRequest.class, NovaDisassociateSecurityGroupResponse.class)
                .withName("NovaDisassociateSecurityGroup")
                .withUri("/v2.1/{project_id}/servers/{server_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NovaDisassociateSecurityGroupRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NovaDisassociateSecurityGroupRequestBody.class,
            f -> f.withMarshaller(NovaDisassociateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> novaListAvailabilityZones = genFornovaListAvailabilityZones();

    private static HttpRequestDef<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> genFornovaListAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NovaListAvailabilityZonesRequest.class, NovaListAvailabilityZonesResponse.class)
                .withName("NovaListAvailabilityZones")
                .withUri("/v2.1/{project_id}/os-availability-zone")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaListKeypairsRequest, NovaListKeypairsResponse> novaListKeypairs = genFornovaListKeypairs();

    private static HttpRequestDef<NovaListKeypairsRequest, NovaListKeypairsResponse> genFornovaListKeypairs() {
        // basic
        HttpRequestDef.Builder<NovaListKeypairsRequest, NovaListKeypairsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NovaListKeypairsRequest.class, NovaListKeypairsResponse.class)
                .withName("NovaListKeypairs")
                .withUri("/v2.1/{project_id}/os-keypairs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(NovaListKeypairsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NovaListKeypairsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("OpenStack-API-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NovaListKeypairsRequest::getOpenStackAPIVersion, (req, v) -> {
                req.setOpenStackAPIVersion(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> novaListServerSecurityGroups = genFornovaListServerSecurityGroups();

    private static HttpRequestDef<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> genFornovaListServerSecurityGroups() {
        // basic
        HttpRequestDef.Builder<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NovaListServerSecurityGroupsRequest.class, NovaListServerSecurityGroupsResponse.class)
                .withName("NovaListServerSecurityGroups")
                .withUri("/v2.1/{project_id}/servers/{server_id}/os-security-groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NovaListServerSecurityGroupsRequest::getServerId, (req, v) -> {
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
                .withName("NovaListServersDetails")
                .withUri("/v2.1/{project_id}/servers/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("changes-since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NovaListServersDetailsRequest::getChangesSince, (req, v) -> {
                req.setChangesSince(v);
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
        builder.withRequestField("image",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NovaListServersDetailsRequest::getImage, (req, v) -> {
                req.setImage(v);
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
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NovaListServersDetailsRequest::getName, (req, v) -> {
                req.setName(v);
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
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            NovaListServersDetailsRequest.StatusEnum.class,
            f -> f.withMarshaller(NovaListServersDetailsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
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

    public static final HttpRequestDef<NovaShowKeypairRequest, NovaShowKeypairResponse> novaShowKeypair = genFornovaShowKeypair();

    private static HttpRequestDef<NovaShowKeypairRequest, NovaShowKeypairResponse> genFornovaShowKeypair() {
        // basic
        HttpRequestDef.Builder<NovaShowKeypairRequest, NovaShowKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NovaShowKeypairRequest.class, NovaShowKeypairResponse.class)
                .withName("NovaShowKeypair")
                .withUri("/v2.1/{project_id}/os-keypairs/{keypair_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NovaShowKeypairRequest::getKeypairName, (req, v) -> {
                req.setKeypairName(v);
            })
        );
        builder.withRequestField("OpenStack-API-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NovaShowKeypairRequest::getOpenStackAPIVersion, (req, v) -> {
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
                .withName("NovaShowServer")
                .withUri("/v2.1/{project_id}/servers/{server_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> reinstallServerWithCloudInit = genForreinstallServerWithCloudInit();

    private static HttpRequestDef<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> genForreinstallServerWithCloudInit() {
        // basic
        HttpRequestDef.Builder<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ReinstallServerWithCloudInitRequest.class, ReinstallServerWithCloudInitResponse.class)
                .withName("ReinstallServerWithCloudInit")
                .withUri("/v2/{project_id}/cloudservers/{server_id}/reinstallos")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ReinstallServerWithCloudInitRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ReinstallServerWithCloudInitRequestBody.class,
            f -> f.withMarshaller(ReinstallServerWithCloudInitRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetServerPasswordRequest, ResetServerPasswordResponse> resetServerPassword = genForresetServerPassword();

    private static HttpRequestDef<ResetServerPasswordRequest, ResetServerPasswordResponse> genForresetServerPassword() {
        // basic
        HttpRequestDef.Builder<ResetServerPasswordRequest, ResetServerPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetServerPasswordRequest.class, ResetServerPasswordResponse.class)
                .withName("ResetServerPassword")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/os-reset-password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetServerPasswordRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResetServerPasswordRequestBody.class,
            f -> f.withMarshaller(ResetServerPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withName("ResizePostPaidServer")
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

    public static final HttpRequestDef<ResizeServerRequest, ResizeServerResponse> resizeServer = genForresizeServer();

    private static HttpRequestDef<ResizeServerRequest, ResizeServerResponse> genForresizeServer() {
        // basic
        HttpRequestDef.Builder<ResizeServerRequest, ResizeServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeServerRequest.class, ResizeServerResponse.class)
                .withName("ResizeServer")
                .withUri("/v1.1/{project_id}/cloudservers/{server_id}/resize")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResizeServerRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResizeServerRequestBody.class,
            f -> f.withMarshaller(ResizeServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> showResetPasswordFlag = genForshowResetPasswordFlag();

    private static HttpRequestDef<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> genForshowResetPasswordFlag() {
        // basic
        HttpRequestDef.Builder<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResetPasswordFlagRequest.class, ShowResetPasswordFlagResponse.class)
                .withName("ShowResetPasswordFlag")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/os-resetpwd-flag")
                .withContentType("application/json");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowResetPasswordFlagRequest::getServerId, (req, v) -> {
                req.setServerId(v);
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
                .withName("ShowServer")
                .withUri("/v1/{project_id}/cloudservers/{server_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<ShowServerLimitsRequest, ShowServerLimitsResponse> showServerLimits = genForshowServerLimits();

    private static HttpRequestDef<ShowServerLimitsRequest, ShowServerLimitsResponse> genForshowServerLimits() {
        // basic
        HttpRequestDef.Builder<ShowServerLimitsRequest, ShowServerLimitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerLimitsRequest.class, ShowServerLimitsResponse.class)
                .withName("ShowServerLimits")
                .withUri("/v1/{project_id}/cloudservers/limits")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> showServerRemoteConsole = genForshowServerRemoteConsole();

    private static HttpRequestDef<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> genForshowServerRemoteConsole() {
        // basic
        HttpRequestDef.Builder<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowServerRemoteConsoleRequest.class, ShowServerRemoteConsoleResponse.class)
                .withName("ShowServerRemoteConsole")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/remote_console")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowServerRemoteConsoleRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ShowServerRemoteConsoleRequestBody.class,
            f -> f.withMarshaller(ShowServerRemoteConsoleRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withName("ShowServerTags")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/tags")
                .withContentType("application/json");

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
                .withName("UpdateServer")
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

    public static final HttpRequestDef<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> updateServerAutoTerminateTime = genForupdateServerAutoTerminateTime();

    private static HttpRequestDef<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> genForupdateServerAutoTerminateTime() {
        // basic
        HttpRequestDef.Builder<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateServerAutoTerminateTimeRequest.class, UpdateServerAutoTerminateTimeResponse.class)
                .withName("UpdateServerAutoTerminateTime")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/actions/update-auto-terminate-time")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateServerAutoTerminateTimeRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateServerAutoTerminateTimeRequestBody.class,
            f -> f.withMarshaller(UpdateServerAutoTerminateTimeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerMetadataRequest, UpdateServerMetadataResponse> updateServerMetadata = genForupdateServerMetadata();

    private static HttpRequestDef<UpdateServerMetadataRequest, UpdateServerMetadataResponse> genForupdateServerMetadata() {
        // basic
        HttpRequestDef.Builder<UpdateServerMetadataRequest, UpdateServerMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateServerMetadataRequest.class, UpdateServerMetadataResponse.class)
                .withName("UpdateServerMetadata")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/metadata")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateServerMetadataRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateServerMetadataRequestBody.class,
            f -> f.withMarshaller(UpdateServerMetadataRequest::getBody, (req, v) -> {
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
                .withName("ShowJob")
                .withUri("/v1/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

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
