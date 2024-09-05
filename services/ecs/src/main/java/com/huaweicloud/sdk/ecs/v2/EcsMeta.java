package com.huaweicloud.sdk.ecs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ecs.v2.model.AddServerGroupMemberRequest;
import com.huaweicloud.sdk.ecs.v2.model.AddServerGroupMemberRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.AddServerGroupMemberResponse;
import com.huaweicloud.sdk.ecs.v2.model.AssociateServerVirtualIpRequest;
import com.huaweicloud.sdk.ecs.v2.model.AssociateServerVirtualIpRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.AssociateServerVirtualIpResponse;
import com.huaweicloud.sdk.ecs.v2.model.AttachServerVolumeRequest;
import com.huaweicloud.sdk.ecs.v2.model.AttachServerVolumeRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.AttachServerVolumeResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchAddServerNicsRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchAddServerNicsRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.BatchAddServerNicsResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchAttachSharableVolumesRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchAttachSharableVolumesRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.BatchAttachSharableVolumesResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchCreateServerTagsRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchCreateServerTagsRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.BatchCreateServerTagsResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchDeleteServerNicsRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchDeleteServerNicsRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.BatchDeleteServerNicsResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchDeleteServerTagsRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchDeleteServerTagsRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.BatchDeleteServerTagsResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchRebootServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchRebootServersRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.BatchRebootServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchResetServersPasswordRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchResetServersPasswordRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.BatchResetServersPasswordResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchStartServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchStartServersRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.BatchStartServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchStopServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchStopServersRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.BatchStopServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchUpdateServersNameRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchUpdateServersNameRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.BatchUpdateServersNameResponse;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerChargeModeRequest;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerChargeModeRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerChargeModeResponse;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerNetworkInterfaceRequest;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerNetworkInterfaceRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerNetworkInterfaceResponse;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithCloudInitRequest;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithCloudInitRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithCloudInitResponse;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithoutCloudInitRequest;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithoutCloudInitRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithoutCloudInitResponse;
import com.huaweicloud.sdk.ecs.v2.model.ChangeVpcRequest;
import com.huaweicloud.sdk.ecs.v2.model.ChangeVpcRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.ChangeVpcResponse;
import com.huaweicloud.sdk.ecs.v2.model.CreatePostPaidServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.CreatePostPaidServersRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.CreatePostPaidServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.CreateServerGroupRequest;
import com.huaweicloud.sdk.ecs.v2.model.CreateServerGroupRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.CreateServerGroupResponse;
import com.huaweicloud.sdk.ecs.v2.model.CreateServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.CreateServersRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.CreateServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerGroupMemberRequest;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerGroupMemberRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerGroupMemberResponse;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerGroupRequest;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerGroupResponse;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerMetadataRequest;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerMetadataResponse;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerPasswordRequest;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerPasswordResponse;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServersRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.DetachServerVolumeRequest;
import com.huaweicloud.sdk.ecs.v2.model.DetachServerVolumeResponse;
import com.huaweicloud.sdk.ecs.v2.model.DisassociateServerVirtualIpRequest;
import com.huaweicloud.sdk.ecs.v2.model.DisassociateServerVirtualIpRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.DisassociateServerVirtualIpResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListCloudServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListCloudServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListFlavorSellPoliciesRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListFlavorSellPoliciesResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListFlavorsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListFlavorsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListResizeFlavorsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListResizeFlavorsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerBlockDevicesRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerBlockDevicesResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerGroupsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerGroupsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerInterfacesRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerInterfacesResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerTagsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerTagsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServersByTagRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServersByTagRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.ListServersByTagResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServersDetailsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServersDetailsResponse;
import com.huaweicloud.sdk.ecs.v2.model.MigrateServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.MigrateServerRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.MigrateServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaAssociateSecurityGroupRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaAssociateSecurityGroupRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.NovaAssociateSecurityGroupResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaAttachInterfaceRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaAttachInterfaceRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.NovaAttachInterfaceResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaCreateKeypairRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaCreateKeypairRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.NovaCreateKeypairResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaCreateServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaCreateServersRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.NovaCreateServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaDeleteKeypairRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaDeleteKeypairResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaDeleteServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaDeleteServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaDisassociateSecurityGroupRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaDisassociateSecurityGroupRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.NovaDisassociateSecurityGroupResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaListAvailabilityZonesRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaListAvailabilityZonesResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaListKeypairsRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaListKeypairsResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaListServerSecurityGroupsRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaListServerSecurityGroupsResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaListServersDetailsRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaListServersDetailsResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaListVersionsRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaListVersionsResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowKeypairRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowKeypairResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowServerInterfaceRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowServerInterfaceResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowVersionRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowVersionResponse;
import com.huaweicloud.sdk.ecs.v2.model.RegisterServerMonitorRequest;
import com.huaweicloud.sdk.ecs.v2.model.RegisterServerMonitorRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.RegisterServerMonitorResponse;
import com.huaweicloud.sdk.ecs.v2.model.ReinstallServerWithCloudInitRequest;
import com.huaweicloud.sdk.ecs.v2.model.ReinstallServerWithCloudInitRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.ReinstallServerWithCloudInitResponse;
import com.huaweicloud.sdk.ecs.v2.model.ReinstallServerWithoutCloudInitRequest;
import com.huaweicloud.sdk.ecs.v2.model.ReinstallServerWithoutCloudInitRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.ReinstallServerWithoutCloudInitResponse;
import com.huaweicloud.sdk.ecs.v2.model.ResetServerPasswordRequest;
import com.huaweicloud.sdk.ecs.v2.model.ResetServerPasswordRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.ResetServerPasswordResponse;
import com.huaweicloud.sdk.ecs.v2.model.ResizePostPaidServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.ResizePostPaidServerRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.ResizePostPaidServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.ResizeServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.ResizeServerRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.ResizeServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowJobRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowJobResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowResetPasswordFlagRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowResetPasswordFlagResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerBlockDeviceRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerBlockDeviceResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerGroupRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerGroupResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerLimitsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerLimitsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerPasswordRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerPasswordResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerRemoteConsoleRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerRemoteConsoleRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerRemoteConsoleResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerTagsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerTagsResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerAutoTerminateTimeRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerAutoTerminateTimeRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerAutoTerminateTimeResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerBlockDeviceReq;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerBlockDeviceRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerBlockDeviceResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerMetadataRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerMetadataRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerMetadataResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerRequestBody;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class EcsMeta {

    public static final HttpRequestDef<AddServerGroupMemberRequest, AddServerGroupMemberResponse> addServerGroupMember =
        genForAddServerGroupMember();

    private static HttpRequestDef<AddServerGroupMemberRequest, AddServerGroupMemberResponse> genForAddServerGroupMember() {
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
            f -> f.withMarshaller(AddServerGroupMemberRequest::getServerGroupId,
                AddServerGroupMemberRequest::setServerGroupId));
        builder.<AddServerGroupMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddServerGroupMemberRequestBody.class),
            f -> f.withMarshaller(AddServerGroupMemberRequest::getBody, AddServerGroupMemberRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse> associateServerVirtualIp =
        genForAssociateServerVirtualIp();

    private static HttpRequestDef<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse> genForAssociateServerVirtualIp() {
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
            f -> f.withMarshaller(AssociateServerVirtualIpRequest::getNicId,
                AssociateServerVirtualIpRequest::setNicId));
        builder.<AssociateServerVirtualIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateServerVirtualIpRequestBody.class),
            f -> f.withMarshaller(AssociateServerVirtualIpRequest::getBody, AssociateServerVirtualIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachServerVolumeRequest, AttachServerVolumeResponse> attachServerVolume =
        genForAttachServerVolume();

    private static HttpRequestDef<AttachServerVolumeRequest, AttachServerVolumeResponse> genForAttachServerVolume() {
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
            f -> f.withMarshaller(AttachServerVolumeRequest::getServerId, AttachServerVolumeRequest::setServerId));
        builder.<AttachServerVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachServerVolumeRequestBody.class),
            f -> f.withMarshaller(AttachServerVolumeRequest::getBody, AttachServerVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddServerNicsRequest, BatchAddServerNicsResponse> batchAddServerNics =
        genForBatchAddServerNics();

    private static HttpRequestDef<BatchAddServerNicsRequest, BatchAddServerNicsResponse> genForBatchAddServerNics() {
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
            f -> f.withMarshaller(BatchAddServerNicsRequest::getServerId, BatchAddServerNicsRequest::setServerId));
        builder.<BatchAddServerNicsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddServerNicsRequestBody.class),
            f -> f.withMarshaller(BatchAddServerNicsRequest::getBody, BatchAddServerNicsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse> batchAttachSharableVolumes =
        genForBatchAttachSharableVolumes();

    private static HttpRequestDef<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse> genForBatchAttachSharableVolumes() {
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
            f -> f.withMarshaller(BatchAttachSharableVolumesRequest::getVolumeId,
                BatchAttachSharableVolumesRequest::setVolumeId));
        builder.<BatchAttachSharableVolumesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAttachSharableVolumesRequestBody.class),
            f -> f.withMarshaller(BatchAttachSharableVolumesRequest::getBody,
                BatchAttachSharableVolumesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> batchCreateServerTags =
        genForBatchCreateServerTags();

    private static HttpRequestDef<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> genForBatchCreateServerTags() {
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
            f -> f.withMarshaller(BatchCreateServerTagsRequest::getServerId,
                BatchCreateServerTagsRequest::setServerId));
        builder.<BatchCreateServerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateServerTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateServerTagsRequest::getBody, BatchCreateServerTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> batchDeleteServerNics =
        genForBatchDeleteServerNics();

    private static HttpRequestDef<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> genForBatchDeleteServerNics() {
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
            f -> f.withMarshaller(BatchDeleteServerNicsRequest::getServerId,
                BatchDeleteServerNicsRequest::setServerId));
        builder.<BatchDeleteServerNicsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteServerNicsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteServerNicsRequest::getBody, BatchDeleteServerNicsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> batchDeleteServerTags =
        genForBatchDeleteServerTags();

    private static HttpRequestDef<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> genForBatchDeleteServerTags() {
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
            f -> f.withMarshaller(BatchDeleteServerTagsRequest::getServerId,
                BatchDeleteServerTagsRequest::setServerId));
        builder.<BatchDeleteServerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteServerTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteServerTagsRequest::getBody, BatchDeleteServerTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRebootServersRequest, BatchRebootServersResponse> batchRebootServers =
        genForBatchRebootServers();

    private static HttpRequestDef<BatchRebootServersRequest, BatchRebootServersResponse> genForBatchRebootServers() {
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
            f -> f.withMarshaller(BatchRebootServersRequest::getBody, BatchRebootServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse> batchResetServersPassword =
        genForBatchResetServersPassword();

    private static HttpRequestDef<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse> genForBatchResetServersPassword() {
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
            f -> f.withMarshaller(BatchResetServersPasswordRequest::getBody,
                BatchResetServersPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartServersRequest, BatchStartServersResponse> batchStartServers =
        genForBatchStartServers();

    private static HttpRequestDef<BatchStartServersRequest, BatchStartServersResponse> genForBatchStartServers() {
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
            f -> f.withMarshaller(BatchStartServersRequest::getBody, BatchStartServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopServersRequest, BatchStopServersResponse> batchStopServers =
        genForBatchStopServers();

    private static HttpRequestDef<BatchStopServersRequest, BatchStopServersResponse> genForBatchStopServers() {
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
            f -> f.withMarshaller(BatchStopServersRequest::getBody, BatchStopServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse> batchUpdateServersName =
        genForBatchUpdateServersName();

    private static HttpRequestDef<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse> genForBatchUpdateServersName() {
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
            f -> f.withMarshaller(BatchUpdateServersNameRequest::getBody, BatchUpdateServersNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeServerChargeModeRequest, ChangeServerChargeModeResponse> changeServerChargeMode =
        genForChangeServerChargeMode();

    private static HttpRequestDef<ChangeServerChargeModeRequest, ChangeServerChargeModeResponse> genForChangeServerChargeMode() {
        // basic
        HttpRequestDef.Builder<ChangeServerChargeModeRequest, ChangeServerChargeModeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeServerChargeModeRequest.class, ChangeServerChargeModeResponse.class)
            .withName("ChangeServerChargeMode")
            .withUri("/v1/{project_id}/cloudservers/actions/change-charge-mode")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ChangeServerChargeModeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeServerChargeModeRequestBody.class),
            f -> f.withMarshaller(ChangeServerChargeModeRequest::getBody, ChangeServerChargeModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeServerNetworkInterfaceRequest, ChangeServerNetworkInterfaceResponse> changeServerNetworkInterface =
        genForChangeServerNetworkInterface();

    private static HttpRequestDef<ChangeServerNetworkInterfaceRequest, ChangeServerNetworkInterfaceResponse> genForChangeServerNetworkInterface() {
        // basic
        HttpRequestDef.Builder<ChangeServerNetworkInterfaceRequest, ChangeServerNetworkInterfaceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeServerNetworkInterfaceRequest.class,
                    ChangeServerNetworkInterfaceResponse.class)
                .withName("ChangeServerNetworkInterface")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/os-interface/{port_id}/change-network-interface")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeServerNetworkInterfaceRequest::getPortId,
                ChangeServerNetworkInterfaceRequest::setPortId));
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeServerNetworkInterfaceRequest::getServerId,
                ChangeServerNetworkInterfaceRequest::setServerId));
        builder.<ChangeServerNetworkInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeServerNetworkInterfaceRequestBody.class),
            f -> f.withMarshaller(ChangeServerNetworkInterfaceRequest::getBody,
                ChangeServerNetworkInterfaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> changeServerOsWithCloudInit =
        genForChangeServerOsWithCloudInit();

    private static HttpRequestDef<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> genForChangeServerOsWithCloudInit() {
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
            f -> f.withMarshaller(ChangeServerOsWithCloudInitRequest::getServerId,
                ChangeServerOsWithCloudInitRequest::setServerId));
        builder.<ChangeServerOsWithCloudInitRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeServerOsWithCloudInitRequestBody.class),
            f -> f.withMarshaller(ChangeServerOsWithCloudInitRequest::getBody,
                ChangeServerOsWithCloudInitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse> changeServerOsWithoutCloudInit =
        genForChangeServerOsWithoutCloudInit();

    private static HttpRequestDef<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse> genForChangeServerOsWithoutCloudInit() {
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
            f -> f.withMarshaller(ChangeServerOsWithoutCloudInitRequest::getServerId,
                ChangeServerOsWithoutCloudInitRequest::setServerId));
        builder.<ChangeServerOsWithoutCloudInitRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeServerOsWithoutCloudInitRequestBody.class),
            f -> f.withMarshaller(ChangeServerOsWithoutCloudInitRequest::getBody,
                ChangeServerOsWithoutCloudInitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeVpcRequest, ChangeVpcResponse> changeVpc = genForChangeVpc();

    private static HttpRequestDef<ChangeVpcRequest, ChangeVpcResponse> genForChangeVpc() {
        // basic
        HttpRequestDef.Builder<ChangeVpcRequest, ChangeVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeVpcRequest.class, ChangeVpcResponse.class)
                .withName("ChangeVpc")
                .withUri("/v1/{project_id}/cloudservers/{server_id}/changevpc")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeVpcRequest::getServerId, ChangeVpcRequest::setServerId));
        builder.<ChangeVpcRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeVpcRequestBody.class),
            f -> f.withMarshaller(ChangeVpcRequest::getBody, ChangeVpcRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostPaidServersRequest, CreatePostPaidServersResponse> createPostPaidServers =
        genForCreatePostPaidServers();

    private static HttpRequestDef<CreatePostPaidServersRequest, CreatePostPaidServersResponse> genForCreatePostPaidServers() {
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
            f -> f.withMarshaller(CreatePostPaidServersRequest::getXClientToken,
                CreatePostPaidServersRequest::setXClientToken));
        builder.<CreatePostPaidServersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePostPaidServersRequestBody.class),
            f -> f.withMarshaller(CreatePostPaidServersRequest::getBody, CreatePostPaidServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroup =
        genForCreateServerGroup();

    private static HttpRequestDef<CreateServerGroupRequest, CreateServerGroupResponse> genForCreateServerGroup() {
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
            f -> f.withMarshaller(CreateServerGroupRequest::getBody, CreateServerGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServersRequest, CreateServersResponse> createServers =
        genForCreateServers();

    private static HttpRequestDef<CreateServersRequest, CreateServersResponse> genForCreateServers() {
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
            f -> f.withMarshaller(CreateServersRequest::getXClientToken, CreateServersRequest::setXClientToken));
        builder.<CreateServersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateServersRequestBody.class),
            f -> f.withMarshaller(CreateServersRequest::getBody, CreateServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerGroupRequest, DeleteServerGroupResponse> deleteServerGroup =
        genForDeleteServerGroup();

    private static HttpRequestDef<DeleteServerGroupRequest, DeleteServerGroupResponse> genForDeleteServerGroup() {
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
            f -> f.withMarshaller(DeleteServerGroupRequest::getServerGroupId,
                DeleteServerGroupRequest::setServerGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> deleteServerGroupMember =
        genForDeleteServerGroupMember();

    private static HttpRequestDef<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> genForDeleteServerGroupMember() {
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
            f -> f.withMarshaller(DeleteServerGroupMemberRequest::getServerGroupId,
                DeleteServerGroupMemberRequest::setServerGroupId));
        builder.<DeleteServerGroupMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteServerGroupMemberRequestBody.class),
            f -> f.withMarshaller(DeleteServerGroupMemberRequest::getBody, DeleteServerGroupMemberRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerMetadataRequest, DeleteServerMetadataResponse> deleteServerMetadata =
        genForDeleteServerMetadata();

    private static HttpRequestDef<DeleteServerMetadataRequest, DeleteServerMetadataResponse> genForDeleteServerMetadata() {
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
            f -> f.withMarshaller(DeleteServerMetadataRequest::getKey, DeleteServerMetadataRequest::setKey));
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerMetadataRequest::getServerId, DeleteServerMetadataRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerPasswordRequest, DeleteServerPasswordResponse> deleteServerPassword =
        genForDeleteServerPassword();

    private static HttpRequestDef<DeleteServerPasswordRequest, DeleteServerPasswordResponse> genForDeleteServerPassword() {
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
            f -> f.withMarshaller(DeleteServerPasswordRequest::getServerId, DeleteServerPasswordRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServersRequest, DeleteServersResponse> deleteServers =
        genForDeleteServers();

    private static HttpRequestDef<DeleteServersRequest, DeleteServersResponse> genForDeleteServers() {
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
            f -> f.withMarshaller(DeleteServersRequest::getBody, DeleteServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachServerVolumeRequest, DetachServerVolumeResponse> detachServerVolume =
        genForDetachServerVolume();

    private static HttpRequestDef<DetachServerVolumeRequest, DetachServerVolumeResponse> genForDetachServerVolume() {
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
            f -> f.withMarshaller(DetachServerVolumeRequest::getServerId, DetachServerVolumeRequest::setServerId));
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachServerVolumeRequest::getVolumeId, DetachServerVolumeRequest::setVolumeId));
        builder.<DetachServerVolumeRequest.DeleteFlagEnum>withRequestField("delete_flag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DetachServerVolumeRequest.DeleteFlagEnum.class),
            f -> f.withMarshaller(DetachServerVolumeRequest::getDeleteFlag, DetachServerVolumeRequest::setDeleteFlag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse> disassociateServerVirtualIp =
        genForDisassociateServerVirtualIp();

    private static HttpRequestDef<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse> genForDisassociateServerVirtualIp() {
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
            f -> f.withMarshaller(DisassociateServerVirtualIpRequest::getNicId,
                DisassociateServerVirtualIpRequest::setNicId));
        builder.<DisassociateServerVirtualIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateServerVirtualIpRequestBody.class),
            f -> f.withMarshaller(DisassociateServerVirtualIpRequest::getBody,
                DisassociateServerVirtualIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudServersRequest, ListCloudServersResponse> listCloudServers =
        genForListCloudServers();

    private static HttpRequestDef<ListCloudServersRequest, ListCloudServersResponse> genForListCloudServers() {
        // basic
        HttpRequestDef.Builder<ListCloudServersRequest, ListCloudServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCloudServersRequest.class, ListCloudServersResponse.class)
                .withName("ListCloudServers")
                .withUri("/v1.1/{project_id}/cloudservers/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getId, ListCloudServersRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getName, ListCloudServersRequest::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getStatus, ListCloudServersRequest::setStatus));
        builder.<Boolean>withRequestField("in_recycle_bin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCloudServersRequest::getInRecycleBin, ListCloudServersRequest::setInRecycleBin));
        builder.<String>withRequestField("spod_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getSpodId, ListCloudServersRequest::setSpodId));
        builder.<String>withRequestField("flavor_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getFlavorName, ListCloudServersRequest::setFlavorName));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getImageId, ListCloudServersRequest::setImageId));
        builder.<String>withRequestField("metadata",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getMetadata, ListCloudServersRequest::setMetadata));
        builder.<String>withRequestField("metadata-key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getMetadataKey, ListCloudServersRequest::setMetadataKey));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getTags, ListCloudServersRequest::setTags));
        builder.<String>withRequestField("not-tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getNotTags, ListCloudServersRequest::setNotTags));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getAvailabilityZone,
                ListCloudServersRequest::setAvailabilityZone));
        builder.<String>withRequestField("availability_zone_eq",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getAvailabilityZoneEq,
                ListCloudServersRequest::setAvailabilityZoneEq));
        builder.<String>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getChargingMode, ListCloudServersRequest::setChargingMode));
        builder.<String>withRequestField("key_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getKeyName, ListCloudServersRequest::setKeyName));
        builder.<String>withRequestField("launched_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getLaunchedSince,
                ListCloudServersRequest::setLaunchedSince));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getEnterpriseProjectId,
                ListCloudServersRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("expect-fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudServersRequest::getExpectFields, ListCloudServersRequest::setExpectFields));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudServersRequest::getLimit, ListCloudServersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudServersRequest::getMarker, ListCloudServersRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorSellPoliciesRequest, ListFlavorSellPoliciesResponse> listFlavorSellPolicies =
        genForListFlavorSellPolicies();

    private static HttpRequestDef<ListFlavorSellPoliciesRequest, ListFlavorSellPoliciesResponse> genForListFlavorSellPolicies() {
        // basic
        HttpRequestDef.Builder<ListFlavorSellPoliciesRequest, ListFlavorSellPoliciesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFlavorSellPoliciesRequest.class, ListFlavorSellPoliciesResponse.class)
            .withName("ListFlavorSellPolicies")
            .withUri("/v1/{project_id}/cloudservers/flavor-sell-policies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorSellPoliciesRequest::getFlavorId,
                ListFlavorSellPoliciesRequest::setFlavorId));
        builder.<ListFlavorSellPoliciesRequest.SellStatusEnum>withRequestField("sell_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlavorSellPoliciesRequest.SellStatusEnum.class),
            f -> f.withMarshaller(ListFlavorSellPoliciesRequest::getSellStatus,
                ListFlavorSellPoliciesRequest::setSellStatus));
        builder.<ListFlavorSellPoliciesRequest.SellModeEnum>withRequestField("sell_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlavorSellPoliciesRequest.SellModeEnum.class),
            f -> f.withMarshaller(ListFlavorSellPoliciesRequest::getSellMode,
                ListFlavorSellPoliciesRequest::setSellMode));
        builder.<String>withRequestField("availability_zone_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorSellPoliciesRequest::getAvailabilityZoneId,
                ListFlavorSellPoliciesRequest::setAvailabilityZoneId));
        builder.<Integer>withRequestField("longest_spot_duration_hours_gt",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorSellPoliciesRequest::getLongestSpotDurationHoursGt,
                ListFlavorSellPoliciesRequest::setLongestSpotDurationHoursGt));
        builder.<Integer>withRequestField("largest_spot_duration_count_gt",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorSellPoliciesRequest::getLargestSpotDurationCountGt,
                ListFlavorSellPoliciesRequest::setLargestSpotDurationCountGt));
        builder.<Integer>withRequestField("longest_spot_duration_hours",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorSellPoliciesRequest::getLongestSpotDurationHours,
                ListFlavorSellPoliciesRequest::setLongestSpotDurationHours));
        builder.<Integer>withRequestField("largest_spot_duration_count",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorSellPoliciesRequest::getLargestSpotDurationCount,
                ListFlavorSellPoliciesRequest::setLargestSpotDurationCount));
        builder.<ListFlavorSellPoliciesRequest.InterruptionPolicyEnum>withRequestField("interruption_policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlavorSellPoliciesRequest.InterruptionPolicyEnum.class),
            f -> f.withMarshaller(ListFlavorSellPoliciesRequest::getInterruptionPolicy,
                ListFlavorSellPoliciesRequest::setInterruptionPolicy));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorSellPoliciesRequest::getLimit, ListFlavorSellPoliciesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorSellPoliciesRequest::getMarker, ListFlavorSellPoliciesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForListFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForListFlavors() {
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
            f -> f.withMarshaller(ListFlavorsRequest::getAvailabilityZone, ListFlavorsRequest::setAvailabilityZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResizeFlavorsRequest, ListResizeFlavorsResponse> listResizeFlavors =
        genForListResizeFlavors();

    private static HttpRequestDef<ListResizeFlavorsRequest, ListResizeFlavorsResponse> genForListResizeFlavors() {
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
            f -> f.withMarshaller(ListResizeFlavorsRequest::getInstanceUuid,
                ListResizeFlavorsRequest::setInstanceUuid));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResizeFlavorsRequest::getLimit, ListResizeFlavorsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResizeFlavorsRequest::getMarker, ListResizeFlavorsRequest::setMarker));
        builder.<ListResizeFlavorsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResizeFlavorsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListResizeFlavorsRequest::getSortDir, ListResizeFlavorsRequest::setSortDir));
        builder.<ListResizeFlavorsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResizeFlavorsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListResizeFlavorsRequest::getSortKey, ListResizeFlavorsRequest::setSortKey));
        builder.<String>withRequestField("source_flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResizeFlavorsRequest::getSourceFlavorId,
                ListResizeFlavorsRequest::setSourceFlavorId));
        builder.<String>withRequestField("source_flavor_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResizeFlavorsRequest::getSourceFlavorName,
                ListResizeFlavorsRequest::setSourceFlavorName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> listServerBlockDevices =
        genForListServerBlockDevices();

    private static HttpRequestDef<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> genForListServerBlockDevices() {
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
            f -> f.withMarshaller(ListServerBlockDevicesRequest::getServerId,
                ListServerBlockDevicesRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroups =
        genForListServerGroups();

    private static HttpRequestDef<ListServerGroupsRequest, ListServerGroupsResponse> genForListServerGroups() {
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
            f -> f.withMarshaller(ListServerGroupsRequest::getLimit, ListServerGroupsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getMarker, ListServerGroupsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerInterfacesRequest, ListServerInterfacesResponse> listServerInterfaces =
        genForListServerInterfaces();

    private static HttpRequestDef<ListServerInterfacesRequest, ListServerInterfacesResponse> genForListServerInterfaces() {
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
            f -> f.withMarshaller(ListServerInterfacesRequest::getServerId, ListServerInterfacesRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerTagsRequest, ListServerTagsResponse> listServerTags =
        genForListServerTags();

    private static HttpRequestDef<ListServerTagsRequest, ListServerTagsResponse> genForListServerTags() {
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
        genForListServersByTag();

    private static HttpRequestDef<ListServersByTagRequest, ListServersByTagResponse> genForListServersByTag() {
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
            f -> f.withMarshaller(ListServersByTagRequest::getBody, ListServersByTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServersDetailsRequest, ListServersDetailsResponse> listServersDetails =
        genForListServersDetails();

    private static HttpRequestDef<ListServersDetailsRequest, ListServersDetailsResponse> genForListServersDetails() {
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
            f -> f.withMarshaller(ListServersDetailsRequest::getEnterpriseProjectId,
                ListServersDetailsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getFlavor, ListServersDetailsRequest::setFlavor));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getIp, ListServersDetailsRequest::setIp));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getLimit, ListServersDetailsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getName, ListServersDetailsRequest::setName));
        builder.<String>withRequestField("not-tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getNotTags, ListServersDetailsRequest::setNotTags));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getOffset, ListServersDetailsRequest::setOffset));
        builder.<String>withRequestField("reservation_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getReservationId,
                ListServersDetailsRequest::setReservationId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getStatus, ListServersDetailsRequest::setStatus));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getTags, ListServersDetailsRequest::setTags));
        builder.<String>withRequestField("ip_eq",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getIpEq, ListServersDetailsRequest::setIpEq));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDetailsRequest::getServerId, ListServersDetailsRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateServerRequest, MigrateServerResponse> migrateServer =
        genForMigrateServer();

    private static HttpRequestDef<MigrateServerRequest, MigrateServerResponse> genForMigrateServer() {
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
            f -> f.withMarshaller(MigrateServerRequest::getServerId, MigrateServerRequest::setServerId));
        builder.<MigrateServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MigrateServerRequestBody.class),
            f -> f.withMarshaller(MigrateServerRequest::getBody, MigrateServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> novaAssociateSecurityGroup =
        genForNovaAssociateSecurityGroup();

    private static HttpRequestDef<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> genForNovaAssociateSecurityGroup() {
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
            f -> f.withMarshaller(NovaAssociateSecurityGroupRequest::getServerId,
                NovaAssociateSecurityGroupRequest::setServerId));
        builder.<NovaAssociateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NovaAssociateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(NovaAssociateSecurityGroupRequest::getBody,
                NovaAssociateSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse> novaAttachInterface =
        genForNovaAttachInterface();

    private static HttpRequestDef<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse> genForNovaAttachInterface() {
        // basic
        HttpRequestDef.Builder<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NovaAttachInterfaceRequest.class, NovaAttachInterfaceResponse.class)
                .withName("NovaAttachInterface")
                .withUri("/v2.1/{project_id}/servers/{server_id}/os-interface")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaAttachInterfaceRequest::getServerId, NovaAttachInterfaceRequest::setServerId));
        builder.<NovaAttachInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NovaAttachInterfaceRequestBody.class),
            f -> f.withMarshaller(NovaAttachInterfaceRequest::getBody, NovaAttachInterfaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaCreateKeypairRequest, NovaCreateKeypairResponse> novaCreateKeypair =
        genForNovaCreateKeypair();

    private static HttpRequestDef<NovaCreateKeypairRequest, NovaCreateKeypairResponse> genForNovaCreateKeypair() {
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
            f -> f.withMarshaller(NovaCreateKeypairRequest::getOpenStackAPIVersion,
                NovaCreateKeypairRequest::setOpenStackAPIVersion));
        builder.<NovaCreateKeypairRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NovaCreateKeypairRequestBody.class),
            f -> f.withMarshaller(NovaCreateKeypairRequest::getBody, NovaCreateKeypairRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaCreateServersRequest, NovaCreateServersResponse> novaCreateServers =
        genForNovaCreateServers();

    private static HttpRequestDef<NovaCreateServersRequest, NovaCreateServersResponse> genForNovaCreateServers() {
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
            f -> f.withMarshaller(NovaCreateServersRequest::getOpenStackAPIVersion,
                NovaCreateServersRequest::setOpenStackAPIVersion));
        builder.<NovaCreateServersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NovaCreateServersRequestBody.class),
            f -> f.withMarshaller(NovaCreateServersRequest::getBody, NovaCreateServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> novaDeleteKeypair =
        genForNovaDeleteKeypair();

    private static HttpRequestDef<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> genForNovaDeleteKeypair() {
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
            f -> f.withMarshaller(NovaDeleteKeypairRequest::getKeypairName, NovaDeleteKeypairRequest::setKeypairName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaDeleteServerRequest, NovaDeleteServerResponse> novaDeleteServer =
        genForNovaDeleteServer();

    private static HttpRequestDef<NovaDeleteServerRequest, NovaDeleteServerResponse> genForNovaDeleteServer() {
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
            f -> f.withMarshaller(NovaDeleteServerRequest::getServerId, NovaDeleteServerRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> novaDisassociateSecurityGroup =
        genForNovaDisassociateSecurityGroup();

    private static HttpRequestDef<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> genForNovaDisassociateSecurityGroup() {
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
            f -> f.withMarshaller(NovaDisassociateSecurityGroupRequest::getServerId,
                NovaDisassociateSecurityGroupRequest::setServerId));
        builder.<NovaDisassociateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NovaDisassociateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(NovaDisassociateSecurityGroupRequest::getBody,
                NovaDisassociateSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> novaListAvailabilityZones =
        genForNovaListAvailabilityZones();

    private static HttpRequestDef<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> genForNovaListAvailabilityZones() {
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
        genForNovaListKeypairs();

    private static HttpRequestDef<NovaListKeypairsRequest, NovaListKeypairsResponse> genForNovaListKeypairs() {
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
            f -> f.withMarshaller(NovaListKeypairsRequest::getLimit, NovaListKeypairsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListKeypairsRequest::getMarker, NovaListKeypairsRequest::setMarker));
        builder.<String>withRequestField("OpenStack-API-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListKeypairsRequest::getOpenStackAPIVersion,
                NovaListKeypairsRequest::setOpenStackAPIVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> novaListServerSecurityGroups =
        genForNovaListServerSecurityGroups();

    private static HttpRequestDef<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> genForNovaListServerSecurityGroups() {
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
            f -> f.withMarshaller(NovaListServerSecurityGroupsRequest::getServerId,
                NovaListServerSecurityGroupsRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaListServersDetailsRequest, NovaListServersDetailsResponse> novaListServersDetails =
        genForNovaListServersDetails();

    private static HttpRequestDef<NovaListServersDetailsRequest, NovaListServersDetailsResponse> genForNovaListServersDetails() {
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
            f -> f.withMarshaller(NovaListServersDetailsRequest::getChangesSince,
                NovaListServersDetailsRequest::setChangesSince));
        builder.<String>withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getFlavor, NovaListServersDetailsRequest::setFlavor));
        builder.<String>withRequestField("image",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getImage, NovaListServersDetailsRequest::setImage));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getIp, NovaListServersDetailsRequest::setIp));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getLimit, NovaListServersDetailsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getMarker, NovaListServersDetailsRequest::setMarker));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getName, NovaListServersDetailsRequest::setName));
        builder.<String>withRequestField("not-tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getNotTags,
                NovaListServersDetailsRequest::setNotTags));
        builder.<String>withRequestField("reservation_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getReservationId,
                NovaListServersDetailsRequest::setReservationId));
        builder.<NovaListServersDetailsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(NovaListServersDetailsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getSortKey,
                NovaListServersDetailsRequest::setSortKey));
        builder.<NovaListServersDetailsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(NovaListServersDetailsRequest.StatusEnum.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getStatus, NovaListServersDetailsRequest::setStatus));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getTags, NovaListServersDetailsRequest::setTags));
        builder.<String>withRequestField("OpenStack-API-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaListServersDetailsRequest::getOpenStackAPIVersion,
                NovaListServersDetailsRequest::setOpenStackAPIVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaShowKeypairRequest, NovaShowKeypairResponse> novaShowKeypair =
        genForNovaShowKeypair();

    private static HttpRequestDef<NovaShowKeypairRequest, NovaShowKeypairResponse> genForNovaShowKeypair() {
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
            f -> f.withMarshaller(NovaShowKeypairRequest::getKeypairName, NovaShowKeypairRequest::setKeypairName));
        builder.<String>withRequestField("OpenStack-API-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaShowKeypairRequest::getOpenStackAPIVersion,
                NovaShowKeypairRequest::setOpenStackAPIVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaShowServerRequest, NovaShowServerResponse> novaShowServer =
        genForNovaShowServer();

    private static HttpRequestDef<NovaShowServerRequest, NovaShowServerResponse> genForNovaShowServer() {
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
            f -> f.withMarshaller(NovaShowServerRequest::getServerId, NovaShowServerRequest::setServerId));
        builder.<String>withRequestField("OpenStack-API-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaShowServerRequest::getOpenStackAPIVersion,
                NovaShowServerRequest::setOpenStackAPIVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaShowServerInterfaceRequest, NovaShowServerInterfaceResponse> novaShowServerInterface =
        genForNovaShowServerInterface();

    private static HttpRequestDef<NovaShowServerInterfaceRequest, NovaShowServerInterfaceResponse> genForNovaShowServerInterface() {
        // basic
        HttpRequestDef.Builder<NovaShowServerInterfaceRequest, NovaShowServerInterfaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, NovaShowServerInterfaceRequest.class, NovaShowServerInterfaceResponse.class)
            .withName("NovaShowServerInterface")
            .withUri("/v2.1/{project_id}/servers/{server_id}/os-interface/{port_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaShowServerInterfaceRequest::getPortId,
                NovaShowServerInterfaceRequest::setPortId));
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaShowServerInterfaceRequest::getServerId,
                NovaShowServerInterfaceRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterServerMonitorRequest, RegisterServerMonitorResponse> registerServerMonitor =
        genForRegisterServerMonitor();

    private static HttpRequestDef<RegisterServerMonitorRequest, RegisterServerMonitorResponse> genForRegisterServerMonitor() {
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
            f -> f.withMarshaller(RegisterServerMonitorRequest::getServerId,
                RegisterServerMonitorRequest::setServerId));
        builder.<RegisterServerMonitorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterServerMonitorRequestBody.class),
            f -> f.withMarshaller(RegisterServerMonitorRequest::getBody, RegisterServerMonitorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> reinstallServerWithCloudInit =
        genForReinstallServerWithCloudInit();

    private static HttpRequestDef<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> genForReinstallServerWithCloudInit() {
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
            f -> f.withMarshaller(ReinstallServerWithCloudInitRequest::getServerId,
                ReinstallServerWithCloudInitRequest::setServerId));
        builder.<ReinstallServerWithCloudInitRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReinstallServerWithCloudInitRequestBody.class),
            f -> f.withMarshaller(ReinstallServerWithCloudInitRequest::getBody,
                ReinstallServerWithCloudInitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse> reinstallServerWithoutCloudInit =
        genForReinstallServerWithoutCloudInit();

    private static HttpRequestDef<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse> genForReinstallServerWithoutCloudInit() {
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
            f -> f.withMarshaller(ReinstallServerWithoutCloudInitRequest::getServerId,
                ReinstallServerWithoutCloudInitRequest::setServerId));
        builder.<ReinstallServerWithoutCloudInitRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReinstallServerWithoutCloudInitRequestBody.class),
            f -> f.withMarshaller(ReinstallServerWithoutCloudInitRequest::getBody,
                ReinstallServerWithoutCloudInitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetServerPasswordRequest, ResetServerPasswordResponse> resetServerPassword =
        genForResetServerPassword();

    private static HttpRequestDef<ResetServerPasswordRequest, ResetServerPasswordResponse> genForResetServerPassword() {
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
            f -> f.withMarshaller(ResetServerPasswordRequest::getServerId, ResetServerPasswordRequest::setServerId));
        builder.<ResetServerPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetServerPasswordRequestBody.class),
            f -> f.withMarshaller(ResetServerPasswordRequest::getBody, ResetServerPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizePostPaidServerRequest, ResizePostPaidServerResponse> resizePostPaidServer =
        genForResizePostPaidServer();

    private static HttpRequestDef<ResizePostPaidServerRequest, ResizePostPaidServerResponse> genForResizePostPaidServer() {
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
            f -> f.withMarshaller(ResizePostPaidServerRequest::getServerId, ResizePostPaidServerRequest::setServerId));
        builder.<ResizePostPaidServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizePostPaidServerRequestBody.class),
            f -> f.withMarshaller(ResizePostPaidServerRequest::getBody, ResizePostPaidServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeServerRequest, ResizeServerResponse> resizeServer = genForResizeServer();

    private static HttpRequestDef<ResizeServerRequest, ResizeServerResponse> genForResizeServer() {
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
            f -> f.withMarshaller(ResizeServerRequest::getServerId, ResizeServerRequest::setServerId));
        builder.<ResizeServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeServerRequestBody.class),
            f -> f.withMarshaller(ResizeServerRequest::getBody, ResizeServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> showResetPasswordFlag =
        genForShowResetPasswordFlag();

    private static HttpRequestDef<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> genForShowResetPasswordFlag() {
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
            f -> f.withMarshaller(ShowResetPasswordFlagRequest::getServerId,
                ShowResetPasswordFlagRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerRequest, ShowServerResponse> showServer = genForShowServer();

    private static HttpRequestDef<ShowServerRequest, ShowServerResponse> genForShowServer() {
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
            f -> f.withMarshaller(ShowServerRequest::getServerId, ShowServerRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse> showServerBlockDevice =
        genForShowServerBlockDevice();

    private static HttpRequestDef<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse> genForShowServerBlockDevice() {
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
            f -> f.withMarshaller(ShowServerBlockDeviceRequest::getServerId,
                ShowServerBlockDeviceRequest::setServerId));
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerBlockDeviceRequest::getVolumeId,
                ShowServerBlockDeviceRequest::setVolumeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerGroupRequest, ShowServerGroupResponse> showServerGroup =
        genForShowServerGroup();

    private static HttpRequestDef<ShowServerGroupRequest, ShowServerGroupResponse> genForShowServerGroup() {
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
            f -> f.withMarshaller(ShowServerGroupRequest::getServerGroupId, ShowServerGroupRequest::setServerGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerLimitsRequest, ShowServerLimitsResponse> showServerLimits =
        genForShowServerLimits();

    private static HttpRequestDef<ShowServerLimitsRequest, ShowServerLimitsResponse> genForShowServerLimits() {
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
        genForShowServerPassword();

    private static HttpRequestDef<ShowServerPasswordRequest, ShowServerPasswordResponse> genForShowServerPassword() {
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
            f -> f.withMarshaller(ShowServerPasswordRequest::getServerId, ShowServerPasswordRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> showServerRemoteConsole =
        genForShowServerRemoteConsole();

    private static HttpRequestDef<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> genForShowServerRemoteConsole() {
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
            f -> f.withMarshaller(ShowServerRemoteConsoleRequest::getServerId,
                ShowServerRemoteConsoleRequest::setServerId));
        builder.<ShowServerRemoteConsoleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowServerRemoteConsoleRequestBody.class),
            f -> f.withMarshaller(ShowServerRemoteConsoleRequest::getBody, ShowServerRemoteConsoleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerTagsRequest, ShowServerTagsResponse> showServerTags =
        genForShowServerTags();

    private static HttpRequestDef<ShowServerTagsRequest, ShowServerTagsResponse> genForShowServerTags() {
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
            f -> f.withMarshaller(ShowServerTagsRequest::getServerId, ShowServerTagsRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerRequest, UpdateServerResponse> updateServer = genForUpdateServer();

    private static HttpRequestDef<UpdateServerRequest, UpdateServerResponse> genForUpdateServer() {
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
            f -> f.withMarshaller(UpdateServerRequest::getServerId, UpdateServerRequest::setServerId));
        builder.<UpdateServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerRequestBody.class),
            f -> f.withMarshaller(UpdateServerRequest::getBody, UpdateServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> updateServerAutoTerminateTime =
        genForUpdateServerAutoTerminateTime();

    private static HttpRequestDef<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> genForUpdateServerAutoTerminateTime() {
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
            f -> f.withMarshaller(UpdateServerAutoTerminateTimeRequest::getServerId,
                UpdateServerAutoTerminateTimeRequest::setServerId));
        builder.<UpdateServerAutoTerminateTimeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerAutoTerminateTimeRequestBody.class),
            f -> f.withMarshaller(UpdateServerAutoTerminateTimeRequest::getBody,
                UpdateServerAutoTerminateTimeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerBlockDeviceRequest, UpdateServerBlockDeviceResponse> updateServerBlockDevice =
        genForUpdateServerBlockDevice();

    private static HttpRequestDef<UpdateServerBlockDeviceRequest, UpdateServerBlockDeviceResponse> genForUpdateServerBlockDevice() {
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
            f -> f.withMarshaller(UpdateServerBlockDeviceRequest::getServerId,
                UpdateServerBlockDeviceRequest::setServerId));
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerBlockDeviceRequest::getVolumeId,
                UpdateServerBlockDeviceRequest::setVolumeId));
        builder.<UpdateServerBlockDeviceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerBlockDeviceReq.class),
            f -> f.withMarshaller(UpdateServerBlockDeviceRequest::getBody, UpdateServerBlockDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerMetadataRequest, UpdateServerMetadataResponse> updateServerMetadata =
        genForUpdateServerMetadata();

    private static HttpRequestDef<UpdateServerMetadataRequest, UpdateServerMetadataResponse> genForUpdateServerMetadata() {
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
            f -> f.withMarshaller(UpdateServerMetadataRequest::getServerId, UpdateServerMetadataRequest::setServerId));
        builder.<UpdateServerMetadataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerMetadataRequestBody.class),
            f -> f.withMarshaller(UpdateServerMetadataRequest::getBody, UpdateServerMetadataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaListVersionsRequest, NovaListVersionsResponse> novaListVersions =
        genForNovaListVersions();

    private static HttpRequestDef<NovaListVersionsRequest, NovaListVersionsResponse> genForNovaListVersions() {
        // basic
        HttpRequestDef.Builder<NovaListVersionsRequest, NovaListVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NovaListVersionsRequest.class, NovaListVersionsResponse.class)
                .withName("NovaListVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NovaShowVersionRequest, NovaShowVersionResponse> novaShowVersion =
        genForNovaShowVersion();

    private static HttpRequestDef<NovaShowVersionRequest, NovaShowVersionResponse> genForNovaShowVersion() {
        // basic
        HttpRequestDef.Builder<NovaShowVersionRequest, NovaShowVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NovaShowVersionRequest.class, NovaShowVersionResponse.class)
                .withName("NovaShowVersion")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NovaShowVersionRequest::getApiVersion, NovaShowVersionRequest::setApiVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
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
            f -> f.withMarshaller(ShowJobRequest::getJobId, ShowJobRequest::setJobId));

        // response

        return builder.build();
    }

}
