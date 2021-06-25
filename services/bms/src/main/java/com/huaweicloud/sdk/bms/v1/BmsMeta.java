package com.huaweicloud.sdk.bms.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.bms.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class BmsMeta {

    public static final HttpRequestDef<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse> attachBaremetalServerVolume = genForattachBaremetalServerVolume();

    private static HttpRequestDef<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse> genForattachBaremetalServerVolume() {
        // basic
        HttpRequestDef.Builder<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachBaremetalServerVolumeRequest.class, AttachBaremetalServerVolumeResponse.class)
                .withName("AttachBaremetalServerVolume")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/attachvolume")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AttachBaremetalServerVolumeRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AttachVolumeBody.class,
            f -> f.withMarshaller(AttachBaremetalServerVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse> batchCreateBaremetalServerTags = genForbatchCreateBaremetalServerTags();

    private static HttpRequestDef<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse> genForbatchCreateBaremetalServerTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateBaremetalServerTagsRequest.class, BatchCreateBaremetalServerTagsResponse.class)
                .withName("BatchCreateBaremetalServerTags")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCreateBaremetalServerTagsRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchCreateBaremetalServerTagsRequestBody.class,
            f -> f.withMarshaller(BatchCreateBaremetalServerTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse> batchDeleteBaremetalServerTags = genForbatchDeleteBaremetalServerTags();

    private static HttpRequestDef<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse> genForbatchDeleteBaremetalServerTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteBaremetalServerTagsRequest.class, BatchDeleteBaremetalServerTagsResponse.class)
                .withName("BatchDeleteBaremetalServerTags")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteBaremetalServerTagsRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchDeleteBaremetalServerTagsRequestBody.class,
            f -> f.withMarshaller(BatchDeleteBaremetalServerTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> batchRebootBaremetalServers = genForbatchRebootBaremetalServers();

    private static HttpRequestDef<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> genForbatchRebootBaremetalServers() {
        // basic
        HttpRequestDef.Builder<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRebootBaremetalServersRequest.class, BatchRebootBaremetalServersResponse.class)
                .withName("BatchRebootBaremetalServers")
                .withUri("/v1/{project_id}/baremetalservers/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RebootBody.class,
            f -> f.withMarshaller(BatchRebootBaremetalServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse> batchStartBaremetalServers = genForbatchStartBaremetalServers();

    private static HttpRequestDef<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse> genForbatchStartBaremetalServers() {
        // basic
        HttpRequestDef.Builder<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStartBaremetalServersRequest.class, BatchStartBaremetalServersResponse.class)
                .withName("BatchStartBaremetalServers")
                .withUri("/v1/{project_id}/baremetalservers/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OsStartBody.class,
            f -> f.withMarshaller(BatchStartBaremetalServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse> batchStopBaremetalServers = genForbatchStopBaremetalServers();

    private static HttpRequestDef<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse> genForbatchStopBaremetalServers() {
        // basic
        HttpRequestDef.Builder<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStopBaremetalServersRequest.class, BatchStopBaremetalServersResponse.class)
                .withName("BatchStopBaremetalServers")
                .withUri("/v1/{project_id}/baremetalservers/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OsStopBody.class,
            f -> f.withMarshaller(BatchStopBaremetalServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse> changeBaremetalServerName = genForchangeBaremetalServerName();

    private static HttpRequestDef<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse> genForchangeBaremetalServerName() {
        // basic
        HttpRequestDef.Builder<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeBaremetalServerNameRequest.class, ChangeBaremetalServerNameResponse.class)
                .withName("ChangeBaremetalServerName")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ChangeBaremetalServerNameRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ChangeBaremetalNameBody.class,
            f -> f.withMarshaller(ChangeBaremetalServerNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse> changeBaremetalServerOs = genForchangeBaremetalServerOs();

    private static HttpRequestDef<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse> genForchangeBaremetalServerOs() {
        // basic
        HttpRequestDef.Builder<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeBaremetalServerOsRequest.class, ChangeBaremetalServerOsResponse.class)
                .withName("ChangeBaremetalServerOs")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/changeos")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ChangeBaremetalServerOsRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OSChangeReq.class,
            f -> f.withMarshaller(ChangeBaremetalServerOsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateBareMetalServersRequest, CreateBareMetalServersResponse> createBareMetalServers = genForcreateBareMetalServers();

    private static HttpRequestDef<CreateBareMetalServersRequest, CreateBareMetalServersResponse> genForcreateBareMetalServers() {
        // basic
        HttpRequestDef.Builder<CreateBareMetalServersRequest, CreateBareMetalServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBareMetalServersRequest.class, CreateBareMetalServersResponse.class)
                .withName("CreateBareMetalServers")
                .withUri("/v1/{project_id}/baremetalservers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateBaremetalServersBody.class,
            f -> f.withMarshaller(CreateBareMetalServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse> deleteWindowsBareMetalServerPassword = genFordeleteWindowsBareMetalServerPassword();

    private static HttpRequestDef<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse> genFordeleteWindowsBareMetalServerPassword() {
        // basic
        HttpRequestDef.Builder<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWindowsBareMetalServerPasswordRequest.class, DeleteWindowsBareMetalServerPasswordResponse.class)
                .withName("DeleteWindowsBareMetalServerPassword")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-server-password")
                .withContentType("application/json");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteWindowsBareMetalServerPasswordRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> detachBaremetalServerVolume = genFordetachBaremetalServerVolume();

    private static HttpRequestDef<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> genFordetachBaremetalServerVolume() {
        // basic
        HttpRequestDef.Builder<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DetachBaremetalServerVolumeRequest.class, DetachBaremetalServerVolumeResponse.class)
                .withName("DetachBaremetalServerVolume")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/detachvolume/{attachment_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DetachBaremetalServerVolumeRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DetachBaremetalServerVolumeRequest::getAttachmentId, (req, v) -> {
                req.setAttachmentId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse> listBareMetalServerDetails = genForlistBareMetalServerDetails();

    private static HttpRequestDef<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse> genForlistBareMetalServerDetails() {
        // basic
        HttpRequestDef.Builder<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBareMetalServerDetailsRequest.class, ListBareMetalServerDetailsResponse.class)
                .withName("ListBareMetalServerDetails")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListBareMetalServerDetailsRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBareMetalServersRequest, ListBareMetalServersResponse> listBareMetalServers = genForlistBareMetalServers();

    private static HttpRequestDef<ListBareMetalServersRequest, ListBareMetalServersResponse> genForlistBareMetalServers() {
        // basic
        HttpRequestDef.Builder<ListBareMetalServersRequest, ListBareMetalServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBareMetalServersRequest.class, ListBareMetalServersResponse.class)
                .withName("ListBareMetalServers")
                .withUri("/v1/{project_id}/baremetalservers/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBareMetalServersRequest::getFlavor, (req, v) -> {
                req.setFlavor(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBareMetalServersRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBareMetalServersRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBareMetalServersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBareMetalServersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBareMetalServersRequest::getTags, (req, v) -> {
                req.setTags(v);
            })
        );
        builder.withRequestField("reservation_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBareMetalServersRequest::getReservationId, (req, v) -> {
                req.setReservationId(v);
            })
        );
        builder.withRequestField("detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBareMetalServersRequest::getDetail, (req, v) -> {
                req.setDetail(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBareMetalServersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse> listBaremetalFlavorDetailExtends = genForlistBaremetalFlavorDetailExtends();

    private static HttpRequestDef<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse> genForlistBaremetalFlavorDetailExtends() {
        // basic
        HttpRequestDef.Builder<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBaremetalFlavorDetailExtendsRequest.class, ListBaremetalFlavorDetailExtendsResponse.class)
                .withName("ListBaremetalFlavorDetailExtends")
                .withUri("/v1/{project_id}/baremetalservers/flavors")
                .withContentType("application/json");

        // requests
        builder.withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBaremetalFlavorDetailExtendsRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse> reinstallBaremetalServerOs = genForreinstallBaremetalServerOs();

    private static HttpRequestDef<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse> genForreinstallBaremetalServerOs() {
        // basic
        HttpRequestDef.Builder<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ReinstallBaremetalServerOsRequest.class, ReinstallBaremetalServerOsResponse.class)
                .withName("ReinstallBaremetalServerOs")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/reinstallos")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ReinstallBaremetalServerOsRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OsReinstallBody.class,
            f -> f.withMarshaller(ReinstallBaremetalServerOsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResetPwdOneClickRequest, ResetPwdOneClickResponse> resetPwdOneClick = genForresetPwdOneClick();

    private static HttpRequestDef<ResetPwdOneClickRequest, ResetPwdOneClickResponse> genForresetPwdOneClick() {
        // basic
        HttpRequestDef.Builder<ResetPwdOneClickRequest, ResetPwdOneClickResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetPwdOneClickRequest.class, ResetPwdOneClickResponse.class)
                .withName("ResetPwdOneClick")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-reset-password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetPwdOneClickRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResetPasswordBody.class,
            f -> f.withMarshaller(ResetPwdOneClickRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse> showBaremetalServerInterfaceAttachments = genForshowBaremetalServerInterfaceAttachments();

    private static HttpRequestDef<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse> genForshowBaremetalServerInterfaceAttachments() {
        // basic
        HttpRequestDef.Builder<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBaremetalServerInterfaceAttachmentsRequest.class, ShowBaremetalServerInterfaceAttachmentsResponse.class)
                .withName("ShowBaremetalServerInterfaceAttachments")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-interface")
                .withContentType("application/json");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBaremetalServerInterfaceAttachmentsRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse> showBaremetalServerTags = genForshowBaremetalServerTags();

    private static HttpRequestDef<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse> genForshowBaremetalServerTags() {
        // basic
        HttpRequestDef.Builder<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBaremetalServerTagsRequest.class, ShowBaremetalServerTagsResponse.class)
                .withName("ShowBaremetalServerTags")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/tags")
                .withContentType("application/json");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBaremetalServerTagsRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> showBaremetalServerVolumeInfo = genForshowBaremetalServerVolumeInfo();

    private static HttpRequestDef<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> genForshowBaremetalServerVolumeInfo() {
        // basic
        HttpRequestDef.Builder<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBaremetalServerVolumeInfoRequest.class, ShowBaremetalServerVolumeInfoResponse.class)
                .withName("ShowBaremetalServerVolumeInfo")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-volume_attachments")
                .withContentType("application/json");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBaremetalServerVolumeInfoRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowResetPwdRequest, ShowResetPwdResponse> showResetPwd = genForshowResetPwd();

    private static HttpRequestDef<ShowResetPwdRequest, ShowResetPwdResponse> genForshowResetPwd() {
        // basic
        HttpRequestDef.Builder<ShowResetPwdRequest, ShowResetPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResetPwdRequest.class, ShowResetPwdResponse.class)
                .withName("ShowResetPwd")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-resetpwd-flag")
                .withContentType("application/json");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowResetPwdRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTenantQuotaRequest, ShowTenantQuotaResponse> showTenantQuota = genForshowTenantQuota();

    private static HttpRequestDef<ShowTenantQuotaRequest, ShowTenantQuotaResponse> genForshowTenantQuota() {
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

    public static final HttpRequestDef<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> showWindowsBaremetalServerPwd = genForshowWindowsBaremetalServerPwd();

    private static HttpRequestDef<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> genForshowWindowsBaremetalServerPwd() {
        // basic
        HttpRequestDef.Builder<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWindowsBaremetalServerPwdRequest.class, ShowWindowsBaremetalServerPwdResponse.class)
                .withName("ShowWindowsBaremetalServerPwd")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-server-password")
                .withContentType("application/json");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowWindowsBaremetalServerPwdRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse> updateBaremetalServerMetadata = genForupdateBaremetalServerMetadata();

    private static HttpRequestDef<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse> genForupdateBaremetalServerMetadata() {
        // basic
        HttpRequestDef.Builder<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateBaremetalServerMetadataRequest.class, UpdateBaremetalServerMetadataResponse.class)
                .withName("UpdateBaremetalServerMetadata")
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/metadata")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateBaremetalServerMetadataRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            MetaData.class,
            f -> f.withMarshaller(UpdateBaremetalServerMetadataRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse> showSpecifiedVersion = genForshowSpecifiedVersion();

    private static HttpRequestDef<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse> genForshowSpecifiedVersion() {
        // basic
        HttpRequestDef.Builder<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSpecifiedVersionRequest.class, ShowSpecifiedVersionResponse.class)
                .withName("ShowSpecifiedVersion")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSpecifiedVersionRequest::getApiVersion, (req, v) -> {
                req.setApiVersion(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowJobInfosRequest, ShowJobInfosResponse> showJobInfos = genForshowJobInfos();

    private static HttpRequestDef<ShowJobInfosRequest, ShowJobInfosResponse> genForshowJobInfos() {
        // basic
        HttpRequestDef.Builder<ShowJobInfosRequest, ShowJobInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobInfosRequest.class, ShowJobInfosResponse.class)
                .withName("ShowJobInfos")
                .withUri("/v1/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowJobInfosRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );

        // response
        


        return builder.build();
    }

}
