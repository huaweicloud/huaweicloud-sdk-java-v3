package com.huaweicloud.sdk.bms.v1;

import com.huaweicloud.sdk.bms.v1.model.AddServerNicsReq;
import com.huaweicloud.sdk.bms.v1.model.AddServerNicsRequest;
import com.huaweicloud.sdk.bms.v1.model.AddServerNicsResponse;
import com.huaweicloud.sdk.bms.v1.model.AttachBaremetalServerVolumeRequest;
import com.huaweicloud.sdk.bms.v1.model.AttachBaremetalServerVolumeResponse;
import com.huaweicloud.sdk.bms.v1.model.AttachVolumeBody;
import com.huaweicloud.sdk.bms.v1.model.BareMetalModifyPortRequestBody;
import com.huaweicloud.sdk.bms.v1.model.BatchCreateBaremetalServerTagsRequest;
import com.huaweicloud.sdk.bms.v1.model.BatchCreateBaremetalServerTagsRequestBody;
import com.huaweicloud.sdk.bms.v1.model.BatchCreateBaremetalServerTagsResponse;
import com.huaweicloud.sdk.bms.v1.model.BatchDeleteBaremetalServerTagsRequest;
import com.huaweicloud.sdk.bms.v1.model.BatchDeleteBaremetalServerTagsRequestBody;
import com.huaweicloud.sdk.bms.v1.model.BatchDeleteBaremetalServerTagsResponse;
import com.huaweicloud.sdk.bms.v1.model.BatchRebootBaremetalServersRequest;
import com.huaweicloud.sdk.bms.v1.model.BatchRebootBaremetalServersResponse;
import com.huaweicloud.sdk.bms.v1.model.BatchStartBaremetalServersRequest;
import com.huaweicloud.sdk.bms.v1.model.BatchStartBaremetalServersResponse;
import com.huaweicloud.sdk.bms.v1.model.BatchStopBaremetalServersRequest;
import com.huaweicloud.sdk.bms.v1.model.BatchStopBaremetalServersResponse;
import com.huaweicloud.sdk.bms.v1.model.ChangeBaremetalNameBody;
import com.huaweicloud.sdk.bms.v1.model.ChangeBaremetalServerNameRequest;
import com.huaweicloud.sdk.bms.v1.model.ChangeBaremetalServerNameResponse;
import com.huaweicloud.sdk.bms.v1.model.ChangeBaremetalServerOsRequest;
import com.huaweicloud.sdk.bms.v1.model.ChangeBaremetalServerOsResponse;
import com.huaweicloud.sdk.bms.v1.model.CreateBareMetalServersRequest;
import com.huaweicloud.sdk.bms.v1.model.CreateBareMetalServersResponse;
import com.huaweicloud.sdk.bms.v1.model.CreateBaremetalServersBody;
import com.huaweicloud.sdk.bms.v1.model.DeleteBaremetalBody;
import com.huaweicloud.sdk.bms.v1.model.DeleteBaremetalServerRequest;
import com.huaweicloud.sdk.bms.v1.model.DeleteBaremetalServerResponse;
import com.huaweicloud.sdk.bms.v1.model.DeleteServerNicsReq;
import com.huaweicloud.sdk.bms.v1.model.DeleteServerNicsRequest;
import com.huaweicloud.sdk.bms.v1.model.DeleteServerNicsResponse;
import com.huaweicloud.sdk.bms.v1.model.DeleteWindowsBareMetalServerPasswordRequest;
import com.huaweicloud.sdk.bms.v1.model.DeleteWindowsBareMetalServerPasswordResponse;
import com.huaweicloud.sdk.bms.v1.model.DetachBaremetalServerVolumeRequest;
import com.huaweicloud.sdk.bms.v1.model.DetachBaremetalServerVolumeResponse;
import com.huaweicloud.sdk.bms.v1.model.ListBareMetalServerDetailsRequest;
import com.huaweicloud.sdk.bms.v1.model.ListBareMetalServerDetailsResponse;
import com.huaweicloud.sdk.bms.v1.model.ListBareMetalServersDetailRequest;
import com.huaweicloud.sdk.bms.v1.model.ListBareMetalServersDetailResponse;
import com.huaweicloud.sdk.bms.v1.model.ListBareMetalServersRequest;
import com.huaweicloud.sdk.bms.v1.model.ListBareMetalServersResponse;
import com.huaweicloud.sdk.bms.v1.model.ListBaremetalFlavorDetailExtendsRequest;
import com.huaweicloud.sdk.bms.v1.model.ListBaremetalFlavorDetailExtendsResponse;
import com.huaweicloud.sdk.bms.v1.model.ModifyVmNicRequest;
import com.huaweicloud.sdk.bms.v1.model.ModifyVmNicResponse;
import com.huaweicloud.sdk.bms.v1.model.OSChangeReq;
import com.huaweicloud.sdk.bms.v1.model.OsReinstallBody;
import com.huaweicloud.sdk.bms.v1.model.OsStartBody;
import com.huaweicloud.sdk.bms.v1.model.OsStopBody;
import com.huaweicloud.sdk.bms.v1.model.RebootBody;
import com.huaweicloud.sdk.bms.v1.model.ReinstallBaremetalServerOsRequest;
import com.huaweicloud.sdk.bms.v1.model.ReinstallBaremetalServerOsResponse;
import com.huaweicloud.sdk.bms.v1.model.ResetPasswordBody;
import com.huaweicloud.sdk.bms.v1.model.ResetPwdOneClickRequest;
import com.huaweicloud.sdk.bms.v1.model.ResetPwdOneClickResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowAvailableResourceRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowAvailableResourceResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerInterfaceAttachmentsRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerInterfaceAttachmentsResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerTagsRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerTagsResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerVolumeInfoRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerVolumeInfoResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowJobInfosRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowJobInfosResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowMetadataOptionsRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowMetadataOptionsResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowResetPwdRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowResetPwdResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowServerRemoteConsoleReq;
import com.huaweicloud.sdk.bms.v1.model.ShowServerRemoteConsoleRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowServerRemoteConsoleResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowSpecifiedVersionRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowSpecifiedVersionResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowTenantQuotaRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowTenantQuotaResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowWindowsBaremetalServerPwdRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowWindowsBaremetalServerPwdResponse;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerInterfaceAttachmentsReq;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerInterfaceAttachmentsRequest;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerInterfaceAttachmentsResponse;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerMetadataOptionsRequestBody;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerMetadataReq;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerMetadataRequest;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerMetadataResponse;
import com.huaweicloud.sdk.bms.v1.model.UpdateMetadataOptionsRequest;
import com.huaweicloud.sdk.bms.v1.model.UpdateMetadataOptionsResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class BmsMeta {

    public static final HttpRequestDef<AddServerNicsRequest, AddServerNicsResponse> addServerNics =
        genForAddServerNics();

    private static HttpRequestDef<AddServerNicsRequest, AddServerNicsResponse> genForAddServerNics() {
        // basic
        HttpRequestDef.Builder<AddServerNicsRequest, AddServerNicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddServerNicsRequest.class, AddServerNicsResponse.class)
                .withName("AddServerNics")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/nics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddServerNicsRequest::getServerId, AddServerNicsRequest::setServerId));
        builder.<AddServerNicsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddServerNicsReq.class),
            f -> f.withMarshaller(AddServerNicsRequest::getBody, AddServerNicsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse> attachBaremetalServerVolume =
        genForAttachBaremetalServerVolume();

    private static HttpRequestDef<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse> genForAttachBaremetalServerVolume() {
        // basic
        HttpRequestDef.Builder<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AttachBaremetalServerVolumeRequest.class,
                    AttachBaremetalServerVolumeResponse.class)
                .withName("AttachBaremetalServerVolume")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/attachvolume")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachBaremetalServerVolumeRequest::getServerId,
                AttachBaremetalServerVolumeRequest::setServerId));
        builder.<AttachVolumeBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachVolumeBody.class),
            f -> f.withMarshaller(AttachBaremetalServerVolumeRequest::getBody,
                AttachBaremetalServerVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse> batchCreateBaremetalServerTags =
        genForBatchCreateBaremetalServerTags();

    private static HttpRequestDef<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse> genForBatchCreateBaremetalServerTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateBaremetalServerTagsRequest.class,
                    BatchCreateBaremetalServerTagsResponse.class)
                .withName("BatchCreateBaremetalServerTags")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateBaremetalServerTagsRequest::getServerId,
                BatchCreateBaremetalServerTagsRequest::setServerId));
        builder.<BatchCreateBaremetalServerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateBaremetalServerTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateBaremetalServerTagsRequest::getBody,
                BatchCreateBaremetalServerTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse> batchDeleteBaremetalServerTags =
        genForBatchDeleteBaremetalServerTags();

    private static HttpRequestDef<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse> genForBatchDeleteBaremetalServerTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteBaremetalServerTagsRequest.class,
                    BatchDeleteBaremetalServerTagsResponse.class)
                .withName("BatchDeleteBaremetalServerTags")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteBaremetalServerTagsRequest::getServerId,
                BatchDeleteBaremetalServerTagsRequest::setServerId));
        builder.<BatchDeleteBaremetalServerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteBaremetalServerTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteBaremetalServerTagsRequest::getBody,
                BatchDeleteBaremetalServerTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> batchRebootBaremetalServers =
        genForBatchRebootBaremetalServers();

    private static HttpRequestDef<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> genForBatchRebootBaremetalServers() {
        // basic
        HttpRequestDef.Builder<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchRebootBaremetalServersRequest.class,
                    BatchRebootBaremetalServersResponse.class)
                .withName("BatchRebootBaremetalServers")
                .withUri("/v1/{project_id}/baremetalservers/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RebootBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RebootBody.class),
            f -> f.withMarshaller(BatchRebootBaremetalServersRequest::getBody,
                BatchRebootBaremetalServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse> batchStartBaremetalServers =
        genForBatchStartBaremetalServers();

    private static HttpRequestDef<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse> genForBatchStartBaremetalServers() {
        // basic
        HttpRequestDef.Builder<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchStartBaremetalServersRequest.class,
                    BatchStartBaremetalServersResponse.class)
                .withName("BatchStartBaremetalServers")
                .withUri("/v1/{project_id}/baremetalservers/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<OsStartBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OsStartBody.class),
            f -> f.withMarshaller(BatchStartBaremetalServersRequest::getBody,
                BatchStartBaremetalServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse> batchStopBaremetalServers =
        genForBatchStopBaremetalServers();

    private static HttpRequestDef<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse> genForBatchStopBaremetalServers() {
        // basic
        HttpRequestDef.Builder<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchStopBaremetalServersRequest.class,
                    BatchStopBaremetalServersResponse.class)
                .withName("BatchStopBaremetalServers")
                .withUri("/v1/{project_id}/baremetalservers/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<OsStopBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OsStopBody.class),
            f -> f.withMarshaller(BatchStopBaremetalServersRequest::getBody,
                BatchStopBaremetalServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse> changeBaremetalServerName =
        genForChangeBaremetalServerName();

    private static HttpRequestDef<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse> genForChangeBaremetalServerName() {
        // basic
        HttpRequestDef.Builder<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ChangeBaremetalServerNameRequest.class,
                    ChangeBaremetalServerNameResponse.class)
                .withName("ChangeBaremetalServerName")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeBaremetalServerNameRequest::getServerId,
                ChangeBaremetalServerNameRequest::setServerId));
        builder.<ChangeBaremetalNameBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeBaremetalNameBody.class),
            f -> f.withMarshaller(ChangeBaremetalServerNameRequest::getBody,
                ChangeBaremetalServerNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse> changeBaremetalServerOs =
        genForChangeBaremetalServerOs();

    private static HttpRequestDef<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse> genForChangeBaremetalServerOs() {
        // basic
        HttpRequestDef.Builder<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeBaremetalServerOsRequest.class, ChangeBaremetalServerOsResponse.class)
            .withName("ChangeBaremetalServerOs")
            .withUri("/v1/{project_id}/baremetalservers/{server_id}/changeos")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeBaremetalServerOsRequest::getServerId,
                ChangeBaremetalServerOsRequest::setServerId));
        builder.<OSChangeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OSChangeReq.class),
            f -> f.withMarshaller(ChangeBaremetalServerOsRequest::getBody, ChangeBaremetalServerOsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBareMetalServersRequest, CreateBareMetalServersResponse> createBareMetalServers =
        genForCreateBareMetalServers();

    private static HttpRequestDef<CreateBareMetalServersRequest, CreateBareMetalServersResponse> genForCreateBareMetalServers() {
        // basic
        HttpRequestDef.Builder<CreateBareMetalServersRequest, CreateBareMetalServersResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateBareMetalServersRequest.class, CreateBareMetalServersResponse.class)
            .withName("CreateBareMetalServers")
            .withUri("/v1/{project_id}/baremetalservers")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateBaremetalServersBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBaremetalServersBody.class),
            f -> f.withMarshaller(CreateBareMetalServersRequest::getBody, CreateBareMetalServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBaremetalServerRequest, DeleteBaremetalServerResponse> deleteBaremetalServer =
        genForDeleteBaremetalServer();

    private static HttpRequestDef<DeleteBaremetalServerRequest, DeleteBaremetalServerResponse> genForDeleteBaremetalServer() {
        // basic
        HttpRequestDef.Builder<DeleteBaremetalServerRequest, DeleteBaremetalServerResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteBaremetalServerRequest.class, DeleteBaremetalServerResponse.class)
            .withName("DeleteBaremetalServer")
            .withUri("/v1/{project_id}/baremetalservers/delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteBaremetalBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteBaremetalBody.class),
            f -> f.withMarshaller(DeleteBaremetalServerRequest::getBody, DeleteBaremetalServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerNicsRequest, DeleteServerNicsResponse> deleteServerNics =
        genForDeleteServerNics();

    private static HttpRequestDef<DeleteServerNicsRequest, DeleteServerNicsResponse> genForDeleteServerNics() {
        // basic
        HttpRequestDef.Builder<DeleteServerNicsRequest, DeleteServerNicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteServerNicsRequest.class, DeleteServerNicsResponse.class)
                .withName("DeleteServerNics")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/nics/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerNicsRequest::getServerId, DeleteServerNicsRequest::setServerId));
        builder.<DeleteServerNicsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteServerNicsReq.class),
            f -> f.withMarshaller(DeleteServerNicsRequest::getBody, DeleteServerNicsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse> deleteWindowsBareMetalServerPassword =
        genForDeleteWindowsBareMetalServerPassword();

    private static HttpRequestDef<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse> genForDeleteWindowsBareMetalServerPassword() {
        // basic
        HttpRequestDef.Builder<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteWindowsBareMetalServerPasswordRequest.class,
                    DeleteWindowsBareMetalServerPasswordResponse.class)
                .withName("DeleteWindowsBareMetalServerPassword")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-server-password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWindowsBareMetalServerPasswordRequest::getServerId,
                DeleteWindowsBareMetalServerPasswordRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> detachBaremetalServerVolume =
        genForDetachBaremetalServerVolume();

    private static HttpRequestDef<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> genForDetachBaremetalServerVolume() {
        // basic
        HttpRequestDef.Builder<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DetachBaremetalServerVolumeRequest.class,
                    DetachBaremetalServerVolumeResponse.class)
                .withName("DetachBaremetalServerVolume")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/detachvolume/{attachment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachBaremetalServerVolumeRequest::getServerId,
                DetachBaremetalServerVolumeRequest::setServerId));
        builder.<String>withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachBaremetalServerVolumeRequest::getAttachmentId,
                DetachBaremetalServerVolumeRequest::setAttachmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse> listBareMetalServerDetails =
        genForListBareMetalServerDetails();

    private static HttpRequestDef<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse> genForListBareMetalServerDetails() {
        // basic
        HttpRequestDef.Builder<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBareMetalServerDetailsRequest.class,
                    ListBareMetalServerDetailsResponse.class)
                .withName("ListBareMetalServerDetails")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBareMetalServerDetailsRequest::getServerId,
                ListBareMetalServerDetailsRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBareMetalServersRequest, ListBareMetalServersResponse> listBareMetalServers =
        genForListBareMetalServers();

    private static HttpRequestDef<ListBareMetalServersRequest, ListBareMetalServersResponse> genForListBareMetalServers() {
        // basic
        HttpRequestDef.Builder<ListBareMetalServersRequest, ListBareMetalServersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBareMetalServersRequest.class, ListBareMetalServersResponse.class)
            .withName("ListBareMetalServers")
            .withUri("/v1/{project_id}/baremetalservers/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBareMetalServersRequest::getFlavor, ListBareMetalServersRequest::setFlavor));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBareMetalServersRequest::getName, ListBareMetalServersRequest::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBareMetalServersRequest::getStatus, ListBareMetalServersRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBareMetalServersRequest::getLimit, ListBareMetalServersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBareMetalServersRequest::getOffset, ListBareMetalServersRequest::setOffset));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBareMetalServersRequest::getTags, ListBareMetalServersRequest::setTags));
        builder.<String>withRequestField("reservation_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBareMetalServersRequest::getReservationId,
                ListBareMetalServersRequest::setReservationId));
        builder.<String>withRequestField("detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBareMetalServersRequest::getDetail, ListBareMetalServersRequest::setDetail));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBareMetalServersRequest::getEnterpriseProjectId,
                ListBareMetalServersRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBareMetalServersDetailRequest, ListBareMetalServersDetailResponse> listBareMetalServersDetail =
        genForListBareMetalServersDetail();

    private static HttpRequestDef<ListBareMetalServersDetailRequest, ListBareMetalServersDetailResponse> genForListBareMetalServersDetail() {
        // basic
        HttpRequestDef.Builder<ListBareMetalServersDetailRequest, ListBareMetalServersDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBareMetalServersDetailRequest.class,
                    ListBareMetalServersDetailResponse.class)
                .withName("ListBareMetalServersDetail")
                .withUri("/v1.1/{project_id}/baremetalservers/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBareMetalServersDetailRequest::getFlavor,
                ListBareMetalServersDetailRequest::setFlavor));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBareMetalServersDetailRequest::getName,
                ListBareMetalServersDetailRequest::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBareMetalServersDetailRequest::getStatus,
                ListBareMetalServersDetailRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBareMetalServersDetailRequest::getLimit,
                ListBareMetalServersDetailRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBareMetalServersDetailRequest::getOffset,
                ListBareMetalServersDetailRequest::setOffset));
        builder.<String>withRequestField("detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBareMetalServersDetailRequest::getDetail,
                ListBareMetalServersDetailRequest::setDetail));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse> listBaremetalFlavorDetailExtends =
        genForListBaremetalFlavorDetailExtends();

    private static HttpRequestDef<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse> genForListBaremetalFlavorDetailExtends() {
        // basic
        HttpRequestDef.Builder<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBaremetalFlavorDetailExtendsRequest.class,
                    ListBaremetalFlavorDetailExtendsResponse.class)
                .withName("ListBaremetalFlavorDetailExtends")
                .withUri("/v1/{project_id}/baremetalservers/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBaremetalFlavorDetailExtendsRequest::getAvailabilityZone,
                ListBaremetalFlavorDetailExtendsRequest::setAvailabilityZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyVmNicRequest, ModifyVmNicResponse> modifyVmNic = genForModifyVmNic();

    private static HttpRequestDef<ModifyVmNicRequest, ModifyVmNicResponse> genForModifyVmNic() {
        // basic
        HttpRequestDef.Builder<ModifyVmNicRequest, ModifyVmNicResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyVmNicRequest.class, ModifyVmNicResponse.class)
                .withName("ModifyVmNic")
                .withUri("/v1/{project_id}/baremetalservers/nics/{nic_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("nic_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyVmNicRequest::getNicId, ModifyVmNicRequest::setNicId));
        builder.<BareMetalModifyPortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BareMetalModifyPortRequestBody.class),
            f -> f.withMarshaller(ModifyVmNicRequest::getBody, ModifyVmNicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse> reinstallBaremetalServerOs =
        genForReinstallBaremetalServerOs();

    private static HttpRequestDef<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse> genForReinstallBaremetalServerOs() {
        // basic
        HttpRequestDef.Builder<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ReinstallBaremetalServerOsRequest.class,
                    ReinstallBaremetalServerOsResponse.class)
                .withName("ReinstallBaremetalServerOs")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/reinstallos")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ReinstallBaremetalServerOsRequest::getServerId,
                ReinstallBaremetalServerOsRequest::setServerId));
        builder.<OsReinstallBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OsReinstallBody.class),
            f -> f.withMarshaller(ReinstallBaremetalServerOsRequest::getBody,
                ReinstallBaremetalServerOsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPwdOneClickRequest, ResetPwdOneClickResponse> resetPwdOneClick =
        genForResetPwdOneClick();

    private static HttpRequestDef<ResetPwdOneClickRequest, ResetPwdOneClickResponse> genForResetPwdOneClick() {
        // basic
        HttpRequestDef.Builder<ResetPwdOneClickRequest, ResetPwdOneClickResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetPwdOneClickRequest.class, ResetPwdOneClickResponse.class)
                .withName("ResetPwdOneClick")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-reset-password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdOneClickRequest::getServerId, ResetPwdOneClickRequest::setServerId));
        builder.<ResetPasswordBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordBody.class),
            f -> f.withMarshaller(ResetPwdOneClickRequest::getBody, ResetPwdOneClickRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAvailableResourceRequest, ShowAvailableResourceResponse> showAvailableResource =
        genForShowAvailableResource();

    private static HttpRequestDef<ShowAvailableResourceRequest, ShowAvailableResourceResponse> genForShowAvailableResource() {
        // basic
        HttpRequestDef.Builder<ShowAvailableResourceRequest, ShowAvailableResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAvailableResourceRequest.class, ShowAvailableResourceResponse.class)
            .withName("ShowAvailableResource")
            .withUri("/v1/{project_id}/baremetalservers/available_resource")
            .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAvailableResourceRequest::getAvailabilityZone,
                ShowAvailableResourceRequest::setAvailabilityZone));
        builder.<List<String>>withRequestField("flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAvailableResourceRequest::getFlavorId,
                ShowAvailableResourceRequest::setFlavorId));
        builder.<List<String>>withRequestField("dec_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAvailableResourceRequest::getDecProjectId,
                ShowAvailableResourceRequest::setDecProjectId));
        builder.<List<String>>withRequestField("check_limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAvailableResourceRequest::getCheckLimit,
                ShowAvailableResourceRequest::setCheckLimit));
        builder.<List<String>>withRequestField("expectation",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAvailableResourceRequest::getExpectation,
                ShowAvailableResourceRequest::setExpectation));
        builder.<List<String>>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAvailableResourceRequest::getResourceType,
                ShowAvailableResourceRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse> showBaremetalServerInterfaceAttachments =
        genForShowBaremetalServerInterfaceAttachments();

    private static HttpRequestDef<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse> genForShowBaremetalServerInterfaceAttachments() {
        // basic
        HttpRequestDef.Builder<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBaremetalServerInterfaceAttachmentsRequest.class,
                    ShowBaremetalServerInterfaceAttachmentsResponse.class)
                .withName("ShowBaremetalServerInterfaceAttachments")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-interface")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBaremetalServerInterfaceAttachmentsRequest::getServerId,
                ShowBaremetalServerInterfaceAttachmentsRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse> showBaremetalServerTags =
        genForShowBaremetalServerTags();

    private static HttpRequestDef<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse> genForShowBaremetalServerTags() {
        // basic
        HttpRequestDef.Builder<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBaremetalServerTagsRequest.class, ShowBaremetalServerTagsResponse.class)
            .withName("ShowBaremetalServerTags")
            .withUri("/v1/{project_id}/baremetalservers/{server_id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBaremetalServerTagsRequest::getServerId,
                ShowBaremetalServerTagsRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> showBaremetalServerVolumeInfo =
        genForShowBaremetalServerVolumeInfo();

    private static HttpRequestDef<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> genForShowBaremetalServerVolumeInfo() {
        // basic
        HttpRequestDef.Builder<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBaremetalServerVolumeInfoRequest.class,
                    ShowBaremetalServerVolumeInfoResponse.class)
                .withName("ShowBaremetalServerVolumeInfo")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-volume_attachments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBaremetalServerVolumeInfoRequest::getServerId,
                ShowBaremetalServerVolumeInfoRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetadataOptionsRequest, ShowMetadataOptionsResponse> showMetadataOptions =
        genForShowMetadataOptions();

    private static HttpRequestDef<ShowMetadataOptionsRequest, ShowMetadataOptionsResponse> genForShowMetadataOptions() {
        // basic
        HttpRequestDef.Builder<ShowMetadataOptionsRequest, ShowMetadataOptionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMetadataOptionsRequest.class, ShowMetadataOptionsResponse.class)
                .withName("ShowMetadataOptions")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/metadata-options")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetadataOptionsRequest::getServerId, ShowMetadataOptionsRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResetPwdRequest, ShowResetPwdResponse> showResetPwd = genForShowResetPwd();

    private static HttpRequestDef<ShowResetPwdRequest, ShowResetPwdResponse> genForShowResetPwd() {
        // basic
        HttpRequestDef.Builder<ShowResetPwdRequest, ShowResetPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResetPwdRequest.class, ShowResetPwdResponse.class)
                .withName("ShowResetPwd")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-resetpwd-flag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResetPwdRequest::getServerId, ShowResetPwdRequest::setServerId));

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
            .withUri("/v1/{project_id}/baremetalservers/{server_id}/remote_console")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerRemoteConsoleRequest::getServerId,
                ShowServerRemoteConsoleRequest::setServerId));
        builder.<ShowServerRemoteConsoleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowServerRemoteConsoleReq.class),
            f -> f.withMarshaller(ShowServerRemoteConsoleRequest::getBody, ShowServerRemoteConsoleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTenantQuotaRequest, ShowTenantQuotaResponse> showTenantQuota =
        genForShowTenantQuota();

    private static HttpRequestDef<ShowTenantQuotaRequest, ShowTenantQuotaResponse> genForShowTenantQuota() {
        // basic
        HttpRequestDef.Builder<ShowTenantQuotaRequest, ShowTenantQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTenantQuotaRequest.class, ShowTenantQuotaResponse.class)
                .withName("ShowTenantQuota")
                .withUri("/v1/{project_id}/baremetalservers/limits")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> showWindowsBaremetalServerPwd =
        genForShowWindowsBaremetalServerPwd();

    private static HttpRequestDef<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> genForShowWindowsBaremetalServerPwd() {
        // basic
        HttpRequestDef.Builder<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowWindowsBaremetalServerPwdRequest.class,
                    ShowWindowsBaremetalServerPwdResponse.class)
                .withName("ShowWindowsBaremetalServerPwd")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-server-password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWindowsBaremetalServerPwdRequest::getServerId,
                ShowWindowsBaremetalServerPwdRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBaremetalServerInterfaceAttachmentsRequest, UpdateBaremetalServerInterfaceAttachmentsResponse> updateBaremetalServerInterfaceAttachments =
        genForUpdateBaremetalServerInterfaceAttachments();

    private static HttpRequestDef<UpdateBaremetalServerInterfaceAttachmentsRequest, UpdateBaremetalServerInterfaceAttachmentsResponse> genForUpdateBaremetalServerInterfaceAttachments() {
        // basic
        HttpRequestDef.Builder<UpdateBaremetalServerInterfaceAttachmentsRequest, UpdateBaremetalServerInterfaceAttachmentsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateBaremetalServerInterfaceAttachmentsRequest.class,
                    UpdateBaremetalServerInterfaceAttachmentsResponse.class)
                .withName("UpdateBaremetalServerInterfaceAttachments")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-interface/{port_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBaremetalServerInterfaceAttachmentsRequest::getPortId,
                UpdateBaremetalServerInterfaceAttachmentsRequest::setPortId));
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBaremetalServerInterfaceAttachmentsRequest::getServerId,
                UpdateBaremetalServerInterfaceAttachmentsRequest::setServerId));
        builder.<UpdateBaremetalServerInterfaceAttachmentsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBaremetalServerInterfaceAttachmentsReq.class),
            f -> f.withMarshaller(UpdateBaremetalServerInterfaceAttachmentsRequest::getBody,
                UpdateBaremetalServerInterfaceAttachmentsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse> updateBaremetalServerMetadata =
        genForUpdateBaremetalServerMetadata();

    private static HttpRequestDef<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse> genForUpdateBaremetalServerMetadata() {
        // basic
        HttpRequestDef.Builder<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateBaremetalServerMetadataRequest.class,
                    UpdateBaremetalServerMetadataResponse.class)
                .withName("UpdateBaremetalServerMetadata")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/metadata")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBaremetalServerMetadataRequest::getServerId,
                UpdateBaremetalServerMetadataRequest::setServerId));
        builder.<UpdateBaremetalServerMetadataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBaremetalServerMetadataReq.class),
            f -> f.withMarshaller(UpdateBaremetalServerMetadataRequest::getBody,
                UpdateBaremetalServerMetadataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMetadataOptionsRequest, UpdateMetadataOptionsResponse> updateMetadataOptions =
        genForUpdateMetadataOptions();

    private static HttpRequestDef<UpdateMetadataOptionsRequest, UpdateMetadataOptionsResponse> genForUpdateMetadataOptions() {
        // basic
        HttpRequestDef.Builder<UpdateMetadataOptionsRequest, UpdateMetadataOptionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateMetadataOptionsRequest.class, UpdateMetadataOptionsResponse.class)
            .withName("UpdateMetadataOptions")
            .withUri("/v1/{project_id}/baremetalservers/{server_id}/metadata-options")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMetadataOptionsRequest::getServerId,
                UpdateMetadataOptionsRequest::setServerId));
        builder.<UpdateBaremetalServerMetadataOptionsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBaremetalServerMetadataOptionsRequestBody.class),
            f -> f.withMarshaller(UpdateMetadataOptionsRequest::getBody, UpdateMetadataOptionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse> showSpecifiedVersion =
        genForShowSpecifiedVersion();

    private static HttpRequestDef<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse> genForShowSpecifiedVersion() {
        // basic
        HttpRequestDef.Builder<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSpecifiedVersionRequest.class, ShowSpecifiedVersionResponse.class)
            .withName("ShowSpecifiedVersion")
            .withUri("/{api_version}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSpecifiedVersionRequest::getApiVersion,
                ShowSpecifiedVersionRequest::setApiVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobInfosRequest, ShowJobInfosResponse> showJobInfos = genForShowJobInfos();

    private static HttpRequestDef<ShowJobInfosRequest, ShowJobInfosResponse> genForShowJobInfos() {
        // basic
        HttpRequestDef.Builder<ShowJobInfosRequest, ShowJobInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobInfosRequest.class, ShowJobInfosResponse.class)
                .withName("ShowJobInfos")
                .withUri("/v1/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfosRequest::getJobId, ShowJobInfosRequest::setJobId));

        // response

        return builder.build();
    }

}
