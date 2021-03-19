package com.huaweicloud.sdk.antiddos.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.antiddos.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class AntiDDoSMeta {

    public static final HttpRequestDef<CreateDefaultConfigRequest, CreateDefaultConfigResponse> createDefaultConfig = genForcreateDefaultConfig();

    private static HttpRequestDef<CreateDefaultConfigRequest, CreateDefaultConfigResponse> genForcreateDefaultConfig() {
        // basic
        HttpRequestDef.Builder<CreateDefaultConfigRequest, CreateDefaultConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDefaultConfigRequest.class, CreateDefaultConfigResponse.class)
                .withName("CreateDefaultConfig")
                .withUri("/v1/{project_id}/antiddos/default-config")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DdosConfig.class,
            f -> f.withMarshaller(CreateDefaultConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<DeleteDefaultConfigRequest, DeleteDefaultConfigResponse> deleteDefaultConfig = genFordeleteDefaultConfig();

    private static HttpRequestDef<DeleteDefaultConfigRequest, DeleteDefaultConfigResponse> genFordeleteDefaultConfig() {
        // basic
        HttpRequestDef.Builder<DeleteDefaultConfigRequest, DeleteDefaultConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDefaultConfigRequest.class, DeleteDefaultConfigResponse.class)
                .withName("DeleteDefaultConfig")
                .withUri("/v1/{project_id}/antiddos/default-config")
                .withContentType("application/json");

        // requests

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowAlertConfigRequest, ShowAlertConfigResponse> showAlertConfig = genForshowAlertConfig();

    private static HttpRequestDef<ShowAlertConfigRequest, ShowAlertConfigResponse> genForshowAlertConfig() {
        // basic
        HttpRequestDef.Builder<ShowAlertConfigRequest, ShowAlertConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlertConfigRequest.class, ShowAlertConfigResponse.class)
                .withName("ShowAlertConfig")
                .withUri("/v2/{project_id}/warnalert/alertconfig/query")
                .withContentType("application/json");

        // requests

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowDefaultConfigRequest, ShowDefaultConfigResponse> showDefaultConfig = genForshowDefaultConfig();

    private static HttpRequestDef<ShowDefaultConfigRequest, ShowDefaultConfigResponse> genForshowDefaultConfig() {
        // basic
        HttpRequestDef.Builder<ShowDefaultConfigRequest, ShowDefaultConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDefaultConfigRequest.class, ShowDefaultConfigResponse.class)
                .withName("ShowDefaultConfig")
                .withUri("/v1/{project_id}/antiddos/default-config")
                .withContentType("application/json");

        // requests

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlertConfigRequest, UpdateAlertConfigResponse> updateAlertConfig = genForupdateAlertConfig();

    private static HttpRequestDef<UpdateAlertConfigRequest, UpdateAlertConfigResponse> genForupdateAlertConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAlertConfigRequest, UpdateAlertConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateAlertConfigRequest.class, UpdateAlertConfigResponse.class)
                .withName("UpdateAlertConfig")
                .withUri("/v2/{project_id}/warnalert/alertconfig/update")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateAlertConfigRequestBody.class,
            f -> f.withMarshaller(UpdateAlertConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListDDosStatusRequest, ListDDosStatusResponse> listDDosStatus = genForlistDDosStatus();

    private static HttpRequestDef<ListDDosStatusRequest, ListDDosStatusResponse> genForlistDDosStatus() {
        // basic
        HttpRequestDef.Builder<ListDDosStatusRequest, ListDDosStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDDosStatusRequest.class, ListDDosStatusResponse.class)
                .withName("ListDDosStatus")
                .withUri("/v1/{project_id}/antiddos")
                .withContentType("application/json");

        // requests
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDDosStatusRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDDosStatusRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDDosStatusRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDDosStatusRequest::getIp, (req, v) -> {
                req.setIp(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListDailyLogRequest, ListDailyLogResponse> listDailyLog = genForlistDailyLog();

    private static HttpRequestDef<ListDailyLogRequest, ListDailyLogResponse> genForlistDailyLog() {
        // basic
        HttpRequestDef.Builder<ListDailyLogRequest, ListDailyLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDailyLogRequest.class, ListDailyLogResponse.class)
                .withName("ListDailyLog")
                .withUri("/v1/{project_id}/antiddos/{floating_ip_id}/logs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("floating_ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDailyLogRequest::getFloatingIpId, (req, v) -> {
                req.setFloatingIpId(v);
            })
        );
        builder.withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDailyLogRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDailyLogRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDailyLogRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDailyLogRequest::getIp, (req, v) -> {
                req.setIp(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListDailyReportRequest, ListDailyReportResponse> listDailyReport = genForlistDailyReport();

    private static HttpRequestDef<ListDailyReportRequest, ListDailyReportResponse> genForlistDailyReport() {
        // basic
        HttpRequestDef.Builder<ListDailyReportRequest, ListDailyReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDailyReportRequest.class, ListDailyReportResponse.class)
                .withName("ListDailyReport")
                .withUri("/v1/{project_id}/antiddos/{floating_ip_id}/daily")
                .withContentType("application/json");

        // requests
        builder.withRequestField("floating_ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDailyReportRequest::getFloatingIpId, (req, v) -> {
                req.setFloatingIpId(v);
            })
        );
        builder.withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDailyReportRequest::getIp, (req, v) -> {
                req.setIp(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListNewConfigsRequest, ListNewConfigsResponse> listNewConfigs = genForlistNewConfigs();

    private static HttpRequestDef<ListNewConfigsRequest, ListNewConfigsResponse> genForlistNewConfigs() {
        // basic
        HttpRequestDef.Builder<ListNewConfigsRequest, ListNewConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNewConfigsRequest.class, ListNewConfigsResponse.class)
                .withName("ListNewConfigs")
                .withUri("/v2/{project_id}/antiddos/query-config-list")
                .withContentType("application/json");

        // requests

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListWeeklyReportsRequest, ListWeeklyReportsResponse> listWeeklyReports = genForlistWeeklyReports();

    private static HttpRequestDef<ListWeeklyReportsRequest, ListWeeklyReportsResponse> genForlistWeeklyReports() {
        // basic
        HttpRequestDef.Builder<ListWeeklyReportsRequest, ListWeeklyReportsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWeeklyReportsRequest.class, ListWeeklyReportsResponse.class)
                .withName("ListWeeklyReports")
                .withUri("/v1/{project_id}/antiddos/weekly")
                .withContentType("application/json");

        // requests
        builder.withRequestField("period_start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWeeklyReportsRequest::getPeriodStartDate, (req, v) -> {
                req.setPeriodStartDate(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowDDosRequest, ShowDDosResponse> showDDos = genForshowDDos();

    private static HttpRequestDef<ShowDDosRequest, ShowDDosResponse> genForshowDDos() {
        // basic
        HttpRequestDef.Builder<ShowDDosRequest, ShowDDosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDDosRequest.class, ShowDDosResponse.class)
                .withName("ShowDDos")
                .withUri("/v1/{project_id}/antiddos/{floating_ip_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("floating_ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDDosRequest::getFloatingIpId, (req, v) -> {
                req.setFloatingIpId(v);
            })
        );
        builder.withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDDosRequest::getIp, (req, v) -> {
                req.setIp(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowDDosStatusRequest, ShowDDosStatusResponse> showDDosStatus = genForshowDDosStatus();

    private static HttpRequestDef<ShowDDosStatusRequest, ShowDDosStatusResponse> genForshowDDosStatus() {
        // basic
        HttpRequestDef.Builder<ShowDDosStatusRequest, ShowDDosStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDDosStatusRequest.class, ShowDDosStatusResponse.class)
                .withName("ShowDDosStatus")
                .withUri("/v1/{project_id}/antiddos/{floating_ip_id}/status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("floating_ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDDosStatusRequest::getFloatingIpId, (req, v) -> {
                req.setFloatingIpId(v);
            })
        );
        builder.withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDDosStatusRequest::getIp, (req, v) -> {
                req.setIp(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowNewTaskStatusRequest, ShowNewTaskStatusResponse> showNewTaskStatus = genForshowNewTaskStatus();

    private static HttpRequestDef<ShowNewTaskStatusRequest, ShowNewTaskStatusResponse> genForshowNewTaskStatus() {
        // basic
        HttpRequestDef.Builder<ShowNewTaskStatusRequest, ShowNewTaskStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNewTaskStatusRequest.class, ShowNewTaskStatusResponse.class)
                .withName("ShowNewTaskStatus")
                .withUri("/v2/{project_id}/query-task-status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowNewTaskStatusRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<UpdateDDosRequest, UpdateDDosResponse> updateDDos = genForupdateDDos();

    private static HttpRequestDef<UpdateDDosRequest, UpdateDDosResponse> genForupdateDDos() {
        // basic
        HttpRequestDef.Builder<UpdateDDosRequest, UpdateDDosResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDDosRequest.class, UpdateDDosResponse.class)
                .withName("UpdateDDos")
                .withUri("/v1/{project_id}/antiddos/{floating_ip_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("floating_ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDDosRequest::getFloatingIpId, (req, v) -> {
                req.setFloatingIpId(v);
            })
        );
        builder.withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDDosRequest::getIp, (req, v) -> {
                req.setIp(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateAntiDDosServiceRequestBody.class,
            f -> f.withMarshaller(UpdateDDosRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

}
