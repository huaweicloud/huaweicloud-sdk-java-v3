package com.huaweicloud.sdk.ecs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ecs.v2.model.*;

@SuppressWarnings("unchecked")
public class EcsMeta {

    public static final HttpRequestDef<AddServerGroupMemberRequest, AddServerGroupMemberResponse> addServerGroupMember =
        genForaddServerGroupMember();

    private static HttpRequestDef<AddServerGroupMemberRequest, AddServerGroupMemberResponse> genForaddServerGroupMember() {
        // basic
        HttpRequestDef.Builder<AddServerGroupMemberRequest, AddServerGroupMemberResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddServerGroupMemberRequest.class, AddServerGroupMemberResponse.class)
            .withName("AddServerGroupMember")
            .withUri("/v1/{project_id}/cloudservers/os-server-groups/{server_group_id}/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddServerGroupMemberRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<AddServerGroupMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddServerGroupMemberRequestBody.class),
            f -> f.withMarshaller(AddServerGroupMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse> associateServerVirtualIp =
        genForassociateServerVirtualIp();

    private static HttpRequestDef<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse> genForassociateServerVirtualIp() {
        // basic
        HttpRequestDef.Builder<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, AssociateServerVirtualIpRequest.class, AssociateServerVirtualIpResponse.class)
                .withName("AssociateServerVirtualIp")
                .withUri("/v1/{project_id}/cloudservers/nics/{nic_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("nic_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateServerVirtualIpRequest::getNicId, (req, v) -> {
                req.setNicId(v);
            }));
        builder.<AssociateServerVirtualIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateServerVirtualIpRequestBody.class),
            f -> f.withMarshaller(AssociateServerVirtualIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachServerVolumeRequest, AttachServerVolumeResponse> attachServerVolume =
        genForattachServerVolume();

    private static HttpRequestDef<AttachServerVolumeRequest, AttachServerVolumeResponse> genForattachServerVolume() {
        // basic
        HttpRequestDef.Builder<AttachServerVolumeRequest, AttachServerVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachServerVolumeRequest.class, AttachServerVolumeResponse.class)
                .withName("AttachServerVolume")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/attachvolume")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachServerVolumeRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<AttachServerVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachServerVolumeRequestBody.class),
            f -> f.withMarshaller(AttachServerVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddServerNicsRequest, BatchAddServerNicsResponse> batchAddServerNics =
        genForbatchAddServerNics();

    private static HttpRequestDef<BatchAddServerNicsRequest, BatchAddServerNicsResponse> genForbatchAddServerNics() {
        // basic
        HttpRequestDef.Builder<BatchAddServerNicsRequest, BatchAddServerNicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddServerNicsRequest.class, BatchAddServerNicsResponse.class)
                .withName("BatchAddServerNics")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/nics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddServerNicsRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<BatchAddServerNicsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddServerNicsRequestBody.class),
            f -> f.withMarshaller(BatchAddServerNicsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse> batchAttachSharableVolumes =
        genForbatchAttachSharableVolumes();

    private static HttpRequestDef<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse> genForbatchAttachSharableVolumes() {
        // basic
        HttpRequestDef.Builder<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchAttachSharableVolumesRequest.class,
                    BatchAttachSharableVolumesResponse.class)
                .withName("BatchAttachSharableVolumes")
                .withUri("/v1/{project_id}/batchaction/attachvolumes/{volume_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAttachSharableVolumesRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            }));
        builder.<BatchAttachSharableVolumesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAttachSharableVolumesRequestBody.class),
            f -> f.withMarshaller(BatchAttachSharableVolumesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> batchCreateServerTags =
        genForbatchCreateServerTags();

    private static HttpRequestDef<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> genForbatchCreateServerTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateServerTagsRequest.class, BatchCreateServerTagsResponse.class)
            .withName("BatchCreateServerTags")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateServerTagsRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<BatchCreateServerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateServerTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateServerTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> batchDeleteServerNics =
        genForbatchDeleteServerNics();

    private static HttpRequestDef<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> genForbatchDeleteServerNics() {
        // basic
        HttpRequestDef.Builder<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteServerNicsRequest.class, BatchDeleteServerNicsResponse.class)
            .withName("BatchDeleteServerNics")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/nics/delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteServerNicsRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<BatchDeleteServerNicsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteServerNicsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteServerNicsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> batchDeleteServerTags =
        genForbatchDeleteServerTags();

    private static HttpRequestDef<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> genForbatchDeleteServerTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteServerTagsRequest.class, BatchDeleteServerTagsResponse.class)
            .withName("BatchDeleteServerTags")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteServerTagsRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<BatchDeleteServerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteServerTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteServerTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRebootServersRequest, BatchRebootServersResponse> batchRebootServers =
        genForbatchRebootServers();

    private static HttpRequestDef<BatchRebootServersRequest, BatchRebootServersResponse> genForbatchRebootServers() {
        // basic
        HttpRequestDef.Builder<BatchRebootServersRequest, BatchRebootServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRebootServersRequest.class, BatchRebootServersResponse.class)
                .withName("BatchRebootServers")
                .withUri("/v1/{project_id}/cloudservers/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchRebootServersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRebootServersRequestBody.class),
            f -> f.withMarshaller(BatchRebootServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse> batchResetServersPassword =
        genForbatchResetServersPassword();

    private static HttpRequestDef<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse> genForbatchResetServersPassword() {
        // basic
        HttpRequestDef.Builder<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchResetServersPasswordRequest.class,
                    BatchResetServersPasswordResponse.class)
                .withName("BatchResetServersPassword")
                .withUri("/v1/{project_id}/cloudservers/os-reset-passwords")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchResetServersPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchResetServersPasswordRequestBody.class),
            f -> f.withMarshaller(BatchResetServersPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartServersRequest, BatchStartServersResponse> batchStartServers =
        genForbatchStartServers();

    private static HttpRequestDef<BatchStartServersRequest, BatchStartServersResponse> genForbatchStartServers() {
        // basic
        HttpRequestDef.Builder<BatchStartServersRequest, BatchStartServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStartServersRequest.class, BatchStartServersResponse.class)
                .withName("BatchStartServers")
                .withUri("/v1/{project_id}/cloudservers/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchStartServersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStartServersRequestBody.class),
            f -> f.withMarshaller(BatchStartServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopServersRequest, BatchStopServersResponse> batchStopServers =
        genForbatchStopServers();

    private static HttpRequestDef<BatchStopServersRequest, BatchStopServersResponse> genForbatchStopServers() {
        // basic
        HttpRequestDef.Builder<BatchStopServersRequest, BatchStopServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStopServersRequest.class, BatchStopServersResponse.class)
                .withName("BatchStopServers")
                .withUri("/v1/{project_id}/cloudservers/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchStopServersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStopServersRequestBody.class),
            f -> f.withMarshaller(BatchStopServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse> batchUpdateServersName =
        genForbatchUpdateServersName();

    private static HttpRequestDef<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse> genForbatchUpdateServersName() {
        // basic
        HttpRequestDef.Builder<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, BatchUpdateServersNameRequest.class, BatchUpdateServersNameResponse.class)
            .withName("BatchUpdateServersName")
            .withUri("/v1/{project_id}/cloudservers/server-name")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchUpdateServersNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateServersNameRequestBody.class),
            f -> f.withMarshaller(BatchUpdateServersNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> changeServerOsWithCloudInit =
        genForchangeServerOsWithCloudInit();

    private static HttpRequestDef<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> genForchangeServerOsWithCloudInit() {
        // basic
        HttpRequestDef.Builder<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeServerOsWithCloudInitRequest.class,
                    ChangeServerOsWithCloudInitResponse.class)
                .withName("ChangeServerOsWithCloudInit")
                .withUri("/v2/{project_id}/cloudservers/{server_id}/changeos")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeServerOsWithCloudInitRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<ChangeServerOsWithCloudInitRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeServerOsWithCloudInitRequestBody.class),
            f -> f.withMarshaller(ChangeServerOsWithCloudInitRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse> changeServerOsWithoutCloudInit =
        genForchangeServerOsWithoutCloudInit();

    private static HttpRequestDef<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse> genForchangeServerOsWithoutCloudInit() {
        // basic
        HttpRequestDef.Builder<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeServerOsWithoutCloudInitRequest.class,
                    ChangeServerOsWithoutCloudInitResponse.class)
                .withName("ChangeServerOsWithoutCloudInit")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/changeos")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeServerOsWithoutCloudInitRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<ChangeServerOsWithoutCloudInitRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeServerOsWithoutCloudInitRequestBody.class),
            f -> f.withMarshaller(ChangeServerOsWithoutCloudInitRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostPaidServersRequest, CreatePostPaidServersResponse> createPostPaidServers =
        genForcreatePostPaidServers();

    private static HttpRequestDef<CreatePostPaidServersRequest, CreatePostPaidServersResponse> genForcreatePostPaidServers() {
        // basic
        HttpRequestDef.Builder<CreatePostPaidServersRequest, CreatePostPaidServersResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePostPaidServersRequest.class, CreatePostPaidServersResponse.class)
            .withName("CreatePostPaidServers")
            .withUri("/v1/{project_id}/cloudservers")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostPaidServersRequest::getXClientToken, (req, v) -> {
                req.setXClientToken(v);
            }));
        builder.<CreatePostPaidServersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePostPaidServersRequestBody.class),
            f -> f.withMarshaller(CreatePostPaidServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroup =
        genForcreateServerGroup();

    private static HttpRequestDef<CreateServerGroupRequest, CreateServerGroupResponse> genForcreateServerGroup() {
        // basic
        HttpRequestDef.Builder<CreateServerGroupRequest, CreateServerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateServerGroupRequest.class, CreateServerGroupResponse.class)
                .withName("CreateServerGroup")
                .withUri("/v1/{project_id}/cloudservers/os-server-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateServerGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateServerGroupRequestBody.class),
            f -> f.withMarshaller(CreateServerGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServersRequest, CreateServersResponse> createServers =
        genForcreateServers();

    private static HttpRequestDef<CreateServersRequest, CreateServersResponse> genForcreateServers() {
        // basic
        HttpRequestDef.Builder<CreateServersRequest, CreateServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateServersRequest.class, CreateServersResponse.class)
                .withName("CreateServers")
                .withUri("/v1.1/{project_id}/cloudservers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateServersRequest::getXClientToken, (req, v) -> {
                req.setXClientToken(v);
            }));
        builder.<CreateServersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateServersRequestBody.class),
            f -> f.withMarshaller(CreateServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerGroupRequest, DeleteServerGroupResponse> deleteServerGroup =
        genFordeleteServerGroup();

    private static HttpRequestDef<DeleteServerGroupRequest, DeleteServerGroupResponse> genFordeleteServerGroup() {
        // basic
        HttpRequestDef.Builder<DeleteServerGroupRequest, DeleteServerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServerGroupRequest.class, DeleteServerGroupResponse.class)
                .withName("DeleteServerGroup")
                .withUri("/v1/{project_id}/cloudservers/os-server-groups/{server_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerGroupRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> deleteServerGroupMember =
        genFordeleteServerGroupMember();

    private static HttpRequestDef<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> genFordeleteServerGroupMember() {
        // basic
        HttpRequestDef.Builder<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteServerGroupMemberRequest.class, DeleteServerGroupMemberResponse.class)
            .withName("DeleteServerGroupMember")
            .withUri("/v1/{project_id}/cloudservers/os-server-groups/{server_group_id}/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerGroupMemberRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<DeleteServerGroupMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteServerGroupMemberRequestBody.class),
            f -> f.withMarshaller(DeleteServerGroupMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerMetadataRequest, DeleteServerMetadataResponse> deleteServerMetadata =
        genFordeleteServerMetadata();

    private static HttpRequestDef<DeleteServerMetadataRequest, DeleteServerMetadataResponse> genFordeleteServerMetadata() {
        // basic
        HttpRequestDef.Builder<DeleteServerMetadataRequest, DeleteServerMetadataResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteServerMetadataRequest.class, DeleteServerMetadataResponse.class)
            .withName("DeleteServerMetadata")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/metadata/{key}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerMetadataRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerMetadataRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerPasswordRequest, DeleteServerPasswordResponse> deleteServerPassword =
        genFordeleteServerPassword();

    private static HttpRequestDef<DeleteServerPasswordRequest, DeleteServerPasswordResponse> genFordeleteServerPassword() {
        // basic
        HttpRequestDef.Builder<DeleteServerPasswordRequest, DeleteServerPasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteServerPasswordRequest.class, DeleteServerPasswordResponse.class)
            .withName("DeleteServerPassword")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/os-server-password")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerPasswordRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServersRequest, DeleteServersResponse> deleteServers =
        genFordeleteServers();

    private static HttpRequestDef<DeleteServersRequest, DeleteServersResponse> genFordeleteServers() {
        // basic
        HttpRequestDef.Builder<DeleteServersRequest, DeleteServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteServersRequest.class, DeleteServersResponse.class)
                .withName("DeleteServers")
                .withUri("/v1/{project_id}/cloudservers/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteServersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteServersRequestBody.class),
            f -> f.withMarshaller(DeleteServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachServerVolumeRequest, DetachServerVolumeResponse> detachServerVolume =
        genFordetachServerVolume();

    private static HttpRequestDef<DetachServerVolumeRequest, DetachServerVolumeResponse> genFordetachServerVolume() {
        // basic
        HttpRequestDef.Builder<DetachServerVolumeRequest, DetachServerVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DetachServerVolumeRequest.class, DetachServerVolumeResponse.class)
                .withName("DetachServerVolume")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/detachvolume/{volume_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachServerVolumeRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachServerVolumeRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            }));
        builder.<DetachServerVolumeRequest.DeleteFlagEnum>withRequestField("delete_flag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DetachServerVolumeRequest.DeleteFlagEnum.class),
            f -> f.withMarshaller(DetachServerVolumeRequest::getDeleteFlag, (req, v) -> {
                req.setDeleteFlag(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse> disassociateServerVirtualIp =
        genFordisassociateServerVirtualIp();

    private static HttpRequestDef<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse> genFordisassociateServerVirtualIp() {
        // basic
        HttpRequestDef.Builder<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    DisassociateServerVirtualIpRequest.class,
                    DisassociateServerVirtualIpResponse.class)
                .withName("DisassociateServerVirtualIp")
                .withUri("/v1/{project_id}/cloudservers/nics/{nic_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("nic_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateServerVirtualIpRequest::getNicId, (req, v) -> {
                req.setNicId(v);
            }));
        builder.<DisassociateServerVirtualIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateServerVirtualIpRequestBody.class),
            f -> f.withMarshaller(DisassociateServerVirtualIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResizeFlavorsRequest, ListResizeFlavorsResponse> listResizeFlavors =
        genForlistResizeFlavors();

    private static HttpRequestDef<ListResizeFlavorsRequest, ListResizeFlavorsResponse> genForlistResizeFlavors() {
        // basic
        HttpRequestDef.Builder<ListResizeFlavorsRequest, ListResizeFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResizeFlavorsRequest.class, ListResizeFlavorsResponse.class)
                .withName("ListResizeFlavors")
                .withUri("/v1/{project_id}/cloudservers/resize_flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResizeFlavorsRequest::getInstanceUuid, (req, v) -> {
                req.setInstanceUuid(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResizeFlavorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResizeFlavorsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<ListResizeFlavorsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResizeFlavorsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListResizeFlavorsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<ListResizeFlavorsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResizeFlavorsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListResizeFlavorsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("source_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResizeFlavorsRequest::getSourceFlavorId, (req, v) -> {
                req.setSourceFlavorId(v);
            }));
        builder.<String>withRequestField("source_flavor_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResizeFlavorsRequest::getSourceFlavorName, (req, v) -> {
                req.setSourceFlavorName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> listServerBlockDevices =
        genForlistServerBlockDevices();

    private static HttpRequestDef<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> genForlistServerBlockDevices() {
        // basic
        HttpRequestDef.Builder<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListServerBlockDevicesRequest.class, ListServerBlockDevicesResponse.class)
            .withName("ListServerBlockDevices")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/block_device")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerBlockDevicesRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroups =
        genForlistServerGroups();

    private static HttpRequestDef<ListServerGroupsRequest, ListServerGroupsResponse> genForlistServerGroups() {
        // basic
        HttpRequestDef.Builder<ListServerGroupsRequest, ListServerGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServerGroupsRequest.class, ListServerGroupsResponse.class)
                .withName("ListServerGroups")
                .withUri("/v1/{project_id}/cloudservers/os-server-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerInterfacesRequest, ListServerInterfacesResponse> listServerInterfaces =
        genForlistServerInterfaces();

    private static HttpRequestDef<ListServerInterfacesRequest, ListServerInterfacesResponse> genForlistServerInterfaces() {
        // basic
        HttpRequestDef.Builder<ListServerInterfacesRequest, ListServerInterfacesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListServerInterfacesRequest.class, ListServerInterfacesResponse.class)
            .withName("ListServerInterfaces")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/os-interface")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerInterfacesRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerTagsRequest, ListServerTagsResponse> listServerTags =
        genForlistServerTags();

    private static HttpRequestDef<ListServerTagsRequest, ListServerTagsResponse> genForlistServerTags() {
        // basic
        HttpRequestDef.Builder<ListServerTagsRequest, ListServerTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServerTagsRequest.class, ListServerTagsResponse.class)
                .withName("ListServerTags")
                .withUri("/v1/{project_id}/cloudservers/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServersByTagRequest, ListServersByTagResponse> listServersByTag =
        genForlistServersByTag();

    private static HttpRequestDef<ListServersByTagRequest, ListServersByTagResponse> genForlistServersByTag() {
        // basic
        HttpRequestDef.Builder<ListServersByTagRequest, ListServersByTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListServersByTagRequest.class, ListServersByTagResponse.class)
                .withName("ListServersByTag")
                .withUri("/v1/{project_id}/cloudservers/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListServersByTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListServersByTagRequestBody.class),
            f -> f.withMarshaller(ListServersByTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServersDetailsRequest, ListServersDetailsResponse> listServersDetails =
        genForlistServersDetails();

    private static HttpRequestDef<ListServersDetailsRequest, ListServersDetailsResponse> genForlistServersDetails() {
        // basic
        HttpRequestDef.Builder<ListServersDetailsRequest, ListServersDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServersDetailsRequest.class, ListServersDetailsResponse.class)
                .withName("ListServersDetails")
                .withUri("/v1/{project_id}/cloudservers/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getFlavor, (req, v) -> {
                req.setFlavor(v);
            }));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("not-tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getNotTags, (req, v) -> {
                req.setNotTags(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("reservation_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getReservationId, (req, v) -> {
                req.setReservationId(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("ip_eq",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getIpEq, (req, v) -> {
                req.setIpEq(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateServerRequest, MigrateServerResponse> migrateServer =
        genFormigrateServer();

    private static HttpRequestDef<MigrateServerRequest, MigrateServerResponse> genFormigrateServer() {
        // basic
        HttpRequestDef.Builder<MigrateServerRequest, MigrateServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateServerRequest.class, MigrateServerResponse.class)
                .withName("MigrateServer")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/migrate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateServerRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<MigrateServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MigrateServerRequestBody.class),
            f -> f.withMarshaller(MigrateServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> novaAssociateSecurityGroup =
        genFornovaAssociateSecurityGroup();

    private static HttpRequestDef<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> genFornovaAssociateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    NovaAssociateSecurityGroupRequest.class,
                    NovaAssociateSecurityGroupResponse.class)
                .withName("NovaAssociateSecurityGroup")
                .withUri("/v2.1/{project_id}/servers/{server_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaAssociateSecurityGroupRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<NovaAssociateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NovaAssociateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(NovaAssociateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaCreateKeypairRequest, NovaCreateKeypairResponse> novaCreateKeypair =
        genFornovaCreateKeypair();

    private static HttpRequestDef<NovaCreateKeypairRequest, NovaCreateKeypairResponse> genFornovaCreateKeypair() {
        // basic
        HttpRequestDef.Builder<NovaCreateKeypairRequest, NovaCreateKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NovaCreateKeypairRequest.class, NovaCreateKeypairResponse.class)
                .withName("NovaCreateKeypair")
                .withUri("/v2.1/{project_id}/os-keypairs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("OpenStack-API-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaCreateKeypairRequest::getOpenStackAPIVersion, (req, v) -> {
                req.setOpenStackAPIVersion(v);
            }));
        builder.<NovaCreateKeypairRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NovaCreateKeypairRequestBody.class),
            f -> f.withMarshaller(NovaCreateKeypairRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaCreateServersRequest, NovaCreateServersResponse> novaCreateServers =
        genFornovaCreateServers();

    private static HttpRequestDef<NovaCreateServersRequest, NovaCreateServersResponse> genFornovaCreateServers() {
        // basic
        HttpRequestDef.Builder<NovaCreateServersRequest, NovaCreateServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NovaCreateServersRequest.class, NovaCreateServersResponse.class)
                .withName("NovaCreateServers")
                .withUri("/v2.1/{project_id}/servers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("OpenStack-API-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaCreateServersRequest::getOpenStackAPIVersion, (req, v) -> {
                req.setOpenStackAPIVersion(v);
            }));
        builder.<NovaCreateServersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NovaCreateServersRequestBody.class),
            f -> f.withMarshaller(NovaCreateServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> novaDeleteKeypair =
        genFornovaDeleteKeypair();

    private static HttpRequestDef<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> genFornovaDeleteKeypair() {
        // basic
        HttpRequestDef.Builder<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, NovaDeleteKeypairRequest.class, NovaDeleteKeypairResponse.class)
                .withName("NovaDeleteKeypair")
                .withUri("/v2.1/{project_id}/os-keypairs/{keypair_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaDeleteKeypairRequest::getKeypairName, (req, v) -> {
                req.setKeypairName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaDeleteServerRequest, NovaDeleteServerResponse> novaDeleteServer =
        genFornovaDeleteServer();

    private static HttpRequestDef<NovaDeleteServerRequest, NovaDeleteServerResponse> genFornovaDeleteServer() {
        // basic
        HttpRequestDef.Builder<NovaDeleteServerRequest, NovaDeleteServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, NovaDeleteServerRequest.class, NovaDeleteServerResponse.class)
                .withName("NovaDeleteServer")
                .withUri("/v2.1/{project_id}/servers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaDeleteServerRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> novaDisassociateSecurityGroup =
        genFornovaDisassociateSecurityGroup();

    private static HttpRequestDef<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> genFornovaDisassociateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    NovaDisassociateSecurityGroupRequest.class,
                    NovaDisassociateSecurityGroupResponse.class)
                .withName("NovaDisassociateSecurityGroup")
                .withUri("/v2.1/{project_id}/servers/{server_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaDisassociateSecurityGroupRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<NovaDisassociateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NovaDisassociateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(NovaDisassociateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> novaListAvailabilityZones =
        genFornovaListAvailabilityZones();

    private static HttpRequestDef<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> genFornovaListAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    NovaListAvailabilityZonesRequest.class,
                    NovaListAvailabilityZonesResponse.class)
                .withName("NovaListAvailabilityZones")
                .withUri("/v2.1/{project_id}/os-availability-zone")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaListKeypairsRequest, NovaListKeypairsResponse> novaListKeypairs =
        genFornovaListKeypairs();

    private static HttpRequestDef<NovaListKeypairsRequest, NovaListKeypairsResponse> genFornovaListKeypairs() {
        // basic
        HttpRequestDef.Builder<NovaListKeypairsRequest, NovaListKeypairsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NovaListKeypairsRequest.class, NovaListKeypairsResponse.class)
                .withName("NovaListKeypairs")
                .withUri("/v2.1/{project_id}/os-keypairs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NovaListKeypairsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListKeypairsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("OpenStack-API-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListKeypairsRequest::getOpenStackAPIVersion, (req, v) -> {
                req.setOpenStackAPIVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> novaListServerSecurityGroups =
        genFornovaListServerSecurityGroups();

    private static HttpRequestDef<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> genFornovaListServerSecurityGroups() {
        // basic
        HttpRequestDef.Builder<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    NovaListServerSecurityGroupsRequest.class,
                    NovaListServerSecurityGroupsResponse.class)
                .withName("NovaListServerSecurityGroups")
                .withUri("/v2.1/{project_id}/servers/{server_id}/os-security-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServerSecurityGroupsRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaListServersDetailsRequest, NovaListServersDetailsResponse> novaListServersDetails =
        genFornovaListServersDetails();

    private static HttpRequestDef<NovaListServersDetailsRequest, NovaListServersDetailsResponse> genFornovaListServersDetails() {
        // basic
        HttpRequestDef.Builder<NovaListServersDetailsRequest, NovaListServersDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, NovaListServersDetailsRequest.class, NovaListServersDetailsResponse.class)
            .withName("NovaListServersDetails")
            .withUri("/v2.1/{project_id}/servers/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("changes-since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getChangesSince, (req, v) -> {
                req.setChangesSince(v);
            }));
        builder.<String>withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getFlavor, (req, v) -> {
                req.setFlavor(v);
            }));
        builder.<String>withRequestField("image",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getImage, (req, v) -> {
                req.setImage(v);
            }));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("not-tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getNotTags, (req, v) -> {
                req.setNotTags(v);
            }));
        builder.<String>withRequestField("reservation_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getReservationId, (req, v) -> {
                req.setReservationId(v);
            }));
        builder.<NovaListServersDetailsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(NovaListServersDetailsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<NovaListServersDetailsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(NovaListServersDetailsRequest.StatusEnum.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("OpenStack-API-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getOpenStackAPIVersion, (req, v) -> {
                req.setOpenStackAPIVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaShowKeypairRequest, NovaShowKeypairResponse> novaShowKeypair =
        genFornovaShowKeypair();

    private static HttpRequestDef<NovaShowKeypairRequest, NovaShowKeypairResponse> genFornovaShowKeypair() {
        // basic
        HttpRequestDef.Builder<NovaShowKeypairRequest, NovaShowKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NovaShowKeypairRequest.class, NovaShowKeypairResponse.class)
                .withName("NovaShowKeypair")
                .withUri("/v2.1/{project_id}/os-keypairs/{keypair_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaShowKeypairRequest::getKeypairName, (req, v) -> {
                req.setKeypairName(v);
            }));
        builder.<String>withRequestField("OpenStack-API-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaShowKeypairRequest::getOpenStackAPIVersion, (req, v) -> {
                req.setOpenStackAPIVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaShowServerRequest, NovaShowServerResponse> novaShowServer =
        genFornovaShowServer();

    private static HttpRequestDef<NovaShowServerRequest, NovaShowServerResponse> genFornovaShowServer() {
        // basic
        HttpRequestDef.Builder<NovaShowServerRequest, NovaShowServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NovaShowServerRequest.class, NovaShowServerResponse.class)
                .withName("NovaShowServer")
                .withUri("/v2.1/{project_id}/servers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaShowServerRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<String>withRequestField("OpenStack-API-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaShowServerRequest::getOpenStackAPIVersion, (req, v) -> {
                req.setOpenStackAPIVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterServerAutoRecoveryRequest, RegisterServerAutoRecoveryResponse> registerServerAutoRecovery =
        genForregisterServerAutoRecovery();

    private static HttpRequestDef<RegisterServerAutoRecoveryRequest, RegisterServerAutoRecoveryResponse> genForregisterServerAutoRecovery() {
        // basic
        HttpRequestDef.Builder<RegisterServerAutoRecoveryRequest, RegisterServerAutoRecoveryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    RegisterServerAutoRecoveryRequest.class,
                    RegisterServerAutoRecoveryResponse.class)
                .withName("RegisterServerAutoRecovery")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/autorecovery")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterServerAutoRecoveryRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<RegisterServerAutoRecoveryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterServerAutoRecoveryRequestBody.class),
            f -> f.withMarshaller(RegisterServerAutoRecoveryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterServerMonitorRequest, RegisterServerMonitorResponse> registerServerMonitor =
        genForregisterServerMonitor();

    private static HttpRequestDef<RegisterServerMonitorRequest, RegisterServerMonitorResponse> genForregisterServerMonitor() {
        // basic
        HttpRequestDef.Builder<RegisterServerMonitorRequest, RegisterServerMonitorResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RegisterServerMonitorRequest.class, RegisterServerMonitorResponse.class)
            .withName("RegisterServerMonitor")
            .withUri("/v1.0/servers/{server_id}/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterServerMonitorRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<RegisterServerMonitorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterServerMonitorRequestBody.class),
            f -> f.withMarshaller(RegisterServerMonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> reinstallServerWithCloudInit =
        genForreinstallServerWithCloudInit();

    private static HttpRequestDef<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> genForreinstallServerWithCloudInit() {
        // basic
        HttpRequestDef.Builder<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ReinstallServerWithCloudInitRequest.class,
                    ReinstallServerWithCloudInitResponse.class)
                .withName("ReinstallServerWithCloudInit")
                .withUri("/v2/{project_id}/cloudservers/{server_id}/reinstallos")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ReinstallServerWithCloudInitRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<ReinstallServerWithCloudInitRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReinstallServerWithCloudInitRequestBody.class),
            f -> f.withMarshaller(ReinstallServerWithCloudInitRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse> reinstallServerWithoutCloudInit =
        genForreinstallServerWithoutCloudInit();

    private static HttpRequestDef<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse> genForreinstallServerWithoutCloudInit() {
        // basic
        HttpRequestDef.Builder<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ReinstallServerWithoutCloudInitRequest.class,
                    ReinstallServerWithoutCloudInitResponse.class)
                .withName("ReinstallServerWithoutCloudInit")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/reinstallos")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ReinstallServerWithoutCloudInitRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<ReinstallServerWithoutCloudInitRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReinstallServerWithoutCloudInitRequestBody.class),
            f -> f.withMarshaller(ReinstallServerWithoutCloudInitRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetServerPasswordRequest, ResetServerPasswordResponse> resetServerPassword =
        genForresetServerPassword();

    private static HttpRequestDef<ResetServerPasswordRequest, ResetServerPasswordResponse> genForresetServerPassword() {
        // basic
        HttpRequestDef.Builder<ResetServerPasswordRequest, ResetServerPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetServerPasswordRequest.class, ResetServerPasswordResponse.class)
                .withName("ResetServerPassword")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/os-reset-password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetServerPasswordRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<ResetServerPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetServerPasswordRequestBody.class),
            f -> f.withMarshaller(ResetServerPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizePostPaidServerRequest, ResizePostPaidServerResponse> resizePostPaidServer =
        genForresizePostPaidServer();

    private static HttpRequestDef<ResizePostPaidServerRequest, ResizePostPaidServerResponse> genForresizePostPaidServer() {
        // basic
        HttpRequestDef.Builder<ResizePostPaidServerRequest, ResizePostPaidServerResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResizePostPaidServerRequest.class, ResizePostPaidServerResponse.class)
            .withName("ResizePostPaidServer")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/resize")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizePostPaidServerRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<ResizePostPaidServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizePostPaidServerRequestBody.class),
            f -> f.withMarshaller(ResizePostPaidServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeServerRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<ResizeServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeServerRequestBody.class),
            f -> f.withMarshaller(ResizeServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> showResetPasswordFlag =
        genForshowResetPasswordFlag();

    private static HttpRequestDef<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> genForshowResetPasswordFlag() {
        // basic
        HttpRequestDef.Builder<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowResetPasswordFlagRequest.class, ShowResetPasswordFlagResponse.class)
            .withName("ShowResetPasswordFlag")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/os-resetpwd-flag")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResetPasswordFlagRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

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
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerAutoRecoveryRequest, ShowServerAutoRecoveryResponse> showServerAutoRecovery =
        genForshowServerAutoRecovery();

    private static HttpRequestDef<ShowServerAutoRecoveryRequest, ShowServerAutoRecoveryResponse> genForshowServerAutoRecovery() {
        // basic
        HttpRequestDef.Builder<ShowServerAutoRecoveryRequest, ShowServerAutoRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowServerAutoRecoveryRequest.class, ShowServerAutoRecoveryResponse.class)
            .withName("ShowServerAutoRecovery")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/autorecovery")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerAutoRecoveryRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse> showServerBlockDevice =
        genForshowServerBlockDevice();

    private static HttpRequestDef<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse> genForshowServerBlockDevice() {
        // basic
        HttpRequestDef.Builder<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowServerBlockDeviceRequest.class, ShowServerBlockDeviceResponse.class)
            .withName("ShowServerBlockDevice")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/block_device/{volume_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerBlockDeviceRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerBlockDeviceRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerGroupRequest, ShowServerGroupResponse> showServerGroup =
        genForshowServerGroup();

    private static HttpRequestDef<ShowServerGroupRequest, ShowServerGroupResponse> genForshowServerGroup() {
        // basic
        HttpRequestDef.Builder<ShowServerGroupRequest, ShowServerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerGroupRequest.class, ShowServerGroupResponse.class)
                .withName("ShowServerGroup")
                .withUri("/v1/{project_id}/cloudservers/os-server-groups/{server_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerGroupRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerLimitsRequest, ShowServerLimitsResponse> showServerLimits =
        genForshowServerLimits();

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

    public static final HttpRequestDef<ShowServerPasswordRequest, ShowServerPasswordResponse> showServerPassword =
        genForshowServerPassword();

    private static HttpRequestDef<ShowServerPasswordRequest, ShowServerPasswordResponse> genForshowServerPassword() {
        // basic
        HttpRequestDef.Builder<ShowServerPasswordRequest, ShowServerPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerPasswordRequest.class, ShowServerPasswordResponse.class)
                .withName("ShowServerPassword")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/os-server-password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerPasswordRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> showServerRemoteConsole =
        genForshowServerRemoteConsole();

    private static HttpRequestDef<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> genForshowServerRemoteConsole() {
        // basic
        HttpRequestDef.Builder<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowServerRemoteConsoleRequest.class, ShowServerRemoteConsoleResponse.class)
            .withName("ShowServerRemoteConsole")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/remote_console")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerRemoteConsoleRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<ShowServerRemoteConsoleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowServerRemoteConsoleRequestBody.class),
            f -> f.withMarshaller(ShowServerRemoteConsoleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerTagsRequest, ShowServerTagsResponse> showServerTags =
        genForshowServerTags();

    private static HttpRequestDef<ShowServerTagsRequest, ShowServerTagsResponse> genForshowServerTags() {
        // basic
        HttpRequestDef.Builder<ShowServerTagsRequest, ShowServerTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerTagsRequest.class, ShowServerTagsResponse.class)
                .withName("ShowServerTags")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerTagsRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

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
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<UpdateServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerRequestBody.class),
            f -> f.withMarshaller(UpdateServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> updateServerAutoTerminateTime =
        genForupdateServerAutoTerminateTime();

    private static HttpRequestDef<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> genForupdateServerAutoTerminateTime() {
        // basic
        HttpRequestDef.Builder<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateServerAutoTerminateTimeRequest.class,
                    UpdateServerAutoTerminateTimeResponse.class)
                .withName("UpdateServerAutoTerminateTime")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/actions/update-auto-terminate-time")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerAutoTerminateTimeRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<UpdateServerAutoTerminateTimeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerAutoTerminateTimeRequestBody.class),
            f -> f.withMarshaller(UpdateServerAutoTerminateTimeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerBlockDeviceRequest, UpdateServerBlockDeviceResponse> updateServerBlockDevice =
        genForupdateServerBlockDevice();

    private static HttpRequestDef<UpdateServerBlockDeviceRequest, UpdateServerBlockDeviceResponse> genForupdateServerBlockDevice() {
        // basic
        HttpRequestDef.Builder<UpdateServerBlockDeviceRequest, UpdateServerBlockDeviceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateServerBlockDeviceRequest.class, UpdateServerBlockDeviceResponse.class)
            .withName("UpdateServerBlockDevice")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/block_device/{volume_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerBlockDeviceRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerBlockDeviceRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            }));
        builder.<UpdateServerBlockDeviceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerBlockDeviceReq.class),
            f -> f.withMarshaller(UpdateServerBlockDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerMetadataRequest, UpdateServerMetadataResponse> updateServerMetadata =
        genForupdateServerMetadata();

    private static HttpRequestDef<UpdateServerMetadataRequest, UpdateServerMetadataResponse> genForupdateServerMetadata() {
        // basic
        HttpRequestDef.Builder<UpdateServerMetadataRequest, UpdateServerMetadataResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateServerMetadataRequest.class, UpdateServerMetadataResponse.class)
            .withName("UpdateServerMetadata")
            .withUri("/v1/{project_id}/cloudservers/{server_id}/metadata")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerMetadataRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<UpdateServerMetadataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerMetadataRequestBody.class),
            f -> f.withMarshaller(UpdateServerMetadataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

}
