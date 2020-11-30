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

    public static final HttpRequestDef<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> batchRebootBaremetalServers = genForbatchRebootBaremetalServers();

    private static HttpRequestDef<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> genForbatchRebootBaremetalServers() {
        // basic
        HttpRequestDef.Builder<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRebootBaremetalServersRequest.class, BatchRebootBaremetalServersResponse.class)
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

    public static final HttpRequestDef<CreateBareMetalServersRequest, CreateBareMetalServersResponse> createBareMetalServers = genForcreateBareMetalServers();

    private static HttpRequestDef<CreateBareMetalServersRequest, CreateBareMetalServersResponse> genForcreateBareMetalServers() {
        // basic
        HttpRequestDef.Builder<CreateBareMetalServersRequest, CreateBareMetalServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBareMetalServersRequest.class, CreateBareMetalServersResponse.class)
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

    public static final HttpRequestDef<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> detachBaremetalServerVolume = genFordetachBaremetalServerVolume();

    private static HttpRequestDef<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> genFordetachBaremetalServerVolume() {
        // basic
        HttpRequestDef.Builder<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DetachBaremetalServerVolumeRequest.class, DetachBaremetalServerVolumeResponse.class)
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/detachvolume/{attachment_id}");

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
                .withUri("/v1/{project_id}/baremetalservers/{server_id}");

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
                .withUri("/v1/{project_id}/baremetalservers/detail");

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
                .withUri("/v1/{project_id}/baremetalservers/flavors");

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
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-interface");

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

    public static final HttpRequestDef<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> showBaremetalServerVolumeInfo = genForshowBaremetalServerVolumeInfo();

    private static HttpRequestDef<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> genForshowBaremetalServerVolumeInfo() {
        // basic
        HttpRequestDef.Builder<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBaremetalServerVolumeInfoRequest.class, ShowBaremetalServerVolumeInfoResponse.class)
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-volume_attachments");

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
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-resetpwd-flag");

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
                .withUri("/v1/{project_id}/baremetalservers/limits");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> showWindowsBaremetalServerPwd = genForshowWindowsBaremetalServerPwd();

    private static HttpRequestDef<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> genForshowWindowsBaremetalServerPwd() {
        // basic
        HttpRequestDef.Builder<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWindowsBaremetalServerPwdRequest.class, ShowWindowsBaremetalServerPwdResponse.class)
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-server-password");

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

    public static final HttpRequestDef<WindowsBaremetalServerCleanPwdRequest, WindowsBaremetalServerCleanPwdResponse> windowsBaremetalServerCleanPwd = genForwindowsBaremetalServerCleanPwd();

    private static HttpRequestDef<WindowsBaremetalServerCleanPwdRequest, WindowsBaremetalServerCleanPwdResponse> genForwindowsBaremetalServerCleanPwd() {
        // basic
        HttpRequestDef.Builder<WindowsBaremetalServerCleanPwdRequest, WindowsBaremetalServerCleanPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, WindowsBaremetalServerCleanPwdRequest.class, WindowsBaremetalServerCleanPwdResponse.class)
                .withUri("/v1/{project_id}/baremetalservers/{server_id}/os-server-password");

        // requests
        builder.withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(WindowsBaremetalServerCleanPwdRequest::getServerId, (req, v) -> {
                req.setServerId(v);
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
                .withUri("/{api_version}");

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
                .withUri("/v1/{project_id}/jobs/{job_id}");

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
